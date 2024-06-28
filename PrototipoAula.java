import clases.Calumno;
import clases.Cdocente;
import java.util.Scanner;
public class PrototipoAula {
    public static void main(String[] args){
        boolean salida = false;
        int op;
        Scanner s = new Scanner(System.in);
        Calumno[] vAlus = new Calumno[5];
        do{
            System.out.println("MENU DE OPCIONES:");
            System.out.println("1. Ingresar alumnos");
            op = s.nextInt();
            switch(op){
                case 1:

                    break;
                case 2:
                    salida = true;
                    break;
                default:
            }
        }while(!salida);
   } 
}
