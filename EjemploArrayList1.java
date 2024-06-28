import java.util.ArrayList;
public class EjemploArrayList1 {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();

        System.out.println("Cantidad de elemtos: " + a.size());

        a.add("rojo");
        a.add("verde");
        a.add("azul");

        System.out.println("Cantidad de elemtos: " + a.size());

        a.add("blanco");

        System.out.println("Cantidad de elemtos: " + a.size());
    
        System.out.println("Elemento en posicion 0: " + a.get(0));
        System.out.println("Elemento en posicion 3: " + a.get(3));

    }
}
