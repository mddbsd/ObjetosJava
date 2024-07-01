import clases.Calumno;
import clases.Cdocente;
import funciones.Menues;
import funciones.Validaciones;
import funciones.Ordenar;
import java.util.ArrayList;
import java.util.Scanner;
public class PrototipoAula {
    public static void main(String[] args){
        boolean salida = false;
        int op;
        Scanner s = new Scanner(System.in);
        ArrayList<Calumno> vAlus = new ArrayList<Calumno>();
        do{
            Menues.menuPrincipal();
            op = Integer.parseInt(s.nextLine());
            switch(op){
                case 1:
                    boolean flag = false;
                    do{
                        System.out.println("Ingrese Nombre: ");
                        String nom = s.nextLine();
                        System.out.println("Ingrese Apellido: ");
                        String ape = s.nextLine();
                        System.out.println("Ingrese DNI: ");
                        int DNI = Integer.parseInt(s.nextLine());
                        System.out.println("Ingrese Materia :");
                        String mat = s.nextLine();
                        int leg = (int)(Math.random() * 101);
                        vAlus.add(new Calumno(nom, ape, DNI, mat, leg));
                        System.out.println("Desea ingresar mas alumnos?");
                        String cont = Validaciones.validaSiNo();
                        if (cont.equals("no")){
                            flag = true;
                        }
                    }while(!flag);
                    break;
                case 2:
                    for(Calumno aux : vAlus){
                        System.out.println(aux);
                    }
                    break;
                case 3:
                    salida = true;
                    break;
                default:
            }
        }while(!salida);
   } 
}
