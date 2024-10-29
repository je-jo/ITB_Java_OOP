package C_Menjacnica;

public class Main {
    public static void main(String[] args) {
        /*
        Domaci:
        Definisati hijerarhiju klasa koje predstavljaju razlicite valute u menjacnici.
        Osnovna Klasa: Valuta
        promenljive: naziv , simbol, i kurs.
        Konstruktor: Postavlja vrednosti za naziv, simbol i kurs valute.
        Metoda: konvertujUdinare(iznos), koja konvertuje zadati iznos u dinare koristeci trenutni kurs valute.
        Dolar:
        Nasledjuje klasu Valuta.
        Konstruktor: Postavlja vrednosti za naziv "Dolar", simbol "USD", i trenutni kurs prema dinarima.
        Dodatna Metoda: postaviKursNovi(kurs), koja postavlja novi kurs dolara.
        Euro:
        Nasledjuje klasu Valuta.
        Konstruktor: Postavlja vrednosti za naziv "Euro", simbol "EUR", i trenutni kurs prema dinarima.
        Dodatna Metoda: postaviKursNovi(kurs: number), koja postavlja novi kurs evra.
        Napisati glavni program koji kreira objekte za dolar i evro, postavlja njihove kurseve, i vrsi konverziju odredjenih iznosa iz jedne valute u drugu.
         */

        Dolar dolar = new Dolar(104);
        System.out.println(dolar);
        dolar.konvertujUDinare(100);
        dolar.setKursValute(105); // obican setter
        dolar.konvertujUDinare(100);
        dolar.postaviKursNovi(106); // dodatni metod
        dolar.konvertujUDinare(100);

        Euro euro = new Euro(117);
        System.out.println(euro);
        euro.konvertujUDinare(100);
        euro.setKursValute(118);
        euro.konvertujUDinare(100);
        euro.postaviKursNovi(106);
        euro.konvertujUDinare(100);


    }
}
