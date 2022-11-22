public class Osoba {

    private String ime;
    private String prezime;
    private String pol;

    //getteri i setteri za ime
    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    //getteri i setteri za prezime


    public String getPrezime() {
        return prezime;
    }

    //getteri i setteri za pol
    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getPol() {
        return pol;
    }

    public Osoba() {}

    public Osoba(String ime, String prezime, String pol) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
    }

    public void stampaj() {
        Main.stampaj("Ime:" + getIme() + " , prezime: " + getPrezime() + " , pol: " + getPol());
    }

}
