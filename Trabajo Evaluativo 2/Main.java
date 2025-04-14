public class Main {
    public static void main(String[] args) {
        Equipaje[] listaDeEquipajes = new Equipaje[5];
        listaDeEquipajes[0] = new Bodega(100.0, 10.0); 
        listaDeEquipajes[1] = new Bodega(200, 5.0);    
        listaDeEquipajes[2] = new Cabina(150, 20.0);   
        listaDeEquipajes[3] = new Cabina(5.0, 3.0);     
        listaDeEquipajes[4] = new Bodega(7.0, 2.0);     


        CalculadorPrecioTotal solucion = new CalculadorPrecioTotal(listaDeEquipajes);
        solucion.mostrarInformeDePrecios(); 
    }
}