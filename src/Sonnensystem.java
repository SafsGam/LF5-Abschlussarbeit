import java.util.Scanner;

public class Sonnensystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gameOver = false;

        // Erstellen von Objekten
        Kapitaen k1Eosnova = new Kapitaen("Alexia Nova", 7, 7);
        Kapitaen k2Auroraquest = new Kapitaen("Admiral Zenith Nightfall", 4, 9);
        Raumschiff r1Eosnova = new Raumschiff("Eos Nova", 0,0,k1Eosnova);
        Raumschiff r2Auroraquest = new Raumschiff("Aurora Quest", 0,0,k2Auroraquest);
        Planet p1Auroria = new Planet("Auroria", true, 10, 10);
        Planet p2Solara = new Planet("Solara", false, 2, -3);
        Planet p3Ktaris = new Planet("Ktaris", true, -5, 5);

        //Game
        System.out.println("Das Spiel beginnt. Sie fliegen das Raumschiff <" + r1Eosnova.getName() + ">.");
        System.out.println("Ihr Kapitän ist <" + r1Eosnova.getKapitaen().getName() + ">.");
        k1Eosnova.setName("Alexia Starlight Nova");
        while(!gameOver) {
            r1Eosnova.fliegen(getRichtung(sc, r1Eosnova));
            Raumschiff.pruefeKoordniaten(r1Eosnova, r2Auroraquest);
            Planet.pruefeKoordinaten(p1Auroria,p2Solara, p3Ktaris, r1Eosnova);
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
