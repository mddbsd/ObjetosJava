package clases;

public class EjBicicleta extends EjVehiculo{
    //Atributos
    private int rodado;
    //Constructor
    public EjBicicleta(String m, String c, int r){
        super(m, c);
        this.rodado = r;
    }
    //Metodos
    public void hacerWilli(){
        System.out.println("Estoy haciendo willi");
    }
}
