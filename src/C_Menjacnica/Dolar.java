package C_Menjacnica;

public class Dolar extends Valuta {


    public Dolar(double kursValute) {
        super("Dolar", "USD", kursValute);
    }

    public void postaviKursNovi(double noviKurs) {
        System.out.println("Poziva se dodatni metod koji menja kurs valute na: " + noviKurs + " kroz obican seter.");
        super.setKursValute(noviKurs);
    }

}
