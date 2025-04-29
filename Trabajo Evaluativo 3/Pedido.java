import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] productos, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public String toString() {
        String resultado = "Pedido {\n  Cliente: " + cliente +
                "\n  Fecha: " + fecha +
                "\n  Tarjeta: ****" + String.valueOf(numeroTarjetaCredito).substring(String.valueOf(numeroTarjetaCredito).length() - 4) +
                "\n  Productos:\n";

        for (Producto producto : productos) {
            resultado += "    - " + producto + "\n";
        }
        resultado += "}";
        return resultado;
    }
}