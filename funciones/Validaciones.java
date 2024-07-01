package funciones;
import java.util.Scanner;
public class Validaciones {
    public static String validaSiNo(){
        Scanner s = new Scanner(System.in);
        String siNo = s.nextLine();
        while (!siNo.equals("si") && !siNo.equals("no")) {
            System.out.println("Opcion incorrecta, ingrese si o no");
            siNo = s.nextLine();
        }
        return siNo;
    }
}
