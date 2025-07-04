public class Raumschiff {
    private String name;
    private int posX;
    private int posY;
    private Kapitaen kapitaen;

    public Raumschiff(String name, int posX, int posY,Kapitaen kapitaen) {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
        this.kapitaen = kapitaen;
    }

    public void fliegen(char richtung){
        switch(richtung){
            case 'A': // links
                posX--;
                break;
            case 'S': // runter
                posY--;
                break;
            case 'D': // rechts
                posX++;
                break;
            case 'W': // hoch
                posY++;
                break;
        }
    }

    public static boolean pruefeKoordniaten(Raumschiff r1Eosnova, Raumschiff r2Aurora) {
        if(r1Eosnova.getPosX() == r2Aurora.getPosX() && r1Eosnova.getPosY() == r2Aurora.getPosY()) {
            System.out.println("Nachricht--> Hier ist das Raumschiff <" + r2Aurora.getName() + ">!");
            Kapitaen.diplomatischeVerhandlung(r1Eosnova, r2Aurora);
            return true;
        }else {
            return false;
        }
    }
    // Getter-Methoden
    public String getName() {
        return name;
    }
    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }
    public Kapitaen getKapitaen() {
        return kapitaen;
    }
}
