package E_Igrac;

import java.util.ArrayList;

public abstract class Klub {

    private String naziv;
    private String grad;
    private ArrayList<Igrac> listaIgraca;

    public Klub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        this.naziv = naziv;
        this.grad = grad;
        this.listaIgraca = listaIgraca;
    }

    public String najiskusnijiIgrac() {
        Igrac najiskIgrac = listaIgraca.get(0);
        for (Igrac i : listaIgraca) {
            if (i.getGodineIskustva() > najiskIgrac.getGodineIskustva()) {
                najiskIgrac = i;
            }
        }
        System.out.println("Najiskusniji igrac je " + najiskIgrac.getIme() + ".");
        return najiskIgrac.getIme();
    }

    public int ukupnoPoena() {
        int suma = 0;
        for (Igrac i : listaIgraca) {
            suma += i.getBrojPostignutihPoena();
        }
        return suma;
    }

    public abstract int vrednostTima();

    // geteri seteri


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public ArrayList<Igrac> getListaIgraca() {
        return listaIgraca;
    }

    public void setListaIgraca(ArrayList<Igrac> listaIgraca) {
        this.listaIgraca = listaIgraca;
    }

    // toString

    public String toString() {
        return "Naziv kluba: " + naziv + "; Grad: " + grad + "; Lista igraca: " + listaIgraca + ".";
    }
}
