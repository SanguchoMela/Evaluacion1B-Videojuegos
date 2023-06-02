public class Videojuego {
    //atributos de la clase Videojuego
    String nombre;
    String protagonista;
    int maxjugadores;
    int anio;

    //metodo Constructor con todos los atributos de la clase
    public Videojuego(String nombre, String protagonista, int maxjugadores, int anio) {
        this.nombre = nombre;
        this.protagonista = protagonista;
        this.maxjugadores = maxjugadores;
        this.anio = anio;
    }

    //metodos Setters y Getters de cada atributo de la clase
    //------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public int getMaxjugadores() {
        return maxjugadores;
    }

    public void setMaxjugadores(int maxjugadores) {
        this.maxjugadores = maxjugadores;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    //------------------------------------------------------

    //metodo de la clase para imprimir la información de cada objeto de la clase
    public void mostrarInfo(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Protagonista: "+getProtagonista());
        System.out.println("Maximo de jugadores: "+getMaxjugadores());
        System.out.println("Anio de lanzamiento: "+getAnio());
    }
}
