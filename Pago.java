public class Pago {
    protected double monto;
    protected String fecha;

    public Pago(double monto, String fecha) {
        this.monto = monto;
        this.fecha = fecha;
    }

    public double pagar() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Pago { monto: " + monto + ", fecha: " + fecha + " }";
    }
}

public class Efectivo extends Pago {
    private String descripcion;

    public Efectivo(double monto, String fecha, String descripcion) {
        super(monto, fecha);
        this.descripcion = descripcion;
    }

    @Override
    public double pagar() {
        return monto * 1.20; // Aplica 20% de recargo
    }

    @Override
    public String toString() {
        return "Efectivo { monto: " + monto + ", fecha: " + fecha + 
               ", descripcion: " + descripcion + " }";
    }
}

public class TarjetaCredito extends Pago {
    private long numero;

    public TarjetaCredito(double monto, String fecha, long numero) {
        super(monto, fecha);
        this.numero = numero;
    }

    @Override
    public double pagar() {
        return monto * 1.30; // Aplica 30% de recargo
    }

    @Override
    public String toString() {
        return "TarjetaCredito { monto: " + monto + ", fecha: " + fecha + 
               ", numero: " + numero + " }";
    }
}

public class EjecutarHerencia {
    public static void main(String[] args) {
        Pago pago1 = new Efectivo(1200.0, "2023-05-15", "Pago en efectivo por camiseta");
        Pago pago2 = new TarjetaCredito(610.0, "2023-05-16", 5708600094L);

        System.out.println(pago1);
        System.out.println("Total a pagar: " + pago1.pagar());
        
        System.out.println(pago2);
        System.out.println("Total a pagar: " + pago2.pagar());
    }
}