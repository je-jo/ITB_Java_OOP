package E_Igrac;

import java.util.ArrayList;

public class OdbojkaskiKlub extends Klub {

    public OdbojkaskiKlub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    public String odbrambeniAs() {
        String rez;
        ArrayList<Igrac> listaManjeOdTriGodine = new ArrayList<>();
        for (Igrac i : super.getListaIgraca()) {
            if (i.getGodineIskustva() < 3) {
                listaManjeOdTriGodine.add(i);
            }
        }
        if (listaManjeOdTriGodine.size() > 0) {
            Igrac najOdbrana = listaManjeOdTriGodine.get(0);
            for (Igrac i : listaManjeOdTriGodine) {
                if (i.getBrojPostignutihPoena() > najOdbrana.getBrojPostignutihPoena()) {
                    najOdbrana = i;
                }
            }
            rez = "Igrac koji je igrao manje od 3 godina a ima najvise poena je " + najOdbrana.getIme() + ".";
        } else {
            rez = "Svi igraci igraju duze od 3 godine.";
        }
        System.out.println(rez);
        return rez;

    }

    @Override
    public int vrednostTima() {
        int suma = super.ukupnoPoena() * 100;
        System.out.println("Vrednost odbojkaskog tima je: " + suma + ".");
        return suma;
    }
}
