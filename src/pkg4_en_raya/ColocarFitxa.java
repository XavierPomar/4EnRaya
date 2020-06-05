package pkg4_en_raya;

public class ColocarFitxa {
    public static void colocarFitxa(String[][] tauler, String jugador, int columna) {
	for(int k = 5 ; k >= 0; k--) {
            if(tauler[k][columna] == ".") {
		tauler[k][columna] = jugador;
		break;
            }
	}
    }
}
