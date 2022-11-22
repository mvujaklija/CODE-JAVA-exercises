import java.util.Scanner;

public class ForPetlja {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Unesi ocenu za polaznike ovog kursa (od 5 do 10)");
//        int ocena = scanner.nextInt();

//        for (int brojac = 0; brojac<5; brojac++) {
//            System.out.println("Vrednost brojaca  = " + brojac);
//        }

        int varijablaVanBloka = 56;
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            int x = 34;
            x +=varijablaVanBloka;
        }


        int zbir = 0;
        int[] niz = {45,56,345,234};
        for (int clanNiza: niz) {
            //ovo je varijabla u bloku
//            int zbir = 0;
            zbir += clanNiza;
        }
        System.out.println("zbir je" + zbir);
    }

}
