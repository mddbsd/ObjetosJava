package clases;

public abstract class Cpersona {
    //Atributos de instancia
    private String nombre;
    private String apellido;
    private int dni;
    //Constructor
    Cpersona(String nom, String ape, int dni){
        this.nombre = nom;
        this.apellido = ape;
        this.dni = dni;
    }
    //getters
    public String getNombre(){
        return this.nombre;
    }
    public  String getApellido(){
        return this.apellido;
    }
    public int getDni(){
        return this.dni;
    }


}
