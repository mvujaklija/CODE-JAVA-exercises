public class Asistent extends Profesor{

    int fondCasova;
    //getteri i setteri

    public Asistent(String ime, String prezime, String pol, String predmet, boolean daLiJeRedovan, int fondCasova) {
        super(ime, prezime, pol, predmet, daLiJeRedovan);
        this.fondCasova = fondCasova;
    }


    //override
    public void stampaj() {
        super.stampaj();
        Main.stampaj(" fond Casova " + this.fondCasova);
    }

}
