package pkg4_en_raya;

public class ColumnaPlena {
    public static boolean columnaPlena(String[][] tauler, int columna) {
        if(tauler[0][columna] == ".") {
            return false;
        }
        return true;
    }
}
