import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        boolean[] revisionesIniciales = {false, false, false, false, false};
        Coche cocheNu = new Coche(11111, "4567DCF", "Ford", "Focus", "Negro", 18000.0, false, revisionesIniciales);

        cocheNu.aumentarPrecioPorcentaje(0.03);

        System.out.println("Información del coche nuevo:");
        cocheNu.mostrarInfo();

        Coche2mano cocheAnt = new Coche2mano(22222, "2789GHF", "BMW", "Serie 3", "Blanco", 12000.0, 100000, 7);

        System.out.println("Información del coche de segunda mano:");
        cocheAnt.mostrarInfo();

        Coche[] coches = new Coche[4];
        coches[0] = cocheNu;
        coches[1] = cocheAnt;
        coches[2] = new Coche(33333, "1101JKL", "Mazda", "CX-5", "Gris", 22000.0, false, revisionesIniciales);
        coches[3] = new Coche2mano(44444, "2022MNL", "Audi", "A4", "Rojo", 14000.0, 85000, 6);


        System.out.println("Realizando revisiones al coche nuevo:");
        while (coches[0].revisar()) {
            System.out.println("Se ha realizado una revisión.");
        }


        System.out.println("Mostrando información de todos los coches:");
        for (Coche coche : coches) {
            coche.mostrarInfo();
        }

        System.out.println("Lista de coches:");
        for (Coche coche : coches) {
            System.out.println(coche);
        }

        System.out.println("\nComprobando kilómetros:");
        Coche.mostrarKms(cocheNu);
        Coche.mostrarKms(cocheAnt);
    }
}