import java.util.Scanner;

public class SwitchPrimer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi ocenu za polaznike ovog kursa (od 5 do 10)");
        int ocena = scanner.nextInt();

        switch (ocena) {
            case 5 :
                System.out.println("Nedovoljno. Vidimo se u sledecem roku");
                break;
            case 6 :
                System.out.println("Prolazno");
                break;
            case 7 :
                System.out.println("Dovoljan");
                break;
            case 8 :
                System.out.println("Dobar");
                break;
            case 9 :
                System.out.println("Vrlo dobar");
                break;
            case 10 :
                System.out.println("Savrseno");
                break;
            default:
                System.out.println("Niste uneli validnu ocenu");
        }

    }

}
