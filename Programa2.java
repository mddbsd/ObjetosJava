public class Programa2 {
    public static void main(String[] args){
        Auto miAuto = new Auto();

        miAuto.setMarca("lamborgini");
        miAuto.setModelo("Diablo");
        miAuto.setColor("Amarillo");
        miAuto.setPatente("ABC123");
        System.out.println("Atributos de instancia miAuto");
        System.out.println("Marca: " + miAuto.getMarca());
        System.out.println("Modelo: " + miAuto.getModelo());
        System.out.println("Color: " + miAuto.getColor());
        System.out.println("Patente: " + miAuto.getPatente());

        System.out.println("Tocar bocina:");
        miAuto.tocaBocina();
        System.out.println("Arranca");
        miAuto.arranca();
        System.out.println("Acelerar");
        miAuto.acelera(150);
    }
}
