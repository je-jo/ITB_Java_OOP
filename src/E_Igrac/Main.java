package E_Igrac;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Domaci:
        Napraviti klasu Igrac koja ima atribute: ime, godine iskustva, i broj postignutih poena.

        Napraviti klasu Klub koja ima atribute: naziv, grad, i lista igraca (lista objekata klase Igrac).
        Napraviti metode:
        - najiskusnijiIgrac() -> vraca ime igrača sa najvise godina iskustva.
        - ukupnoPoena() -> vraća ukupan broj poena koje su postigli svi igrači u klubu.
        - vrednostTima() -> vraca vrednost tima (apstraktan metod)

        Napraviti klasu KosarkaskiKlub koja nasleđuje klasu Klub, i dodati specifičnu metodu:
        - sampionTima() -> vraća ime igraca koji ima više od 1000 postignutih poena.

        Napraviti klasu FudbalskiKlub koja nasleđuje klasu Klub, i dodati metodu:
        - najboljiStrelac() -> vraca ime igraca sa najvise postignutih golova (golove cemo interpretirati kao postignute poene).

        Napraviti klasu OdbojkaškiKlub koja nasleđuje klasu Klub, i dodati metodu:
        - odbrambeniAs() -> vraća ime igrača koji ima najvise poena, ali je igrao manje od 3 godine.

        vrednostTima() -> za kosarkaski tim racunamo da igrac vredi 50 za svaki postignut poen,
        za fudbalski tim racunamo da igrac vredi po 1000 za svaki postignut gol,
        dok za odbojkaski tim svaki igrac vredi 100 po poenu.
        Vrednost tima predstavlja sumu cena svih njegovih igraca
         */

        Igrac k1 = new Igrac("Balsa", 10, 530);
        Igrac k2 = new Igrac("Vanja", 9, 1200);
        Igrac k3 = new Igrac("Cody", 11, 800);
        ArrayList<Igrac> listaIgraca = new ArrayList<>();
        listaIgraca.add(k1);
        listaIgraca.add(k2);
        listaIgraca.add(k3);

        KosarkaskiKlub kk = new KosarkaskiKlub("Partizan", "Beograd", listaIgraca);

        System.out.println(kk);
        kk.najiskusnijiIgrac();
        System.out.println("Kosarkaski klub je postigao ukupno " + kk.ukupnoPoena() + " poena.");
        kk.ukupnoPoena();
        kk.vrednostTima();
        kk.sampionTima();


        Igrac f1 = new Igrac("Mirko", 10, 13);
        Igrac f2 = new Igrac("Nemanja", 9, 15);
        Igrac f3 = new Igrac("Serif Ndaie", 11, 18);
        ArrayList<Igrac> listaIgracaF = new ArrayList<>();
        listaIgracaF.add(f1);
        listaIgracaF.add(f2);
        listaIgracaF.add(f3);
        FudbalskiKlub fk = new FudbalskiKlub("Crvena Zvezda", "Beograd", listaIgracaF);

        System.out.println(fk);
        fk.najiskusnijiIgrac();
        System.out.println("Fudbalski klub je postigao ukupno " + fk.ukupnoPoena() + " poena.");
        fk.ukupnoPoena();
        fk.vrednostTima();
        fk.najboljiStrelac();

        Igrac o1 = new Igrac("Bojana", 8, 70);
        Igrac o2 = new Igrac("Milica", 7, 60);
        Igrac o3 = new Igrac("Ana", 9, 50);
        ArrayList<Igrac> listaOIgraca = new ArrayList<>();
        listaOIgraca.add(o1);
        listaOIgraca.add(o2);
        listaOIgraca.add(o3);
        OdbojkaskiKlub ok = new OdbojkaskiKlub("ZOK Crvena Zvezda", "Beograd", listaOIgraca);

        System.out.println(ok);
        ok.najiskusnijiIgrac();
        System.out.println("Fudbalski klub je postigao ukupno " + ok.ukupnoPoena() + " poena.");
        ok.ukupnoPoena();
        ok.vrednostTima();
        ok.odbrambeniAs();


    }




}
