public class Programa8 {
    public static void main(String[] args){
        //Define nla estructura
        //pero no crea los objetos
        Alumno[] alus = new Alumno[5];
        System.out.println("Introduza el nombre y la nota media de 5 alumnos");
        String nombreIngresado;
        double notaIngresada;
        for(int i = 0; i < alus.length; i ++){
            //creamos el objeo vacio
            alus[i] = new Alumno();
            System.out.println("Alumno: " + i);
            System.out.print("Nombre: "); 
            nombreIngresado = System.console().readLine();
            alus[i].setNombre(nombreIngresado);
            System.out.print("Nota Media: ");
            notaIngresada = Double.parseDouble(System.console().readLine());
            alus[i]. setNotaMedia(notaIngresada);
        }
        System.out.println("Los datos introducidos son:");
        double sumaDeMedias = 0;
        for(int i = 0; i < alus.length; i ++){
            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + alus[i].getNombre());
            System.out.println("Nota Media: " + alus[i].getNotaMedia());
            System.out.println("********************************");
            sumaDeMedias += alus[i].getNotaMedia();
        }
        System.out.println("La suma global de medias es: " + sumaDeMedias / alus.length);
    }   
}
