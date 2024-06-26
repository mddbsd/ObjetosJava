public class Programa7 {
    public static void main(String[] args){
        Mascota garfield = new GatoImp(Sexo.MACHO, "7632");
        Mascota lisa = new GatoImp(Sexo.HEMBRA, "9125");
        Mascota vera = new PerroImp(Sexo.HEMBRA, "7635");
        Mascota gaucho = new PerroImp(Sexo.MACHO, "8632");
        System.out.println(garfield.getCodigo());
        System.out.println(lisa.getCodigo());
        System.out.println(vera.getCodigo());
        System.out.println(gaucho.getCodigo());
        garfield.come("pescado");
        lisa.come("sopa");
        vera.come("pescado");
        lisa.peleaCon((GatoImp)garfield);
        gaucho.peleaCon((PerroImp)vera);

    }
}
