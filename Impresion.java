public class Impresion {

    private String color;
    private String foto;

    public Impresion(String color, String foto){
        this.color = color;
        this.foto = foto;
    }

    public String toString(){
        return "Impresion { color: " + color + " foto: " + foto + " }";
    }
}