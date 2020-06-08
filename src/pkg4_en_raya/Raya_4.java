package pkg4_en_raya;

import java.util.InputMismatchException;
import java.util.Scanner;
import static pkg4_en_raya.ColocarFitxa.colocarFitxa;
import static pkg4_en_raya.ColumnaPlena.columnaPlena;
import static pkg4_en_raya.CrearTauler.crearTauler;
import static pkg4_en_raya.Guanyat.guanyat;
import static pkg4_en_raya.MarcarLinia.marcarLinia;
import static pkg4_en_raya.MostrarTauler.mostrarTauler;

public class Raya_4 {
        
public static void main (String[] args) {
    String nomJugador1, nomJugador2;
    Jugador n1 = new Jugador();
    Jugador n2 = new Jugador();
    
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Afageix el nom del primer jugadror : ");
    nomJugador1 = sc.nextLine();
    n1.setnom(nomJugador1);
    
    System.out.println("Afageix el nom del segon jugadror : ");
    nomJugador2 = sc.nextLine();
    n2.setnom(nomJugador2);
    
    String[][] tauler = crearTauler();
    Scanner s = new Scanner(System.in);
    boolean guanyat = false;
    String jugador = "X";
    int columna = 0;
    while (guanyat == false) {
        if(jugador == "X") {
            jugador = "O";
        }else {
            jugador = "X";
        }
        boolean error = true;
        mostrarTauler(tauler, jugador);
        while (error){
            System.out.print("Introdueix una casella: ");
            try {
                columna = s.nextInt();
                System.out.println();
                columna--;
                if((columna >= 0) && (columna < 7)) {
                    if(columnaPlena(tauler, columna)){
                        System.out.println("La columna esta plena. ");
                        System.out.println();
                    }else {
                    error = false;
                    }
                }else {
                    System.out.println("El numero ha de ser entre 1 i 7. ");
                    System.out.println();
                }
            }catch(InputMismatchException e){ // Aquesta excepció ens serveix per indicar si la casella seleccionada està adedins el rang o no de casselles.
                System.out.println();
                System.out.println("No has introduit un numero enter. ");
                System.out.println();
                s.next();
            }
        }
        colocarFitxa(tauler, jugador, columna);
        guanyat = guanyat(tauler, jugador, columna);
    }
    marcarLinia(tauler, jugador, columna);
    mostrarTauler(tauler, jugador);
    if(jugador == "O") {
        System.out.println("En " + n1.getnom() + " ha guanyat !");
    }else {
        System.out.println("En " + n2.getnom() + " ha guanyat !");
    }
}
}