public class Kapitaen {
    private String name;
    private int charisma;
    private int erfahrung;

    public Kapitaen(String name, int charisma, int erfahrung) {
        this.name = name;
        this.charisma = charisma;
        this.erfahrung = erfahrung;
    }


    // Getter- und Setter-Methoden
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCharisma() {
        return charisma;
    }
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
    public int getErfahrung() {
        return erfahrung;
    }
    public void setErfahrung(int erfahrung) {
        this.erfahrung = erfahrung;
    }

    public static boolean diplomatischeVerhandlung(Raumschiff raumschiff,Raumschiff handelsPartner) {
        int zufall = (int)(Math.random() * 100) + 1;
        int erfolgschance = raumschiff.getKapitaen().getCharisma() * raumschiff.getKapitaen().getErfahrung();
        if(zufall <= erfolgschance){
            System.out.println("Nachricht--> Raumschiff <" + raumschiff.getName() + "> hat erfolgreich mit <" + handelsPartner.getName() + "> verhandelt.");
            return true;
        }else {
            System.out.println("Nachricht--> Die Verhandlungen zwischen <" + raumschiff.getName() + "> und <" + handelsPartner.getName() + "> sind gescheitert.");
            return false;
        }
    }
}
