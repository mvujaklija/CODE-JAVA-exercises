public class Profesor extends Osoba{

    String predmet;
    boolean daLiJeRedovan;

    //getteri i setteri
    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public boolean isDaLiJeRedovan() {
        return daLiJeRedovan;
    }

    public void setDaLiJeRedovan(boolean daLiJeRedovan) {
        this.daLiJeRedovan = daLiJeRedovan;
    }

    public Profesor(String ime, String prezime, String pol, String predmet, boolean daLiJeRedovan) {
        super(ime, prezime, pol);
        this.predmet = predmet;
        this.daLiJeRedovan = daLiJeRedovan;
    }

    //@Override
    public void stampaj() {
        super.stampaj();
        Main.stampaj(" predmet " + this.predmet + " daLiJeRedovan =" + daLiJeRedovan);
    }

}
