public class Balde {
    //Atributos
    private int capcaidad; // Capacidad maxima
    private int contenido; // Contenido actual en litros

    Balde(int c){
        this.capcaidad = c;
    }
    //Getters
    int getCapacidad(){
        return this.capcaidad;
    }
    int getContenido(){
        return this.contenido;
    }
    //Setters
    void setContenido(int litros){
        this.contenido = litros;
    }
    //Otros metodos
    void llena(){
        this.contenido = this.capcaidad;
    }
    void pinta(){
        for(int nivel = this.capcaidad; nivel > 0; nivel --){
            if(this.contenido >= nivel){
                System.out.println("#---------#");
            } else{
                System.out.println("#         #");
            }
        }
        System.out.println("##########");
    }


















}
