package D_Knjiga;

public class Knjiga {

    private String naslov;
    private int brojStrana;
    private int godinaIzdavanja;

    public Knjiga(String naslov, int brojStrana, int godinaIzdavanja) {
        this.naslov = naslov;
        this.brojStrana = brojStrana;
        this.godinaIzdavanja = godinaIzdavanja;
    }

    // geteri seteri

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }

    public int getGodinaIzdavanja() {
        return godinaIzdavanja;
    }

    public void setGodinaIzdavanja(int godinaIzdavanja) {
        this.godinaIzdavanja = godinaIzdavanja;
    }


    // toString

    public String toString() {
        return "Naslov: \"" + naslov + "\"; Broj strana: " + brojStrana + "; godinaIzdavanja: " + godinaIzdavanja + ".";
    }
}
