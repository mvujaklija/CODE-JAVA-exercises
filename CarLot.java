/** This is a clas where we define object and all of his parameters.
 * We do that over getters and setters
 * example of getter and setter is
 * public String setbrand( ) { return brand; }
 * public void getbrend (String brand) { this.brand = brand;}
 */

package Cars;

public class CarLot {


    //Declaration of variables
     private String brand;
     private String model;
     private String color;
     private String fuel;
     String condition;
     private String body;

    //Declaration of constructor

    public  CarLot ( String brand, String model, String color, String fuel, String condition , String body ) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.fuel = fuel;
        this.condition = condition;
        this.body = body;
    }

    public CarLot ( ) {

    }

    //Declaration of getters and setters
    public String getbrand ( ) { return brand; }
    public void setbrand ( String brand ) { this.brand = brand; }
    public String getmodel ( ) { return model; }
    public void setmodel ( String model ) { this.model = model; }
    public String getcolor ( ) { return color; }
    public void setcolor ( String color ) { this.color = color; }
    public String getfuel ( ) { return fuel; }
    public void setfuel ( String fuel ) { this.fuel = fuel; }
    public String getcondition ( ) { return condition; }
    public void setcondition ( String condition ) { this.condition = condition; }
    public String getbody ( ) { return body; }
    public void setbody ( String body ) { this.body = body; }



    //Declaration of print in main

    public String toString( ) { return ( "Brand: " + getbrand ( ) + "  Model: " + getmodel ( ) + "  Color: " + getcolor ( ) + "  Type of fuel: " + getfuel ( ) + "  Condition of car: " + getcondition ( ) + "  Type of body: " + getbody ( ) );
    }

}