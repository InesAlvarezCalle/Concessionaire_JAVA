import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int opcion;
        boolean[] revs = new boolean[5];
        ArrayList<Coche> coches = new ArrayList<>();

        do {
            System.out.println("------------------------------------");
            System.out.println("MENÚ");
            System.out.println("------------------------------------");
            System.out.println("1. Propuesto");
            System.out.println("2. Información vehículo");
            System.out.println("3. Alta vehículo");
            System.out.println("4. Baja vehículo");
            System.out.println("5. Imprimir todos los vehículos");
            System.out.println("6. Borrado total");
            System.out.println("7. Salir");
            System.out.println("------------------------------------");

            opcion = Leer.leerEntero("Introduce la opción que desea utilizar: ");

            if (opcion == 1) {
                boolean[] revisionesIniciales = {false, false, false, false, false};
                Coche cocheNu = new Coche(11111, "4567DCF", "Ford", "Focus", "Negro", 18000.0, false, revisionesIniciales);

                cocheNu.aumentarPrecioPorcentaje(0.03);

                System.out.println("Información del coche nuevo:");
                cocheNu.mostrarInfo();

                Coche2mano cocheAnt = new Coche2mano(22222, "2789GHF", "BMW", "Serie 3", "Blanco", 12000.0, 100000, 7);

                System.out.println("Información del coche de segunda mano:");
                cocheAnt.mostrarInfo();

                coches.add(cocheNu);
                coches.add(cocheAnt);
                coches.add(new Coche(33333, "1101JKL", "Mazda", "CX-5", "Gris", 22000.0, false, revisionesIniciales));
                coches.add(new Coche2mano(44444, "2022MNL", "Audi", "A4", "Rojo", 14000.0, 85000, 6));

                System.out.println("Mostrando información de todos los coches:");
                for (Coche coche : coches) {
                    coche.mostrarInfo();
                }

                System.out.println("Lista de coches:");
                for (Coche coche : coches) {
                    System.out.println(coche);
                }

                System.out.println("\nPasando las revisiones...");
                cocheNu.revisar();
                cocheAnt.revisar();
                System.out.println("Revisiones pasadas");

                System.out.println("\nComprobando kilómetros:");
                mostrarKms(cocheNu);
                mostrarKms(cocheAnt);

            } else if (opcion == 2) {
                int n;

                n = Leer.leerEntero("Introduzca el número de coche a mostrar: ");
                if(n < 1 || n > coches.size()){
                    System.out.println("\nERROR: No está en la lista\n");
                } else {
                    System.out.println(coches.get(n-1));
                }

            } else if (opcion == 3) {
                coches.add(new Coche( Leer.leerEntero("Número bastidor: "),
                        Leer.leerTexto("Introduzca la matrícula: "),
                        Leer.leerTexto("Introduce la marca: "),
                        Leer.leerTexto("Introduce la modelo: "),
                        Leer.leerTexto("Introduce el color: "),
                        Leer.leerDouble("Introduce el precio: "),
                        true,
                        revs
                        ));

            } else if (opcion == 4) {
                int n = Leer.leerEntero("Introduce el número de coche a eliminar: ");

                n = Leer.leerEntero("Introduzca el número de coche a mostrar: ");
                if(n < 1 || n > coches.size()){
                    System.out.println("\nERROR: No está en la lista\n");
                } else {
                    coches.remove(n -1);
                    System.out.println("Borrado finalizado");
                }

            }
            else if (opcion == 5) {
                for (int i = 0; i < coches.size(); i++) {
                    System.out.println(coches.get(i));
                }

            } else if (opcion == 6) {
                System.out.println("Borrando datos...");
                coches.clear();
                System.out.println("Borrado finalizado");

            } else if (opcion == 7) {
                System.out.println("Saliendo del programa...");
                break;

            } else {
                System.out.println("\nERROR: El valor introducido no es válido.\n");
            }

        } while (opcion != 7);

    }

    public static void mostrarKms(Coche coche) {
        if (coche instanceof Coche2mano) {
            System.out.println("Kilómetros del coche: " + ((Coche2mano) coche).getKm());
        } else {
            System.out.println("Coche nuevo, con 0 km");
        }
    }
}