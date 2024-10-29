package E_Igrac;

public class Igrac {

    private String ime;
    private int godineIskustva;
    private int brojPostignutihPoena;

    public Igrac(String ime, int godineIskustva, int brojPostignutihPoena) {
        this.ime = ime;
        this.godineIskustva = godineIskustva;
        this.brojPostignutihPoena = brojPostignutihPoena;
    }

    // geteri seteri

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public int getBrojPostignutihPoena() {
        return brojPostignutihPoena;
    }

    public void setBrojPostignutihPoena(int brojPostignutihPoena) {
        this.brojPostignutihPoena = brojPostignutihPoena;
    }

    // toString

    public String toString() {
        return "Ime igraca: " + ime + "; Godine iskustva: " + godineIskustva + "; Broj postignutih poena: " + brojPostignutihPoena + ".";
    }
}
