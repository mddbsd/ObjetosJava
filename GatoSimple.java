public class GatoSimple {
    //Atributos
    private String color;
    private String raza;
    private String sexo;
    private int edad;
    private double peso;
    //Constructores
    GatoSimple(){
        this.sexo = "hembra";
    }
    GatoSimple(String s){
        this.sexo = s;
    }
    GatoSimple(String s, String c){
        this.sexo = s;
        this.color = c;
    }
    //Getters
    String getSexo(){
        return this.sexo;
    }
    String getColor(){
        return this.color;
    }
    //Metodos Gatos
    void maulla(){
        System.out.println("Miauaaaaaa");
    }
    void ronronea(){
        System.out.println("Prrrrrr");
    }
    void come (String comida){
        if (comida.equals("pescado")){
            System.out.println("Gracias, me encanta el pescado");
        }else{
            System.out.println("Puajj, no como " + comida + " retirese humano");
        }
    }
    void pelaCon(GatoSimple contrincante){
        if (this.sexo.equals("hembra")){
            System.out.println("Las damicelas no peleamos");
        }else {
            if(contrincante.getSexo().equals("hembra")){
                System.out.println("No peleo contra hembras");
            } else {
                System.out.println("SMASH POW KAPOW");
            }
        }
    }

}
