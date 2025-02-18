public class Coche2mano extends Coche {
    private int km;
    private int anios;

    public Coche2mano(){
        super();
        this.km = 0;
        this.anios = 0;
    }

    public Coche2mano(int nb, String matr, String mar, String mod, String col, double prec, int km, int anios){
        super(nb, matr, mar, mod, col, prec);
        this.km = km;
        this.anios = anios;
    }

    public void setKm(int km){
        this.km = km;
    }

    public void setAnios(int anios){
        this.anios = anios;
    }

    public int getKm(){
        return km;
    }

    public int getAnios(){
        return anios;
    }

    public void mostrarInfo(){
        System.out.println();
        System.out.println("Número Bastidor: " + getNumBastidor());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Color: " + getColor());
        System.out.println("Precios: " + getPrecio());
        System.out.println("Revisar: " + getRevisar());
        System.out.println("Revisiones:");

        for (int i = 0; i < 5; i++) {
            System.out.println(getRevisiones()[i]);
        }
        System.out.println("Kilómetros: " + this.km);
        System.out.println("Años: " + this.anios);
        System.out.println();
    }


}
