import java.util.Scanner;

public class WhileIDoWhilePetlje {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi broj");
        int broj = scanner.nextInt();

        while (broj<5) {
            System.out.println("Broj je" + broj);
            broj++;
        }

//    do {
//            System.out.println("broj je" + broj);
//            broj++;
//        } while (broj<10);



    }

}
