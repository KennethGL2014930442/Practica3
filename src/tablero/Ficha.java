package src.tablero;

public class Ficha {
    private boolean esNegra;

    private String celda = "░";
    private String celdaColor = "█";
    //█▓
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
    private String id;


    
    public String getCaracter(){
        String res =(esNegra)?""+ANSI_BLACK+celda:""+ANSI_RED+celda;
        return res;
    }

    public Ficha(boolean esNegra , String id){
        this.esNegra = esNegra;
        this.id = id;
    }

    public String getId(){
        return id;
    }
    
}