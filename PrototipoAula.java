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
                    for(int i = 0; i < vAlus.length; i++){
                        String nom;
                        String ape;
                        String mat;
                        int dni;
                        int leg;
                        System.out.println("Nombre: ");
                        nom = s.nextLine();
                        System.out.println("Apellido: ");
                        ape = s.nextLine();
                        System.out.println("Materia: ");
                        mat = s.nextLine();
                        System.out.println("DNI: ");
                        dni = Integer.parseInt(s.nextLine());
                        System.out.println("Legajo");
                        leg = Integer.parseInt(s.nextLine());
                        vAlus[i] = new Calumno(nom, ape, dni, mat, leg);
                    }
                    break;
                case 2:
                    salida = true;
                    break;
                default:
            }
        }while(!salida);
   } 
}
