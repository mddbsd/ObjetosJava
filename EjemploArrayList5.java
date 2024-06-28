import java.util.ArrayList;
public class EjemploArrayList5 {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();

        a.add("rojo");
        a.add("verde");
        a.add("azul");
        a.add("blanco");
        a.add("amarillo");
        System.out.println("Elementos del vector");
        System.out.println(a);

        a.set(2,"turquesa");
        System.out.println("Elementos del vector luego de" +
                             " insertar en posicion 2 el color turquesa");
        System.out.println(a);
        a.add(2,"marron");
        System.out.println("Elementos del vector luego de" + 
                            "insertar un nuevo elemento");
        System.out.println(a);
        
    }
}
