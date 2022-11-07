import java.util.Scanner;

public class Exercise_for {

//Declaration of main method

    public static void main(String[] args) {

        //Declaration of terminal input

        Scanner scanner = new Scanner(System.in);
        println.sentence ("Enter an integer: ");

        //Declaration of variables

        int myNumber = scanner.nextInt();

        //Declaration of FOR loop

        for (int i = 1; i < 6; i = i + 1) {

            //Declaration of IF condition

            if (i == 1) {

                //Declaration of printing first number

                print.sentence ("Number that I enter in terminal is: ") ;
				print.integer (myNumber);
				println.sentence ("");

            } else {

                    myNumber = myNumber + 1;

                    print.sentence ("My number that I enter in terminal increased for ");
					print.integer (i -1);
					print.sentence ( " is: ");
					print.integer (myNumber);
					println.sentence ("");
		
            }
        }
    }
}



