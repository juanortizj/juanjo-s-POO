public class Equipaje {
    protected static final double PRECIO_ESTANDAR = 1000.0;

    protected double peso;
    protected double tamanio;

    public Equipaje(double peso, double tamanio) {
        this.peso = peso;
        this.tamanio = tamanio;
    }

    public double calcularPrecio() {
        return PRECIO_ESTANDAR;
    }
}

class Bodega extends Equipaje {
    private static final double PESO_MAXIMO = 8.0;
    private static final double TARIFA_EXCESO_PESO = 500.0; // <--- Cambiado a 500

    public Bodega(double peso, double tamanio) {
        super(peso, tamanio);
    }

    
    public double calcularPrecio() {
        double precioCalculado = PRECIO_ESTANDAR;
        if (peso > PESO_MAXIMO) {
            double exceso = peso - PESO_MAXIMO;
            precioCalculado += exceso * TARIFA_EXCESO_PESO;
        }
        return precioCalculado;
    }
}

class Cabina extends Equipaje {
    private static final int TIEMPO_PROMEDIO_ESPERA = 2;
    private static final double DESCUENTO_POR_ESPERA = 570.0;

    public Cabina(double peso, double tamanio) {
        super(peso, tamanio);
    }

    
    public double calcularPrecio() {
        return Math.max(8090, PRECIO_ESTANDAR - (TIEMPO_PROMEDIO_ESPERA * DESCUENTO_POR_ESPERA));
    }
}

class CalculadorPrecioTotal {
    private Equipaje[] listaDeEquipajes;

    public CalculadorPrecioTotal(Equipaje[] listaDeEquipajes) {
        this.listaDeEquipajes = listaDeEquipajes;
    }

    public void mostrarInformeDePrecios() {
        double totalGeneral = 0;
        double totalBodega = 0;
        double totalCabina = 0;

        for (Equipaje equipaje : listaDeEquipajes) {
            double precio = equipaje.calcularPrecio();
            totalGeneral += precio;

            if (equipaje instanceof Bodega) {
                totalBodega += precio;
            } else if (equipaje instanceof Cabina) {
                totalCabina += precio;
            }
        }

        System.out.println("\n--- Totales ---");
        System.out.printf("Total General: $%.0f\n", totalGeneral);
        System.out.printf("Total Bodega: $%.0f\n", totalBodega);
        System.out.printf("Total Cabina: $%.0f\n", totalCabina);
    }
}