import java.util.ArrayList;
public class EjemploArrayList4 {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();

        a.add("rojo");
        a.add("verde");
        a.add("azula");
        a.add("blanco");
        a.add("amarillo");
        a.add("blanco");
        System.out.println("Elementos de la lista:");
        for(String color : a){
            System.out.println(color);
        }
        if(a.contains("blanco")){
            System.out.println("El elemento esta en la lista");
        }
        a.remove("blanco");
        System.out.println("Contenido de la lista despues de quitar " +
                             "la primera ocurrencia del color blanco");
        for(String color : a){
            System.out.println(color);
        }        
        a.remove(2);        
        System.out.println("Contenido de la lista despues de quitar " +
                             "El elemento en la posicion 2");
        for(String color : a){
            System.out.println(color);
        }      
    }
}
