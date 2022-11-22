public class Variables {

    //ovo je komentar
    /*
    ovo je komentar
    u vise redova
     */

    //ovo je glavna metoda koja nam sluzi sa pustanje naseg progama
    public static void main(String []args) {
//        System.out.println("Ovo se ispisuje u konzoli");
//        System.out.println("Ovde radimo varijable");
        //ovde kucamo varijable
        //dekleracija
        int varijabla;
        //inicijalizacija
//        varijabla = 50;
//        System.out.println("Vrednost varijable je = " + varijabla);


        //dekleracija i inicijalizacija istovremeno
        int broj = 20;

        //primeri primitivnih tipova podataka
        double decimalanBroj = 34.54;

        char jedanKarakter = '2';
        boolean tacnoIliNetacno = true;

        //aritmeticki operatori
//        int x = 50;
//        int y = 23;
//        int zbir;
//        zbir = x + y;
//        System.out.println("Zbir brojeva " + x + " i " + y + " je " + zbir);

//        String nizKaraktera = "Ovo je String";
//        String josJedanString = " a ovo je drugi string";
//        String zbirStringova = nizKaraktera + josJedanString;
//        System.out.println(zbirStringova);

        // ++ primer
        int x = 25;
        System.out.println("prvo je x = " + x);
        x--;
        System.out.println("posle je x = " + x);
        x+=45;
        System.out.println("posle sabiranja je x = " + x);


        double a = 20;
        double b = 3;
        double deljenje = a/b;
        System.out.println("Vrednost deljenja " + a + " i " +  b + " je " + deljenje);









    }
}
