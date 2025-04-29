import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear fotos
        Foto[] fotos = { 
            new Foto("foto1.jpg"), 
            new Foto("foto2.jpg") 
        };

        // Crear productos
        Impresion impresion = new Impresion(1, "blanco", fotos);
        Camara camara = new Camara(2, "Canon", "EOS R10");

        // Crear cliente
        Cliente cliente = new Cliente("12345", "Juan Pérez");

        // Crear pedido
        Producto[] productos = { impresion, camara };
        Pedido pedido = new Pedido(cliente, productos, new Date(), 567890);

        // Mostrar pedido
        System.out.println(pedido);
    }
}
