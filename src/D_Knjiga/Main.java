package D_Knjiga;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Domaci:
        Napraviti klasu Knjiga koja ima atribute: naslov, broj strana, i godina izdavanja.
        Napraviti klasu Pisac koja ima atribute: ime, godina rođenja, i lista knjiga (lista objekata klase Knjiga).
        Napraviti metode:
        najpoznatijaKnjiga() -> koja vraća naslov knjige sa najvećim brojem strana.
        vremePisanja() -> koja vraća razliku između godine izdavanja prve i poslednje knjige.
        Napraviti klasu Romanopisac koji nasledjuje klasu Pisac i specifična metoda je:
        dugometrazniRoman() -> vraća "dugometražni roman" ako knjiga ima više od 500 strana.
        Napraviti klasu Pesnik koji nasledjuje klasu Pisac i ima metodu:
        brojZbirki() -> koja vraća broj knjiga koje imaju manje od 100 strana (pretpostavljamo da su zbirke poezije kraće).
        Napraviti klasu Esesista koja nasledjuje klasu Pisac i dodati metodu:
        kratkiEseji() -> vraća broj eseja (knjiga) koji imaju manje od 50 strana.
         */

        Knjiga potp = new Knjiga("U potpalublju", 250, 1994);
        Knjiga andjela = new Knjiga("Ti i ja, Andjela", 240, 2016);
        Knjiga granica = new Knjiga("Ka granici", 300, 2018);
        Knjiga duhovi = new Knjiga("Duhovi", 260, 2023);
        ArrayList<Knjiga> tetra = new ArrayList<>();
        tetra.add(potp);
        tetra.add(andjela);
        tetra.add(granica);
        tetra.add(duhovi);
        Romanopisac vlad = new Romanopisac("Vladimir Arsenijevic", 1965, tetra);
        System.out.println(vlad);
        System.out.println(potp);
        vlad.najpoznatijaKnjiga();
        vlad.vremePisanja();
        vlad.dugometrazniRoman();

        Knjiga gusari = new Knjiga("Deset ljutih gusara", 12, 1985);
        Knjiga afrika = new Knjiga("Isli smo u Afriku", 15, 1996);
        Knjiga afrika2 = new Knjiga("Fazoni i fore", 14, 1990);
        ArrayList<Knjiga> zbirkePesama = new ArrayList<>();
        zbirkePesama.add(afrika2);
        zbirkePesama.add(gusari);
        zbirkePesama.add(afrika);
        Pesnik rsum = new Pesnik("Ljubivoje Rsumovic", 1939, zbirkePesama);
        System.out.println(rsum);
        System.out.println(gusari);
        rsum.najpoznatijaKnjiga();
        rsum.vremePisanja();
        rsum.brojZbirki();

        Knjiga pob = new Knjiga("Pobunjeni covek", 49, 1938);
        Knjiga sizif = new Knjiga("Mit o sizifu", 50, 1941);
        Knjiga lice = new Knjiga("Nalicje i lice", 51, 1939);
        ArrayList<Knjiga> eseji = new ArrayList<>();
        eseji.add(pob);
        eseji.add(sizif);
        eseji.add(lice);
        Esejista kami = new Esejista("Alber Kami", 1913, eseji);
        System.out.println(kami);
        System.out.println(sizif);
        kami.najpoznatijaKnjiga();
        kami.vremePisanja();
        kami.kratkiEseji();

    }
}
