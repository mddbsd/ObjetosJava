import java.util.ArrayList;
public class EjemploArrayList2 {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(18);
        a.add(22);
        a.add(-30);

        System.out.println("Cantidad de elemntos: " + a.size());
        System.out.println("Elemento en posicion 1: " + a.get(1));
    }
}
