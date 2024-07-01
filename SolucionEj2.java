import java.util.ArrayList;
import funciones.Ordenar;
public class SolucionEj2 {
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < (int)((Math.random() * 30) + 10); i ++){
            int num = (int)(Math.random() * 101);
            lista.add(num);
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
            suma += num;
        }
        System.out.println("Tamaño de la lista " + lista.size());
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + suma / lista.size());
        System.out.println("Valor maximo: " + max);
        System.out.println("Valor minimo: " + min);
        System.out.println("Lista Desordenada");
        System.out.println(lista);
        System.out.println("Lista Burbujeada: ");
        Ordenar.burbujeo(lista);
        System.out.println(lista);
    }
}









