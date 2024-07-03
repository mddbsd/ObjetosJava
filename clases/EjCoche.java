package clases;

public class EjCoche extends EjVehiculo {
    //Constructor
    private int modelo;
    private int cantPuertas;
    public EjCoche(String m, String c, int mo, int ca){
        super(m, c);
        this.modelo = mo;
        this.cantPuertas = ca;
    }
    //Metodos
    public void quemaRuedas(){
        System.out.println("Estoy quemando mis ruedas");
    }
}
