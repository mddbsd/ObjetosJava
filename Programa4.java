public class Programa4 {
    public static void main(String[] args){
        Balde baldecito = new Balde(4);
        Balde baldesote = new Balde(8);
        System.out.println("Baldecito vacio");
        baldecito.pinta();
        System.out.println("Baldecito lleno");
        baldecito.llena();
        baldecito.pinta();
        System.out.println("Baldesote vacio");
        baldesote.pinta();
        System.out.println("Baldesote lleno");
        baldesote.llena();
        baldesote.pinta();
        baldesote.vacia();
        System.out.println("Vuelco el contenido de baldecito en baldesote");
        baldecito.vuelcaEn(baldesote);
        baldesote.pinta();
    }
}
