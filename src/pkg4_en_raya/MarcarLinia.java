package pkg4_en_raya;

public class MarcarLinia {
    public static String[][] marcarLinia(String[][] tauler, String jugador, int columna){
        int cont = 0;
        
        //Si hem fet linia cap adalt ens canvia la icona del jugador que ha guanyat per @.
        for(int k = 0; k < 6; k++) {
            if(tauler[k][columna] == jugador) {
                cont++;
                if(cont == 4) {
                    for(int i = 0; i < 4; i++) {
                        tauler[k-i][columna] = "@";
                    }
                }
            }else {
                cont = 0;
            }
        }

        int fila = 0;

        for(int k = 0; k < 6; k++) {
            if(tauler[k][columna] == jugador) {
                fila = k;
                break;
            }
        }
        
        cont = 0;

        //Si hem fet linia cap a la dreta o a l'esquerra, ens canvia la icona del jugador per @.
        for (int k = 0; k <= 6 ; k++) {
            if(tauler[fila][k] == jugador) {
                cont++;
                if(cont == 4) {
                    for(int i = 0; i < 4; i++) {
                        tauler[fila][k-i] = "@"; 
                    }
                }	
            }else {
                cont = 0;
            }
        }
        
        cont = 0;
        
        //Si hem fet linia diagonal cap a la dreta o a l'esquerra ens canvia la icona per una @.
        for(int k = 0 ; k <= 6;k++) {
            if( ((fila-3)+k < 6) && ((fila-3)+k >= 0) && ((columna-3)+k < 7) && ((columna-3)+k >= 0)) {
                if(tauler[(fila-3)+k][(columna-3)+k] == jugador) {
                    cont++;
                    if(cont == 4) {
                        for(int i = 0; i < 4; i++) {
                            tauler[(fila-3+k)-i][(columna-3+k)-i] = "@";
                        }
                    }
                }else {
                    cont = 0;
                }
            }
        }
        
        cont = 0;
        
        //Si hem fet linia en diagonal cap abaix a la dreta o a l'esquerra ens canvia la icona per una @.
        for (int k = 0; k <= 6; k++) {
            if( ((fila+3)-k < 6) && ((fila+3)-k >= 0) && ((columna-3)+k < 7) && ((columna-3)+k >= 0)) {
                if(tauler[(fila+3)-k][(columna-3)+k] == jugador) {
                    cont++;
                    if(cont == 4) { 
                        for(int i = 0; i < 4; i++) {
                            tauler[(fila+3-k)+i][(columna-3+k)-i] = "@";
                        }
                    }
                }else {
                    cont = 0;
                }
            }
        }
        return tauler;
    }
}
