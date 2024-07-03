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
        String nombreIngresado;
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
                    System.out.println("Ingrese nombre del alumno");
                    nombreIngresado = s.nextLine();
                    //Recorre el arraylist buscando el nombre ingresado
                    for(int i = 0; i < vAlus.size(); i++){
                        //Encadenamiento de metodos
                        //Para encontrar un elemento, encadenamos multiples metodos
                        //vAlus.get(i): obtiene la instancia ubicada en el indice i
                        //.getNombre(): obtiene el atributo nombre de la instancia en el indice i
                        //.equals(nombreIngresado): compara la variable nombre ingresado con la cadena
                        //      que devuelve el metodo .equals().
                        //      Si coinciden, devuelve verdadero y pide las notas.
                        if(vAlus.get(i).getNombre().equals(nombreIngresado)){
                            System.out.println("Alumno encontrado en posicion " + i);
                            System.out.print("Ingrese nota1: ");
                            vAlus.get(i).setNota1(Integer.parseInt(s.nextLine()));
                            System.out.print("Ingrese nota2: ");
                            vAlus.get(i).setNota2(Integer.parseInt(s.nextLine()));
                            System.out.print("Ingrese nota3: ");
                            vAlus.get(i).setNota3(Integer.parseInt(s.nextLine()));
                            vAlus.get(i).calculaPromedio();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese nombre del alumno");
                    nombreIngresado = s.nextLine();
                    for(int i = 0; i < vAlus.size(); i++){
                        if(vAlus.get(i).getNombre().equals(nombreIngresado)){
                            System.out.println("promedio de " + vAlus.get(i).getNombre());
                            System.out.println(vAlus.get(i).getPromedio());
                        }
                    }
                    break;
                case 5:
                    salida = true;
                    break;
                default:
            }
        }while(!salida);
   } 
}
