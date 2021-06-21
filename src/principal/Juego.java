package src.principal;

import java.util.*;

import src.tablero.*;
import src.reglas.*;
import src.jugadores.*;
import src.jugadores.VectorJugadores;
import src.minijuego.*;

public class Juego {
	
	public static void main(String[] args){
		Juego j = new Juego();
	}
	
	private VectorJugadores tablaJugadores = new VectorJugadores();
	
	public Juego(){	
		
		int opcion = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(opcion!=5){
			System.out.println("\n-----Bienvenido al juego de Damas-----\n");
			
			System.out.println("1) Iniciar partida.");
			System.out.println("2) Ingresar jugadores.");
			System.out.println("3) mostrar jugadores");
			System.out.println("4) Reportes.");
			System.out.println("5) Salir");
			
			System.out.println("\nIngrese la opcion: ");
			opcion = scanner.nextInt();
			
			switch(opcion){
				case 1:
					
					String jugadorAmain;
					Minijuego minijuego = new Minijuego();
					Bienvenida();
					
					Scanner elegir = new Scanner(System.in);
					while(minijuego.contadorVictoria()){
						System.out.println("\nElija Piedra, Papel o Tijera: ");
						jugadorAmain = elegir.nextLine();
						minijuego.setJugadorA(jugadorAmain);
					
						minijuego.esTodo();
					}
					
										
					Reglas reglas = new Reglas();
					reglas.mostrarReglas();
				
					Tablero t = new Tablero(8, 8,true);	
					t.pintarTablero();
					//System.out.println(t.moverFicha(0, 0, 5, 5));
					break;
					/*t.pintarTablero();
					System.out.println(t.moverFicha(5, 5, 1, 1));
					t.pintarTablero();*/
			 
					/*Celda t = new Celda(true);
					t.setFicha(new Ficha(true));
					System.out.println(t.pintarCelda(0));
					System.out.println(t.pintarCelda(1));
					System.out.println(t.pintarCelda(2));*/
				case 2:
					tablaJugadores.agregarJugador();				
					break;
				case 3:
					tablaJugadores.ordenarPorNombre(true);
					tablaJugadores.mostrarJugadores();
					break;
				case 4:
					
					break;
				case 5:
					System.out.println("GRACIAS POR JUGAR!!!");
					break;
			}
		}
    }
	
	public static void Bienvenida(){
		System.out.println("\n----- Este es el juego de Piedra, Papel y Tijera para elegir quien inicia la partida y el color de las fichas.-----\n");	
		System.out.println("El que gane 3 veces este minijuego inicia el juego de Damas.\n");
	}
	
}