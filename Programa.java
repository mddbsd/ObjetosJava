public class Programa{
    public static void main(String[] args){
        Libro harryPotter = new Libro();
        Libro quijote = new Libro();
        Libro miLibro = new Libro();

        harryPotter.autor = "JK Rowling";
        harryPotter.titulo = "Piedra filosofal";
        harryPotter.cantidadPaginas = 500;
        harryPotter.isbn = "ASD135";

        quijote.autor = "Miguel de Cervantes";
        quijote.cantidadPaginas = 400;
        quijote.isbn = "GHF252";
        quijote.titulo = "Quijote de la mancha";

        miLibro.titulo = "El caso de charles dexter ward";
        miLibro.autor = "H.P. Lovecraft";
        miLibro.cantidadPaginas = 200;
        miLibro.isbn = "jjj999";

        System.out.println("Atributos de instancia quijote");
        System.out.println("Titulo: " + quijote.titulo);
        System.out.println("Autor: " + quijote.autor);
        System.out.println("N paginas: " + quijote.cantidadPaginas);
        System.out.println("ISBN: " + quijote.isbn);

        System.out.println("Atributos de instancia harryPotter");
        System.out.println("Titulo: " + harryPotter.titulo);
        System.out.println("Autor: " + harryPotter.autor);
        System.out.println("N paginas: " + harryPotter.cantidadPaginas);
        System.out.println("ISBN: " + harryPotter.isbn);

        System.out.println("Atributos de instancia miLibro");
        System.out.println("Titulo: " + miLibro.titulo);
        System.out.println("Autor: " + miLibro.autor);
        System.out.println("N paginas: " + miLibro.cantidadPaginas);
        System.out.println("ISBN: " + miLibro.isbn);
    }
}