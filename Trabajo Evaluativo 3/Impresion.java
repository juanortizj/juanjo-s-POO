public class Impresion extends Producto {
    private String color;
    private Foto[] fotos;

    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    public String toString() {
        String resultado = "Impresion { numero: " + numero + ", color: " + color + ", fotos: ";
        for (Foto foto : fotos) {
            resultado += foto + " ";
        }
        resultado += "}";
        return resultado;
    }
}