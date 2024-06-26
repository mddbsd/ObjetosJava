public class GatoImp extends Animal implements Mascota{
    private String codigo;
    public GatoImp (Sexo s, String c){
        super(s);
        this.codigo = c;
    }
    @Override
    public String getCodigo(){
        return this.codigo;
    }
    @Override
    public void hazRuido(){
        this.maulla();
        this.ronronea();
    }
    //Metodos Gatos
    public void maulla(){
        System.out.println("Miauaaaaaa");
    }
    public void ronronea(){
        System.out.println("Prrrrrr");
    }
    @Override
    public void come (String comida){
        if (comida.equals("pescado")){
            System.out.println("Gracias, me encanta el pescado");
        }else{
            System.out.println("Puajj, no como " + comida + " retirese humano");
        }
    }
    @Override
    public void peleaCon(Animal contrincante){
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
