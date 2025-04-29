public class Foto {

    private String fichero;
    
    public Foto(String fichero){
        this.fichero = fichero;
    }

    public void mostrarImpresion(String color){
        System.out.println(fichero);
    }

}