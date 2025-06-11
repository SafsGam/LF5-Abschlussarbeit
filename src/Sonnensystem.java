import java.util.Scanner;

public class Sonnensystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gameOver = false;

        // Erstellen von Raumschiffen
        Raumschiff r1Eosnova = new Raumschiff("Eos Nova", 0,0);
        Raumschiff r2Auroraquest = new Raumschiff("Aurora Quest", 0,0);

        //Game
        System.out.println("Das Spiel beginnt. Sie fliegen das Raumschiff <" + r1Eosnova.getName() + ">.");
        while(!gameOver) {
            r1Eosnova.fliegen(getRichtung(sc, r1Eosnova));
            Raumschiff.pruefeKoordniaten(r1Eosnova, r2Auroraquest);
        }
    }
    public static char getRichtung(Scanner sc,Raumschiff eosnova) {
        System.out.println("\nAktuelle Position der <"+ eosnova.getName()+">: [" + eosnova.getPosX() + ", " + eosnova.getPosY() + "]");
        System.out.print("Navigationseingabe erforderlich [A, S, D, W]: ");
        char richtung = sc.next().toUpperCase().charAt(0);
        while (richtung != 'A' && richtung != 'S' && richtung != 'D' && richtung != 'W') {
            System.out.println("!Ungültige Eingabe!");
            System.out.print("Navigationseingabe erforderlich [A, S, D, W]: ");
            richtung = sc.next().toUpperCase().charAt(0);
        }
        return richtung;
    }
}
