package D_Knjiga;

import java.util.ArrayList;

public class Esejista extends Pisac{
    public Esejista(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga) {
        super(ime, godinaRodjenja, listaKnjiga);
    }

    public int kratkiEseji() {
        int brojac = 0;
        for (Knjiga k : super.getListaKnjiga()) {
            if (k.getBrojStrana() < 50) {
                brojac++;
            }
        }
        System.out.println("Broj eseja pisca " + super.getIme() + " je " + brojac + ".");
        return brojac;
    }
}
