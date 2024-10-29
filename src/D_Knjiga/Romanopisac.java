package D_Knjiga;

import java.util.ArrayList;

public class Romanopisac extends Pisac {
    public Romanopisac(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga) {
        super(ime, godinaRodjenja, listaKnjiga);
    }

    public void dugometrazniRoman() {
        int brojac = 0;
        for (Knjiga k : super.getListaKnjiga()) {
            if (k.getBrojStrana() > 500) {
                brojac++;
                System.out.println("\"" + k.getNaslov() + "\" je dugometrazni roman.");
            }
        }
        if (brojac == 0) {
            System.out.println("Ovaj pisac nema dugometrazne romane.");
        }
    }


}
