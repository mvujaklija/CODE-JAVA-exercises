public class Student extends Osoba{

    int brojIndexa;
    int godinaUpisa;
    int godinaStudija;
    boolean daLiJeNaBudzetu;

    //getteri i setteri

    public boolean isDaLiJeNaBudzetu() {
        return this.daLiJeNaBudzetu;
    }

   {
        return brojIndexa;
    }

    //konstrukor
    public Student(String ime, String prezime, String pol, int brojIndexa, int godinaUpisa,int godinaStudija, boolean daLiJeNaBudzetu) {
        super ( );
        this.brojIndexa = brojIndexa;
        this.godinaUpisa = godinaUpisa;
        this.godinaStudija = godinaStudija;
        this.daLiJeNaBudzetu = daLiJeNaBudzetu;
    }

    //@Override
    public void stampaj() {
        super.stampaj();
        Main.stampaj(" broj indexa " + brojIndexa + "/" + godinaUpisa + " , godina studija " + godinaStudija + " budget =" + daLiJeNaBudzetu);
    }

}
