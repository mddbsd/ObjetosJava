public class Programa3 {
    public static void main(String[] args){
        GatoSimple garfield = new GatoSimple("macho");
        GatoSimple lisa = new GatoSimple();
        GatoSimple tom = new GatoSimple("Macho", "gris");

        System.out.println("Hola gato");
        garfield.maulla();
        System.out.println("Toma, comete una manzana");
        garfield.come("manzana");
        System.out.println("Toma pescado");
        garfield.come("pescado");

        System.out.println("Tom, toma sopa");
        tom.come("sopa");

        System.out.println("Maullen gatos");
        garfield.maulla();
        lisa.maulla();
        tom.maulla();

        garfield.pelaCon(lisa);
        lisa.pelaCon(tom);
        tom.pelaCon(garfield);


    }   
}
