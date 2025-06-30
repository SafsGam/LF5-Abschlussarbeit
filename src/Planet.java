public class Planet {
    private String name;
    private boolean atmosphaere;
    private int posX;
    private int posY;

    public Planet(String name, boolean atmosphaere, int posX, int posY) {
        this.name = name;
        this.atmosphaere = atmosphaere;
        this.posX = posX;
        this.posY = posY;
    }

    // Getter-Methoden
    public String getName() {
        return name;
    }
    public boolean getAtmosphaere() {
        return atmosphaere;
    }
    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }

    //Andere Methoden
    public int[] getCoordinaters(){
        return new int[]{posX, posY};
    }
    public static boolean pruefeKoordinaten(Planet p1Auroria,Planet p2Solara, Planet p3Ktaris, Raumschiff r1Eosnova) {
        if (p1Auroria.getPosX() == r1Eosnova.getPosX() && p1Auroria.getPosY() == r1Eosnova.getPosY()) {
            ausgabeInfo(p1Auroria);
            return true;
        }else if(p2Solara.getPosX() == r1Eosnova.getPosX() && p2Solara.getPosY() == r1Eosnova.getPosY()) {
            ausgabeInfo(p2Solara);
            return true;
        }else if (p3Ktaris.getPosX() == r1Eosnova.getPosX() && p3Ktaris.getPosY() == r1Eosnova.getPosY()) {
            ausgabeInfo(p3Ktaris);
            return true;
        } else {
            return false;
        }
    }
    public static void ausgabeInfo(Planet planet){
        System.out.println("Nachricht--> Sie haben den Planeten <" + planet.getName() + "> erreicht.");
        System.out.println("             Die Koordinaten des Planeten betragen: [" + planet.getPosX() + ", " + planet.getPosY() + "]");
        System.out.println("             Atmosphärenstatus: " + (planet.getAtmosphaere() ? "Vorhanden" : "Nicht vorhanden"));
    }
}
