package clases;

public class Calumno extends Cpersona{
    //Atributo de clase
    private static double promedioTotal;
    //Atributo de instancia

    private String materia;
    private int legajo;
    private int nota1;
    private int nota2;
    private int nota3;
    private double promedio;
    //Constructor
    public Calumno(String nom, String ape, int dni, String mat, int leg){
        super(nom, ape, dni);
        this.materia = mat;
        this.legajo = leg;
    }
    //Setters
    public void setNota1(int n){
        this.nota1 = n;
    }
    public void setNota2(int n){
        this.nota2 = n;
    }
    public void setNota3(int n){
        this.nota3 = n;
    }

    //Getters
    public String getMateria(){
        return this.materia;
    }
    public int getLegajo(){
        return this.legajo;
    }
    public String toString(){
        return super.toString() +
                "Materia: " + this.materia + "\n" +
                "Legajo: " + this.legajo + "\n";
    }
}
