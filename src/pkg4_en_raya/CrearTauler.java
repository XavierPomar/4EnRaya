package pkg4_en_raya;

public class CrearTauler {

    public static String[][] crearTauler(){
        String[][] tauler = new String[6][7];
        for(int k = 0; k < tauler.length; k++) {
            for(int i = 0; i < tauler[0].length; i++) {
                tauler[k][i] = ".";
            }
        }
        return tauler;
    }	
}