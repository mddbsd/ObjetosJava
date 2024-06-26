public class Gato extends Animal{

    private String raza;

    public Gato(Sexo s, String r){
        super(s);
        raza = r;
    }
    public Gato(Sexo s){
        super(s);
        raza = "siamés";
    }
    public Gato(String r){
        super(Sexo.HEMBRA);
        raza = r;
    }
    public Gato(){
        super(Sexo.HEMBRA);
        raza = "siamés";
    }
    public String toString(){
        return super.toString() + "Raza: " + this.raza + "\n******************\n";    
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
        void pelaCon(Gato contrincante){
            if (this.getSexo() == Sexo.HEMBRA){
                System.out.println("Las damicelas no peleamos");
            }else {
                if(contrincante.getSexo() == Sexo.HEMBRA){
                    System.out.println("No peleo contra hembras");
                } else {
                    System.out.println("SMASH POW KAPOW");
                }
            }
        }












}
