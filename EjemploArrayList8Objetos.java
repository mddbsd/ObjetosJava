import java.util.ArrayList;
public class EjemploArrayList8Objetos {
    public static void main(String[] args){
        ArrayList<Gato> g = new ArrayList<Gato>();

        g.add(new Gato("Garfield","Angora",Sexo.MACHO));
        g.add(new Gato("Lisa","Esfinge",Sexo.HEMBRA));
        g.add(new Gato("Tom","Siames",Sexo.MACHO));
        g.add(new Gato("Sara","Angora",Sexo.HEMBRA));

        for(Gato gatoAux : g){
            System.out.println(gatoAux + "\n");
        }

        g.add(2, new Gato("Macri", "gatogato", Sexo.MACHO));

        for(Gato gatoAux : g){
            System.out.println(gatoAux + "\n");
        }
    }
}
