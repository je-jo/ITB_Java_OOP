package A_BankovniRacun;

public class BankovniRacun {

    int id;
    String imeVlasnika;
    double trenutnoStanje;

    public BankovniRacun(int id, String imeVlasnika, double trenutnoStanje) {
        this.id = id;
        this.imeVlasnika = imeVlasnika;
        this.trenutnoStanje = trenutnoStanje;
    }

    public double uplatiNaRacun(double iznos) {
        System.out.println("Zahtev za uplatu " + iznos + " dinara...");
        if (iznos >= 0) {
            trenutnoStanje += iznos;
            System.out.println("Na racun je dodato " + iznos + " dinara.");
        } else {
            System.out.println("Uplata nije izvrsena jer je uneti iznos negativan, molimo unesite pozitivan iznos za uplatu.");
        }
        return trenutnoStanje;
    }

    public double isplatiSaRacuna(double iznos) {
        System.out.println("Zahtev za isplatu " + iznos + " dinara...");
        if (iznos <= trenutnoStanje) {
            trenutnoStanje -= iznos;
            System.out.println("Sa racuna je skinuto " + iznos + " dinara.");
        } else {
            System.out.println("Uneti iznos je veci od raspolozivog stanja. Mozete podici najvise " + trenutnoStanje + " dinara.");
        }
        return trenutnoStanje;
    }

    public String toString() {
        return "Podaci racuna - Broj racuna: " + id + "; " + "Ime vlasnika: " + imeVlasnika + "; " + "Trenutno stanje: " + trenutnoStanje + ".";
    }

}
