package src.minijuego;

import java.util.Random;

public class Minijuego{
	
	private int ronda;
	private int contadorvictoriA;
	private int contadorvictoriB;
	private boolean romper;
	private String jugadorA;
	private String jugadorB;
	
	public Minijuego(){
		this.ronda = 1;
		this.romper = true;
		this.contadorvictoriA = 0;
		this.contadorvictoriB = 0;
		this.jugadorB = rngCPU();
	}
	
	public Minijuego(String jugadorA){
		this.jugadorA = jugadorA;
	}
	
	public Minijuego(int contadorvictoriA, int contadorvictoriB, boolean romper, String jugadorA, String jugadorB){
		this.contadorvictoriA = contadorvictoriA;
		this.contadorvictoriB = contadorvictoriB;
		this.romper = romper;
		this.jugadorA = jugadorA;
	}
	
	public String rngCPU(){
		Random cpu = new Random();
		int opciones = cpu.nextInt(3);
		
		switch(opciones){
			case 0:
				jugadorB = "Piedra";
				break;
			case 1:
				jugadorB = "Papel";
				break;
			case 2:
				jugadorB = "Tijera";
				break;	
		}
		return jugadorB;
	}
	
	public void rngDOS(){
		Random cpu = new Random();
		int opciones = cpu.nextInt(3);
		
		switch(opciones){
			case 0:
				jugadorB = "Piedra";
				break;
			case 1:
				jugadorB = "Papel";
				break;
			case 2:
				jugadorB = "Tijera";
				break;	
		}
	}
	
	public boolean contadorVictoria(){
		if((contadorvictoriA == 3) || (contadorvictoriB == 3)){
			romper = false;
		}
		return romper;
	}
	
	public void esEmpate(){
		if(jugadorA.equals(jugadorB)){
			System.out.println("Es empate " + jugadorA + " = " + jugadorB);
			ronda++;
		}
	}
	
	public void esPiedra(){
		if(jugadorA.equals("Piedra")){
			ronda++;
			if(jugadorB.equals("Tijera")){
				contadorvictoriA++;
				System.out.println("Ganaste " +jugadorA+ " > "+jugadorB);
			}else if(jugadorB.equals("Papel")){
				contadorvictoriB++;
				System.out.println("Gano jugador 2 "+jugadorB+" > "+jugadorA);
			}
		}
	}
	
	public void esPapel(){
		if(jugadorA.equals("Papel")){
			ronda++;
			if(jugadorB.equals("Piedra")){
				contadorvictoriA++;
				System.out.println("Ganaste " +jugadorA+ " > "+jugadorB);
			}else if(jugadorB.equals("Tijera")){
				contadorvictoriB++;
				System.out.println("Gano jugador 2 "+jugadorB+" > "+jugadorA);
			}
		}
	}
	
	public void esTijera(){
		if(jugadorA.equals("Tijera")){
			ronda++;
			if(jugadorB.equals("Papel")){
				contadorvictoriA++;
				System.out.println("Ganaste " +jugadorA+ " > "+jugadorB);
			}else if(jugadorB.equals("Piedra")){
				contadorvictoriB++;
				System.out.println("Gano jugador 2 "+jugadorB+" > "+jugadorA);
			}
		}
	}
	
	public void esResultado(){
		System.out.println("Puntaje A: " + contadorvictoriA+" B:" +contadorvictoriB);
	}
	
	public void esLaRonda(){
		System.out.println("\nEsta es la ronda: "+ronda);
	}
	
	public void esTodo(){
		esLaRonda();
		contadorVictoria();
		esEmpate();
		esPapel();
		esPiedra();
		esTijera();
		esResultado();
		rngDOS();
	}
	
	//getters y setters
	
	public int getContadorvictoriA(){
		return contadorvictoriA;
	}
	
	public void setContadorvictoriA(int contadorvictoriA){
		this.contadorvictoriA = contadorvictoriA;
	}
	
	public int getContadorvictoriB(){
		return contadorvictoriB;
	}
	
	public void setContadorvictoriB(int contadorvictoriB){
		this.contadorvictoriB = contadorvictoriB;
	}
	
	public boolean isRomper(){
		return romper;
	}
	
	public void setRomper(boolean romper){
		this.romper = romper;
	}
	
	public String getJugadorA(){
		return jugadorA;
	}
	
	public void setJugadorA(String jugadorA){
		this.jugadorA = jugadorA;
	}
	
	public String getJugadorB(){
		return jugadorB;
	}
	
	public void setJugadorB(String jugadorB){
		this.jugadorB = jugadorB;
	}
	
}