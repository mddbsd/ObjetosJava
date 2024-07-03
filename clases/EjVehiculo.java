package clases;

public abstract class EjVehiculo {
    //Atributos de clase
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;
    //Metodos de clase
    public static int getKilometrosTotales(){
        return kilometrosTotales;
    }
    public static int getVehiculosCreados(){
        return vehiculosCreados;
    }
    //Atributos de instancia
    private int kilometrosRecorridos;
    private String color;
    private String marca;
    //Constructor
    public EjVehiculo(String marca, String color){
        this.marca = marca;
        this.color = color;
        this.vehiculosCreados ++;
        this.kilometrosRecorridos = 0;
    }
    //Getters
    public int getKilometrosRecorridos(){
        return this.kilometrosRecorridos;
    }
    //Metodos de instancia
    public void setKilometrosRecorridos(int km){
        this.kilometrosRecorridos += km;
    }
    public void recorre(int km){
        this.kilometrosRecorridos += km;
        kilometrosTotales += km;
    }
}
