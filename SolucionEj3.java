import java.util.Scanner;
import clases.EjBicicleta;
import clases.EjCoche;
import clases.EjVehiculo;

public class SolucionEj3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        boolean salida = false;
        int op;
        EjBicicleta miBici = new EjBicicleta("BMX", "rojo", 80);
        EjCoche miAuto = new EjCoche("Lambo", "amarillo", 2020, 2);
        do{
            System.out.println("Menu principal");
            System.out.println("1. Anda con la bici");
            System.out.println("2. Hacer willi con la bici");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema ruedas del coche");
            System.out.println("5. Ver kilometraje de bici");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Ver vehiculos creados");
            System.out.println("9. Salir");
            op = Integer.parseInt(s.nextLine());
            switch(op){
                case 1:
                    miBici.recorre(Integer.parseInt(s.nextLine()));
                    break;
                case 2:
                    miBici.hacerWilli();
                    break;
                case 3:
                    miAuto.recorre(Integer.parseInt(s.nextLine()));
                    break;
                case 4:
                    miAuto.quemaRuedas();
                    break;
                case 5:
                    System.out.println("La bici recorrio:");
                    System.out.println(miBici.getKilometrosRecorridos());
                    break;
                case 6:
                    System.out.println("El coche recorrio: ");
                    System.out.println(miAuto.getKilometrosRecorridos());
                    break;
                case 7:
                    System.out.println("Kilometros recorridos en total");
                    System.out.println(EjVehiculo.getKilometrosTotales());
                    break;
                case 8:
                    System.out.println("Vehiculos Creados");
                    System.out.println(EjVehiculo.getVehiculosCreados());
                    break;
                case 9:
                    salida = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta, ingrese nuevamente");
            }
        }while(!salida);
    }
}
