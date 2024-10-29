package E_Igrac;

import java.util.ArrayList;

public class KosarkaskiKlub extends Klub{

    public KosarkaskiKlub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    public String sampionTima() {
        String rez = "Nijedan igrac nema vise od 1000 poena.";
        for (Igrac i : super.getListaIgraca()) {
            if (i.getBrojPostignutihPoena() > 1000) {
                rez = i.getIme() + " ima vise od 1000 postignutih poena.";
            }
        }
        System.out.println(rez);
        return rez;
    }

    @Override
    public int vrednostTima() {
        int suma = super.ukupnoPoena() * 50;
        System.out.println("Vrednost kosarkaskog tima je: " + suma + ".");
        return suma;
    }
}
