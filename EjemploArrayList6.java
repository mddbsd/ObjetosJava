import java.util.ArrayList;
public class EjemploArrayList6 {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();
        a.add("rojo");
        a.add("verde");
        a.add("azul");
        a.add("blanco");
        a.add("amarillo");

        System.out.println("contenido de la lista");
        System.out.println(a);
        a.removeIf(palabra -> palabra.contains("a"));
        System.out.println("contenido de la lista despues de eliminar " +
                            "elementos que contengan la letra \"a");
        System.out.println(a);
    }
}
