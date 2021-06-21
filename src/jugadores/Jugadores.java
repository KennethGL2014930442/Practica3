package src.jugadores;

public class Jugadores {
    private int id;
    private String nombre;
    private int edad;

    public Jugadores(int id, String nombre, int edad){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Jugadores(int id, String nombre){
        this(id, nombre, 0);
    }

    //getters y setters

    public int getId(){
        return id;
    }

    public int getEdad(){
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    //fin getters y setters

    public String getInformacion(){
        String resultado = "Id: "+id+" --- Nombre del jugador: " +nombre;
        return resultado;
    }
}