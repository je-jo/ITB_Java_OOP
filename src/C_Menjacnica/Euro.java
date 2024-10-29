package C_Menjacnica;

public class Euro extends Valuta {
    public Euro(double kursValute) {
        super("Euro", "EUR", kursValute);
    }

    public void postaviKursNovi(double noviKurs) {
        System.out.println("Poziva se dodatni metod koji menja kurs valute na: " + noviKurs + " kroz obican seter.");
        super.setKursValute(noviKurs);
    }

}
