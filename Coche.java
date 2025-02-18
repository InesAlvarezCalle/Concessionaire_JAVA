public class Coche {
    private int numBastidor;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    boolean revisar;
    private boolean[] revisiones = new boolean[5];

    Coche(){
        numBastidor = 0;
        matricula = "";
        marca = "";
        modelo = "";
        color = "";
        precio = 0.0;
        revisar = false;
    }

    Coche (int nb, String matr, String mar, String mod, String col, double prec, boolean rev, boolean[] revs){
        this.numBastidor = nb;
        this.matricula = matr;
        this.marca = mar;
        this.modelo = mod;
        this.color = col;
        this.precio = prec;
        this.revisar = rev;
        this.revisiones = revs;
    }

    public Coche(int nb, String matr, String mar, String mod, String col, double prec) {
        this.numBastidor = nb;
        this.matricula = matr;
        this.marca = mar;
        this.modelo = mod;
        this.color = col;
        this.precio = prec;
    }

    public void setNumBastidor(int nb){
        this.numBastidor = nb;
    }

    public int getNumBastidor(){
        return numBastidor;
    }

    public void setMatricula(String matr){
        this.matricula = matr;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMarca(String mar){
        this.marca = mar;
    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(String mod){
        this.modelo = mod;
    }

    public String getModelo(){
        return modelo;
    }

    public void setColor(String col){
        this.color = col;
    }

    public String getColor(){
        return color;
    }

    public void setPrecio(double prec){
        this.precio = prec;
    }

    public double getPrecio(){
        return precio;
    }

    public  void setRevisar(boolean rev){
        this.revisar = rev;
    }

    public boolean getRevisar(){
        return revisar;
    }

    public void setRevisiones(boolean[] revs){
        this.revisiones = revs;
    }

    public boolean[] getRevisiones(){
        return revisiones;
    }

    public void aumentarPrecioPorcentaje(double app){
        this.precio = this.precio * (1 + app);
    }

    public void mostrarInfo(){
        System.out.println();
        System.out.println("Número Bastidor: " + this.numBastidor);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.color);
        System.out.println("Precios: " + this.precio);
        System.out.println("Revisar: " + this.revisar);
        System.out.println("Revisiones:");

        for (int i = 0; i < 5; i++) {
            System.out.println(this.revisiones[i]);
        }

        System.out.println();
    }

    public boolean revisar(){
        for (int i = 0; i < revisiones.length; i++) {
            if(!revisiones[i]){
                revisiones[i] = true;
                return true;
            }
        }
        return false;
    }

    public void revisar(boolean[] revs){

    }

    public String toString(){
        return this.matricula + " - " + this.marca + " - " + this.modelo;
    }

}
