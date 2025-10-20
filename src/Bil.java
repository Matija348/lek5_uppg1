public class Bil {
    // Del 1 – privata variabler (inkapsling)
    private String registreringsnummer;
    private String märke;
    private String modell;
    private int årsmodell;
    private int hastighet;

    // Del 2 – Konstruktor
    public Bil(String registreringsnummer, String märke, String modell, int årsmodell) {
        if (registreringsnummer == null || registreringsnummer.isEmpty())
            throw new IllegalArgumentException("Registreringsnummer får inte vara tomt.");
        if (märke == null || märke.isEmpty())
            throw new IllegalArgumentException("Märke får inte vara tomt.");
        if (modell == null || modell.isEmpty())
            throw new IllegalArgumentException("Modell får inte vara tom.");
        if (årsmodell < 1860 || årsmodell > java.time.Year.now().getValue())
            throw new IllegalArgumentException("Årsmodell måste vara mellan 1860 och nuvarande år.");

        this.registreringsnummer = registreringsnummer;
        this.märke = märke;
        this.modell = modell;
        this.årsmodell = årsmodell;
        this.hastighet = 0; // Startvärde
    }

    // Del 3 – Getters
    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public String getMärke() {
        return märke;
    }

    public String getModell() {
        return modell;
    }

    public int getÅrsmodell() {
        return årsmodell;
    }

    public int getHastighet() {
        return hastighet;
    }

    // Setter för modell
    public void setModell(String modell) {
        if (modell == null || modell.isEmpty())
            throw new IllegalArgumentException("Modell får inte vara tom.");
        this.modell = modell;
    }

    // Del 4 – Metoder
    public void ökaHastighet(int ökning) {
        if (ökning <= 0)
            throw new IllegalArgumentException("Ökningen måste vara större än 0.");
        hastighet += ökning;
    }

    public void bromsa(int minskning) {
        if (minskning <= 0)
            throw new IllegalArgumentException("Minskningen måste vara större än 0.");
        if (minskning > hastighet)
            hastighet = 0;
        else
            hastighet -= minskning;
    }

    // toString – returnerar bilens information
    @Override
    public String toString() {
        return "Bil [Registreringsnummer: " + registreringsnummer +
                ", Märke: " + märke +
                ", Modell: " + modell +
                ", Årsmodell: " + årsmodell +
                ", Hastighet: " + hastighet + " km/h]";
    }
}
