package primerKlasePas;

public class Pas {

    String rasa;
    int godine;
    String boja;

    //defaultni konstruktor
    public Pas() {}

    public Pas(String rasaPsa, String bojaPsa) {
        rasa = rasaPsa;
        boja = bojaPsa;
    }


    //ovo je overrideovan konstrutkor
    public Pas(String rasaPsa, int godinePsa, String bojaPsa) {
        rasa = rasaPsa;
        godine = godinePsa;
        boja = bojaPsa;
    }

    public void laj() {
        System.out.println("av av av");
    }


    public void stampajPsa() {
        System.out.println("Uneli smo psa " + rasa + " , " + boja + " , " + godine);
    }
}
