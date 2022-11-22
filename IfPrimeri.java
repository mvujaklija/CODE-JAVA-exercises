import java.util.Scanner;

public class IfPrimeri {

    public static void main(String[] args) {

        int x = 10;

        if (x>8) {
            System.out.println("vece od 8");
        } else {
            System.out.println("manje od 8");
        }


        if(x>8) {
            System.out.println("vece je od 8");
        } else if (x>5) {
            System.out.println("vece je od 5 a manje od 8");
        } else if (x>3) {
            System.out.println("vece od 3 a manje od 5");
        } else {
            System.out.println("manje od 3");
        }



        //scanner je za unos iz terminala
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Unesi ceo broj");
        //ovo je za unosenje celog broja u terminalu i snimanju u varijablu
//        int varijablaSaTerminala = scanner.nextInt();
//
////        int x = 10;
//        if(varijablaSaTerminala>9) {
//            System.out.println("Ovo je u if bloku");
//            System.out.println("Ovaj broj nije jedocifren");
//        }
//        System.out.println("ovo je van if bloka");

        //ovo je primer if else uslovne naredbe
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Unesi neki celi broj");
//        int broj = scanner.nextInt();
//
//        if(broj<10) {
//            System.out.println("Broj je jednocifren");
//        } else {
//            System.out.println("Broj je veci od 10 , sto znaci da nije jednocifren");
//        }
//        System.out.println("Ovo je van if else bloka");

        //ovo je primer za veci broj
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Unesi prvi celi broj");
//        int a = scanner.nextInt();
//        System.out.println("Unesi drugi celi broj");
//        int b = scanner.nextInt();
//
//        if(a>b) {
//            System.out.println("Prvi broj je veci " + a + ">" + b);
//        } else {
//            System.out.println("Drugi broj je veci " + b + ">" + a);
//        }


        //ovo je nested (ugnjezdnjen if)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi neki celi broj");
        int a = scanner.nextInt();

//        if(a>9) {
//            if(a>99) {
//                System.out.println("Ovaj broj " + a + " je trocifren");
//            } else {
//                System.out.println("Ovaj broj je dvocifren");
//            }
//        } else {
//            System.out.println("OVaj broj je jednocifren");
//        }
   }

}
