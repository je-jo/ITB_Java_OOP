package D_Knjiga;

import java.util.ArrayList;

public class Pesnik extends Pisac {
    public Pesnik(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga) {
        super(ime, godinaRodjenja, listaKnjiga);
    }

    public int brojZbirki() {
        int brojac = 0;
        for (Knjiga k : super.getListaKnjiga()) {
            if (k.getBrojStrana() < 100) {
                brojac++;
            }
        }
        System.out.println("Broj zbirki pisca " + super.getIme() + " je " + brojac + ".");
        return brojac;
    }
}
