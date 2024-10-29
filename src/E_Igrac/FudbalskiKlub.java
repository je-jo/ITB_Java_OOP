package E_Igrac;

import java.util.ArrayList;

public class FudbalskiKlub extends Klub {


    public FudbalskiKlub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    public String najboljiStrelac() {
        Igrac najStrelac = super.getListaIgraca().get(0);
        for (Igrac i : super.getListaIgraca()) {
            if (i.getBrojPostignutihPoena() > najStrelac.getBrojPostignutihPoena()) {
                najStrelac = i;
            }
        }
        System.out.println("Najbolji strelac je " + najStrelac.getIme() + ".");
        return najStrelac.getIme();
    }

    @Override
    public int vrednostTima() {
        int suma = super.ukupnoPoena() * 1000;
        System.out.println("Vrednost fudbalskog tima je: " + suma + ".");
        return suma;
    }
}
