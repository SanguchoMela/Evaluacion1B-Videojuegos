import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        //objeto para la entrada de valores
        Scanner entrada = new Scanner(System.in);

        //instancias creadas para la clase Videojuego
        Videojuego videojuego1 = new Videojuego("Mario Bros","Mario y Luigi", 1, 1990);
        Videojuego videojuego2 = new Videojuego("Pacman","Pacman", 1,1970);
        Videojuego videojuego3 = new Videojuego("FreeFire","Jugador", 1000,2015);
        Videojuego videojuego4 = new Videojuego("CandyCrush","Jugador", 1,2010);
        Videojuego videojuego5 = new Videojuego("Repara Felix","Felix y Ralph", 2,1960);

        //uso de metodo mostrarInfo para mostrar todos los atributos de cada instancia
        System.out.println("La informacion del Videojuego 1 es: ");
        videojuego1.mostrarInfo();
        System.out.println("\nLa informacion del Videojuego 2 es: ");
        videojuego2.mostrarInfo();
        System.out.println("\nLa informacion del Videojuego 3 es: ");
        videojuego3.mostrarInfo();
        System.out.println("\nLa informacion del Videojuego 4 es: ");
        videojuego4.mostrarInfo();
        System.out.println("\nLa informacion del Videojuego 5 es: ");
        videojuego5.mostrarInfo();

        //Indicativo
        System.out.println("\nPara modificar la informacion del videojuego 5, ingrese la informacion solicitada a continuacion:");
        //Ejemplo de aplicacion al modificar todos los atributos de la instancia 5
        //Ingrreso de informacion a los atributos de una instancia
        System.out.println("Ingrese el nombre de otro videojuego: ");
        String nuevoNombre = entrada.nextLine();
        videojuego5.setNombre(nuevoNombre);

        System.out.println("Ingrese el nombre del protagonista del videojuego: ");
        String nuevoProtagonista = entrada.nextLine();
        videojuego5.setProtagonista(nuevoProtagonista);

        System.out.println("Ingrese el maximo de jugadores del videojuego: ");
        int nuevo_maxJugadores = entrada.nextInt();
        videojuego5.setMaxjugadores(nuevo_maxJugadores);

        System.out.println("Ingrese el anio de lanzamiento del videojuego: ");
        int nuevoAnio = entrada.nextInt();
        videojuego5.setAnio(nuevoAnio);


        //uso de metodo para establecer informacion nueva en el atributo de una instancia
        videojuego5.setNombre(nuevoNombre);
        videojuego5.setProtagonista(nuevoProtagonista);
        videojuego5.setMaxjugadores(nuevo_maxJugadores);
        videojuego5.setAnio(nuevoAnio);


        //reutilizacion del metodo mostrarInfo para mostrar la informacion modificada
        System.out.println("\nLa informacion actualizada del Videojuego 5 es: ");
        videojuego5.mostrarInfo();
    }
}
