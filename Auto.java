public class Auto {
    //Atributos
    private String marca;
    private String modelo;
    private String patente;
    private String color;
    //Metodos
    //Setters
    void setMarca(String m){
        this.marca = m;
    }
    void setModelo(String m){
        this.modelo = m;
    }
    void setPatente(String p){
        this.patente = p;
    }
    void setColor(String c){
        this.color = c;
    }

    //Getters
    String getMarca(){
        return this.marca;
    }
    String getModelo(){
        return this.modelo;
    }
    String getPatente(){
        return this.patente;
    }
    String getColor(){
        return this.color;
    }
    void arranca(){
        System.out.println("Motor encendido");
    }
    void acelera(int v){
        System.out.println("Acelerando a " + v + " kmh");
    }
    void tocaBocina(){
        System.out.println("Beep Beep");
    }
}
