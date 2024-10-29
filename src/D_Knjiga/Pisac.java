package D_Knjiga;

import java.util.ArrayList;

public abstract class Pisac {

    private String ime;
    private int godinaRodjenja;
    private ArrayList<Knjiga> listaKnjiga;

    public Pisac(String ime, int godinaRodjenja, ArrayList<Knjiga> listaKnjiga) {
        this.ime = ime;
        this.godinaRodjenja = godinaRodjenja;
        this.listaKnjiga = listaKnjiga;
    }

    private Knjiga knjigaSaMaxStrana() {
        Knjiga knjigaSaMaxStrana = listaKnjiga.get(0);
        for (Knjiga k : listaKnjiga) {
            if (k.getBrojStrana() > knjigaSaMaxStrana.getBrojStrana()) {
                knjigaSaMaxStrana = k;
            }
        }
        return knjigaSaMaxStrana;
    }

    public String najpoznatijaKnjiga() {
        String najpoznatijaKnjiga = knjigaSaMaxStrana().getNaslov();
        System.out.println("Najpoznatija knjiga pisca " + getIme() + " je \"" + najpoznatijaKnjiga + "\".");
        return najpoznatijaKnjiga;
    }

    private int godPrveKnjige() {
        int godinaPrveKnjige = listaKnjiga.get(0).getGodinaIzdavanja();
        for (Knjiga k : listaKnjiga) {
            if (k.getGodinaIzdavanja() < godinaPrveKnjige) {
                godinaPrveKnjige = k.getGodinaIzdavanja();
            }
        }
        return godinaPrveKnjige;
    }

    private int godPoslednjeKnjige() {
        int godinaPoslednjeKnjige = listaKnjiga.get(0).getGodinaIzdavanja();
        for (Knjiga k : listaKnjiga) {
            if (k.getGodinaIzdavanja() > godinaPoslednjeKnjige) {
                godinaPoslednjeKnjige = k.getGodinaIzdavanja();
            }
        }
        return godinaPoslednjeKnjige;
    }

    public int vremePisanja() {
        int vremePisanja = godPoslednjeKnjige() - godPrveKnjige();
        if (vremePisanja <= 1) {
            System.out.println("Pisac je pisao jednu godinu ili manje.");
        } else {
            System.out.println("Pisac je pisao " + vremePisanja + " godina.");
        }
        return vremePisanja;
    }

    // geteri seteri


    public String getIme() {
        return ime;
    }

    public ArrayList<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    // toString

    public String toString() {
        return "Ime pisca: " + ime + "; rodjen " + godinaRodjenja + ". godine.";
    }


}
