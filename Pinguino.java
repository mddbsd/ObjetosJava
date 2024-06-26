public class Pinguino extends Ave{
    public Pinguino(){
        super();
    }
    public Pinguino(Sexo s){
        super(s);
    }
    @Override
    public void vuela(){
        System.out.println("No puedo volar amigo, soy un pinguino, estas loco?");
    }
}
