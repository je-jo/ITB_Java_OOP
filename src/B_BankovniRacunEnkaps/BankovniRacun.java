package B_BankovniRacunEnkaps;

public class BankovniRacun {

    private int id;
    private String imeVlasnika;
    private double trenutnoStanje;

    public BankovniRacun(int id, String imeVlasnika, double trenutnoStanje) {
        this.id = id;
        this.imeVlasnika = imeVlasnika;
        this.trenutnoStanje = trenutnoStanje;
    }

    // geteri i seteri

    public int getId() {
        return id;
    }

    public void setId(int noviId) {
        this.id = noviId;
    }

    public String getImeVlasnika() {
        return imeVlasnika;
    }

    public void setImeVlasnika(String novoIme) {
        this.imeVlasnika = novoIme;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public void setTrenutnoStanje(double novoStanje) {
        this.trenutnoStanje = novoStanje;
    }

    // toString

    public String toString() {
        return "Podaci racuna - Broj racuna: " + id + "; " + "Ime vlasnika: " + imeVlasnika + "; " + "Trenutno stanje: " + trenutnoStanje + ".";
    }

    // ostale metode

    public double uplatiNaRacun(double iznos) {
        System.out.println("Zahtev za uplatu " + iznos + " dinara...");
        if (iznos >= 0) {
            setTrenutnoStanje(getTrenutnoStanje() + iznos);
            System.out.println("Na racun je dodato " + iznos + " dinara.");
        } else {
            System.out.println("Uplata nije izvrsena jer je uneti iznos negativan, molimo unesite pozitivan iznos za uplatu.");
        }
        return trenutnoStanje;
    }

    public double isplatiSaRacuna(double iznos) {
        System.out.println("Zahtev za isplatu " + iznos + " dinara...");
        if (iznos <= trenutnoStanje) {
            setTrenutnoStanje(getTrenutnoStanje() - iznos);
            System.out.println("Sa racuna je skinuto " + iznos + " dinara.");
        } else {
            System.out.println("Uneti iznos je veci od raspolozivog stanja. Mozete podici najvise " + trenutnoStanje + " dinara.");
        }
        return trenutnoStanje;
    }

}
