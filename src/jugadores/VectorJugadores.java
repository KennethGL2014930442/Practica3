package src.jugadores;

import java.util.*;
import src.jugadores.IngresoDatosJugadores;

public class VectorJugadores {
	Scanner scanner = new Scanner(System.in);
    private Jugadores[] jugadores = new Jugadores[10];
    private int siguienteCodigo;

    public VectorJugadores(){
        siguienteCodigo = 1;
    }

    public void agregarJugador(String nombre){
        if (siguienteCodigo > 10){
            System.out.println("Límite de jugadores alcanzado");
        }
        else{
            jugadores[(siguienteCodigo-1)] = new Jugadores(siguienteCodigo, nombre);
        }
        siguienteCodigo++;
    }

	Scanner sn1 = new Scanner(System.in);
    public void agregarJugador(){
        String nombre;
		System.out.println("Ingrese el nombre del jugador: ");
		nombre = sn1.nextLine();
		
        agregarJugador(nombre);
    }
    

    public void mostrarJugadores(){
        System.out.println("\nJugadores de Damas\n");
        for (int i = 0; i < (siguienteCodigo-1); i++) {
            System.out.println("-"+i+") "+jugadores[i].getInformacion());   
        }
    }

    public void ordenarPorNombre(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (siguienteCodigo-1); i++) {
            for (int j = 0; j < (siguienteCodigo-1-i); j++) {
                if (ascendente)
                    cambio= (jugadores[j].getNombre().compareTo(jugadores[j+1].getNombre()) > 0 );
                else 
                    cambio= (jugadores[j].getNombre().compareTo(jugadores[j+1].getNombre()) < 0 );

                if(cambio){
                    Jugadores aux = jugadores[j];
                    jugadores[j] = jugadores[j+1];
                    jugadores[j+1]= aux;
                }
            }
        }
    }   
}