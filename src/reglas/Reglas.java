package src.reglas;

public class Reglas{
	
	public void mostrarReglas(){
		System.out.println("\n----- Reglas del juego de Damas-----\n");
		
		System.out.println("- Objetivo del juego.");
		System.out.println("\nEl objetivo del juego es capturar todas las fichas del oponente o inmovilizarlas de manera que no puedan moverse sin ser capturadas. Al mismo tiempo hay que intentar llevar las fichas al lado opuesto del tablero para lograr que sean 'coronadas' Damas. La estrategia general dice que 'cuanto mas rapido se capturan las fichas del rival sin perder las propias, mas pronto se gana'. Esta es la regla de oro de las Damas.");
		//System.out.println("llevar las fichas al lado opuesto del tablero para lograr que sean 'coronadas' Damas. La estrategia general dice que 'cuanto mas rapido se capturan las fichas del rival");
		//System.out.println("sin perder las propias, mas pronto se gana'. Esta es la regla de oro de las Damas.");
		
		System.out.println("- Preparacion.");
		System.out.println("\nEl tablero se coloca entre los dos jugadores de manera que una casilla roja quede ubicada a la derecha de cada participante. Cada jugador coloca sus fichas en hileras de cinco sobre las casillas negras, en las tres primeras filas de su lado. El participante que juega con fichas rojas comienza la partida moviendo una de sus fichas que solo puede desplazarse una casilla a la vez y siempre en diagonal: hacia izquierda o derecha. No pueed moverse hacia atras ni hacia los lados.");
		//System.out.println("de cinco sobre las casillas negras, en las tres primeras filas de su lado. El participante que juega con fichas rojas comienza la partida moviendo una de sus fichas que solo");
		//System.out.println("puede desplazarse una casilla a la vez y siempre en diagonal: hacia izquierda o derecha. No pueed moverse hacia atras ni hacia los lados.");
		
		System.out.println("\n- Coronacion.");
		System.out.println("\nSi un peón consigue llegar hasta su última línea (primera fila del rival), se convierte automáticamente en Dama. Para distinguirla del resto de las piezas se la corona colocando otra ficha del mismo color sobre la primera. La Dama puede moverse en diagonal hacia adelante y hacia atrás todas las casillas que desee en un solo movimiento, siempre y cuando no salte por encima de ninguna de sus propias fichas. Si al finalizar una captura un peón se convierte en Dama, esta no puede seguir capturando piezas y deberá esperar un nuevo turno para hacerlo.");
		//System.out.println("automáticamente en Dama. Para distinguirla del resto de las piezas se la corona");
		//System.out.println("colocando otra ficha del mismo color sobre la primera. La Dama puede moverse en");
		//System.out.println("diagonal hacia adelante y hacia atrás todas las casillas que desee en un solo movimiento, siempre y cuando no salte por encima de ninguna de sus propias fichas");
		//System.out.println("Si al finalizar una captura un peón se convierte en Dama, esta no puede seguir capturando piezas y deberá esperar un nuevo turno para hacerlo.");
		
		System.out.println("\n- Capturas.");
		System.out.println("\nEl peon captura en diagonal, saltando por encima de la ficha contraria que va a ser capturada, cayendo sobre la casilla inmediata posterior (en el sentido de la captura), siempre que el que captura est[e en una casilla adyacente al capturado, y que la casilla inmediata posterior este libre para terminar el movimiento. La captura con Dama es igual que con peon, aunque puede capturar tanto hacia adelante como hacia atras. La captura en todos los casos es obligatoria: si al llegar el turno de un jugador una o mas de sus piezas estuvieran en situacion de realizar capturas, sera obligatorio hacerlo no pudiendo optar por mover una pieza que no este en esa situacion. Tanto con Dama como con peon si tras una captura, la pieza en cuestion estuviera en situacion de realizar una nueva captura esta se llevara a cabo de forma encadenada, y asi sucesivamente mientras se diera tal circunstancia. Su movimiento y su turno terminan cuando ya no hay mas piezas que capturar.");
		//System.out.println("posterior (en el sentido de la captura), siempre que el que captura est[e en una casilla adyacente al capturado, y que la casilla inmediata");
		//System.out.println("posterior este libre para terminar el movimiento. La captura con Dama es igual que con peon, aunque puede capturar tanto hacia adelante como hacia atras.");
		//System.out.println("La captura en todos los casos es obligatoria: si al llegar el turno de un jugador una o mas de sus piezas estuvieran en situacion de realizar capturas, sera");
		//System.out.println("obligatorio hacerlo no pudiendo optar por mover una pieza que no este en esa situacion. Tanto con Dama como con peon si tras una captura, la pieza en cuestion estuviera");
		//System.out.println("en situacion de realizar una nueva captura esta se llevara a cabo de forma encadenada, y asi sucesivamente mientras se diera tal circunstancia. Su movimiento y su turno");
		//System.out.println("terminan cuando ya no hay mas piezas que capturar.");
		
		System.out.println("\n- Final.");
		System.out.println("\nUna partida termina cuando un jugador ha capturado todas las fichas del oponente o este no puede realizar ningun movimiento. Si ningun jugador puede ganar, es decir que ambos contrincantes tienen poquisimas fichas y son incapaces de atacar con exito, es el momento de concluir la partida en tablas. Esto es muy frecuente en el juego de alto nivel.\n");
		//System.out.println("que ambos contrincantes tienen poquisimas fichas y son incapaces de atacar con exito, es el momento de concluir la partida en tablas. Esto es muy frecuente en el juego de alto nivel.\n");
	}
	
}