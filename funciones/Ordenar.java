package funciones;

import java.util.ArrayList;

public class Ordenar {
    public static void burbujeo(ArrayList<Integer> array){
        int dim = array.size();
        for (int i = 0; i < dim; i++){
            for (int j = 1; j < (dim - i); j++){
                /*if (array[j-1] < array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }*/
                if(array.get(j - 1) > array.get(j)){
                    int temp = array.get(j - 1);
                    array.set(j - 1, array.get(j));
                    array.set(j, temp);
                } 
            }
        }
    }
}
