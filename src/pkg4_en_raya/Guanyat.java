package pkg4_en_raya;

public class Guanyat {
    public static boolean guanyat(String[][] tauler, String jugador, int columna) {
        int cont = 0;

        //ens mira si hem fet linia cap adalt
        for(int k = 0 ; k < 6 ; k++) {
            if(tauler[k][columna] == jugador) {
                cont++;
                if(cont == 4) {
                    return true;
                }
            }else {
                cont = 0;
            }
        }

        int fila = 0;

        for(int k = 0 ; k < 6 ; k++) {
            if(tauler[k][columna] == jugador) {
                fila = k;
                break;
            }
        }
    
        cont = 0;
        
        //Ens mira si hem fet linia cap a la dreta o la esquerra
        for (int k = 0; k <= 6 ; k++) {
            if(tauler[fila][k] == jugador) {
                cont++;
                if(cont == 4) {
                    return true;
                }	
            }else {
                cont = 0;
            }
        }
        
        cont = 0;
        
        // Ens mira si hem fet linia diagonal cap adalt a la dreta o a la esquerra.
        for(int k = 0 ; k <= 6;k++) {
            if( ((fila-3)+k < 6) && ((fila-3)+k >= 0) && ((columna-3)+k < 7) && ((columna-3)+k >= 0)) {
                if(tauler[(fila-3)+k][(columna-3)+k] == jugador) {
                    cont++;
                    if(cont == 4) {
                        return true;
                    }
                }else {
                    cont = 0;
                }
            }
        }
        
        cont = 0;
        
        //Ens mira si hem fet linia diagonal cap abaix a la dreta o a l'esquerra.
        for (int k = 0; k <= 6; k++) {
            if( ((fila+3)-k < 6) && ((fila+3)-k >= 0) && ((columna-3)+k < 7) && ((columna-3)+k >= 0)) {
                if(tauler[(fila+3)-k][(columna-3)+k] == jugador) {
                    cont++;
                    if(cont == 4) { 
                        return true;
                    }
                }else {
                    cont = 0;
                }
            }
        }
        return false;
    }
}
