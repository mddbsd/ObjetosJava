import java.util.ArrayList;
public class EjemploArrayList7 {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(20);
        a.add(7);
        a.add(14);
        a.add(32);
        a.add(3);
        System.out.println("Elementos de la lista");
        System.out.println(a);
        a.removeIf(numero -> numero < 10);
        System.out.println("Elementos de la lista luego de eliminar " + 
                            "los elementos menores a 10");
        System.out.println(a);
    }
}
