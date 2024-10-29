package C_Menjacnica;

public class Valuta {

    private String naziv;
    private String simbol;
    private double kursValute;

    public Valuta(String naziv, String simbol, double kursValute) {
        this.naziv = naziv;
        this.simbol = simbol;
        this.kursValute = kursValute;
    }

    public double konvertujUDinare(double iznos) {
        double iznosUDinarima = iznos * getKursValute();
        System.out.println(iznos + " " + simbol + "-a iznosi " + iznosUDinarima + " dinara.");
        return iznosUDinarima;
    }

    // geteri seteri

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public double getKursValute() {
        return kursValute;
    }

    public void setKursValute(double kursValute) {
        System.out.println("Kurs valute promenjen na: " + kursValute + " kroz seter.");
        this.kursValute = kursValute;
    }


    // toString

    public String toString() {
        return "Valuta: " + naziv + "; Simbol: " + simbol + "; Kurs: " + kursValute + ".";
    }
}
