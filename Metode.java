public class Metode {


    public static int zbir(int sabirak1, int sabirak2) {
        System.out.println("Izracunaj mi zbir " + sabirak1 + " i " + sabirak2);
        int zbir = sabirak1 + sabirak2;
        System.out.println("Zbir je " + zbir);
        return zbir;
    }

    public static void stampaj(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int z = zbir(a , b);
        int d = zbir(66578, 8678);
        int g = zbir(435678, 8634567);

        int varijableUbloku = 45;
        stampaj("sta godd");
        stampaj("ovo je primer void metode");

    }




}
