public class Cliente {

    private String Cedula;
    private String nombre;

    public Cliente(String Cedula, String nombre){
        this.Cedula = Cedula;
        this.nombre = nombre;
    }
    
    public void mostrarProducto(Producto Producto){
        System.out.println(Producto);
    }

    public String toString(){
        return "Cliente { Cedula: " + Cedula + " nombre " + nombre + " }";
    }
}