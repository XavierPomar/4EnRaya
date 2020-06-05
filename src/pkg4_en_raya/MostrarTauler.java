package pkg4_en_raya;

import java.util.Scanner;


public class MostrarTauler {
        
    
    public static void mostrarTauler(String[][] tauler, String jugador) {
        String nomJugador1, nomJugador2;
        Jugador n1 = new Jugador();
        Jugador n2 = new Jugador(); 
        
        
        System.out.println();
	System.out.println("  _______________");
	for(int k = 0 ; k < tauler.length ; k++) {
            System.out.print(" |");
            for(int i = 0 ; i < tauler[0].length ; i++) {
                System.out.print(" " + tauler[k][i]);
            }
            System.out.print(" |");
            if(k == 0) {
		System.out.print(" Jugador actual: ");
            }
            if(k == 1) {
                if(jugador == "X") {
                    System.out.print(n1.getnom());
                }
                if(jugador == "O") {
                    System.out.print(n2.getnom());
                }
            }
            System.out.println();
	}
	System.out.println(" |---------------|");
	System.out.println(" | 1 2 3 4 5 6 7 |");
	System.out.println(" |_______________|");
	System.out.println();
    }
}
