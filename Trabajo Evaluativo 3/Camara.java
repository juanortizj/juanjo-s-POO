public class Camara extends Producto {
    private String marca;
    private String modelo;

    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String toString() {
        return "Camara { numero: " + numero + ", marca: " + marca + ", modelo: " + modelo + " }";
    }
}