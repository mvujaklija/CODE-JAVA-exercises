package Cars;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {




    public static void main ( String[] args ) {

        ArrayList < CarLot  > listofcars = importArrayCars ( );

         for ( CarLot car : ( listofcars ) ) {
             System.out.println ( car );

        }

    }

        //Declaration of method for text
    public static void text ( String txt ) { System.out.println ( txt ); }

    //Declaration of Array list Car and inputting data for car
    public static ArrayList < CarLot > importArrayCars ( ) {

        ArrayList < CarLot > listOfCars = new ArrayList <> ( );
        Scanner scanner = new Scanner ( System.in );
        while ( true ) {
            text ( "Import data that is requested from you. \n For details of the car input (C)). \n For more details of the car input (D) \n If you want to stop input type (stop) for termination of program" );
            String command = scanner.next ( );
            if ( command.equals ( "stop" ) )
                break;
            switch ( command ) {
                case "C" :
                    text ( "Input Brand: " );
                    String brand = scanner.next ( );
                    text ( "Input Model: " );
                    String model = scanner.next ( );
                    text ( "Input the color of the car: " );
                    String color = scanner.next ( );
                    text ( "Input type of fuel: " );
                    String fuel = scanner.next ( );
                    text ( "Input Condition of car (Used / New): " );
                    String condition = scanner.next ( );
                    text ( "Input Typ of body (Limousine,SUV,Hatchback, Caravan: ) " );
                    String body = scanner.next ( );
                    CarLot car = new CarLot ( brand, model, color, fuel, condition, body );
                    listOfCars.add( ( CarLot ) car );
                    break;

                    case "D" :

                    text ( "Input year of production: " );
                    int year = scanner.nextInt ( );
                    text ( "Input price: " );
                    int price = scanner.nextInt ( );
                    text ( "Input volume of engine: " );
                    int cC = scanner.nextInt ( );
                    text ( "Input power in kW: " );
                    int power = scanner.nextInt ( );
                    text ( "Input type of drive: " );
                    String drive = scanner.next ( );
                    text ( "Input type of transmission: " );
                    String transmission = scanner.next ( );
                    text ( "Input type of air-condition: " );
                    String aircondition = scanner.next ( );
                    Details details = new Details ( year, price, cC, power, drive, transmission, aircondition );
                    listOfCars.add ( ( Details ) details );
                    break;
                        default:
                            text ( "You input the wrong command!" );
                    }
        }
        return listOfCars;
   }
}


