public class Programa6 {
    public static void main(String[] args){
        Coche cocheDeLuis = new Coche("Lambo", "2019");
        Coche cocheDeJuan = new Coche("Fiat", "palio");

        cocheDeLuis.recorre(30);
        cocheDeLuis.recorre(40);
        cocheDeLuis.recorre(220);
        cocheDeJuan.recorre(60);
        cocheDeJuan.recorre(150);
        cocheDeJuan.recorre(90);
        System.out.println("El coche de luis recorrio " + cocheDeLuis.getKilometraje() + "km");
        System.out.println("El coche de Juan recorrio " + cocheDeJuan.getKilometraje() + "km");
        System.out.println("El kilometraje total fue de " + Coche.getKilometrajeTotal() + "km");
    }
}
