import java.util.Scanner;



public class NizoviPrimeri {


    public static void main(String[] args) {

//        int[] nizCelihBrojeva = {3, 4, 6, 7};
//        System.out.println("Prvi clan niza " + nizCelihBrojeva[0]);
//        System.out.println("Drugi clan niza " + nizCelihBrojeva[1]);
//        System.out.println("Treci clan niza " + nizCelihBrojeva[2]);
//        System.out.println("Cetvrti clan niza " + nizCelihBrojeva[3]);

        //stapmanje clanova niza koristeci standardnu for petlju
//        for (int i = 0; i< nizCelihBrojeva.length; i ++) {
//            System.out.println("Clan niza na " + i + ". mestu je " + nizCelihBrojeva[i]);
//        }

//        int sumaClanovaNiza = 0;
//        for (int i = 0; i< nizCelihBrojeva.length; i ++) {
//            sumaClanovaNiza += nizCelihBrojeva[i];
//        }

        //proizvod clanova niza
//        int prozivodCLanovaNIza= 1;
//        for (int i = 0; i< nizCelihBrojeva.length; i ++) {
//            prozivodCLanovaNIza *= nizCelihBrojeva[i];
//        }
//        System.out.println("Proizvod clanova niza je " +  prozivodCLanovaNIza);

        //ovako se pravi prazan niz od 10 integera (celih brojeva)
//        int[] nizKojiSeUnosiKrozKonzolu = new int[10];


        //maksimalan clan niza
//        int[] nekiNiz = {4,7,2,9,45,3};
//        int max = nekiNiz[0];
//        for(int i=1; i<nekiNiz.length; i++) {
//            int sledeciCLan = nekiNiz[i];
//            if (sledeciCLan>max) {
//                max = sledeciCLan;
//            }
//        }
//        System.out.println("Najveci clan niza je " + max);



        //unosenje clanova niza koristeci Scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi broj clanova niza");
        int brojClanova = scanner.nextInt();

        int[] niz = new int[brojClanova];

        for (int i = 0 ; i < niz.length ; i ++) {
            System.out.println("Unesi " + i + " clan niza");
            int clan = scanner.nextInt();
            niz[i] = clan;
        }
        System.out.println("Clanovi niza su:");
//        for (int i = 0; i < niz.length; i ++) {
//            System.out.println(i + "." + " " + niz[i]);
//        }

        //ovo je enhanced for loop
        for (int clanNiza : niz) {
            System.out.print(clanNiza);
            System.out.print(",");
        }






    }

}
