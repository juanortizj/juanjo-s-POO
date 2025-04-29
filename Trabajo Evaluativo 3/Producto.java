public class Producto {
    protected int numero;

    public Producto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String toString() {
        return "Producto { numero: " + numero + " }";
    }
}