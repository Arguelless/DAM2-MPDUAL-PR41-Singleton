public class PR430Objecte {
    private static PR430Objecte instance;
    private String nom;
    private String cognom;
    private int edat;

    private PR430Objecte(String nom, String cognom, int edat) {

        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public static PR430Objecte getInstance(String nom, String cognom, int edat) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        if (instance == null) {
            instance = new PR430Objecte(nom, cognom, edat);
        }
        return instance;
    }

    public String toString() {
        return "Nom: " + this.nom + "   Cognom: " + this.cognom + "   Edat: " + this.edat;
    }
}
