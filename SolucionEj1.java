import java.util.ArrayList;
public class SolucionEj1 {
    public static void main(String[] args){
        ArrayList<String> personajes = new ArrayList<String>();

        personajes.add("Goku");
        personajes.add("Homero");
        personajes.add("Saaaaanic");
        personajes.add("Vegeta");
        personajes.add("Seiya");
        personajes.add("Inuyasha");

        for(String nombre : personajes){
            System.out.println(nombre);
        }
    }
}
