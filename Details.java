/** This is a clas where we define object and all of his parameters.
 * We do that over getters and setters
 * example of getter and setter is
 * public String setbrand( ) { return brand; }
 * public void getbrend (String brand) { this.brand = brand;}
 */

package Cars;

public class Details extends CarLot {

    //Declaration of variables
    int year;
    int price;
    int cC;
    int power;
    String drive;
    String transmission;
    String aircondition;

    //Declaration of constructor

    public Details ( int year, int price, int cC, int power, String drive, String transmission, String aircondition ) {
        this.year = year;
        this.price = price;
        this.cC = cC;
        this.power = power;
        this.drive = drive;
        this.transmission = transmission;
        this.aircondition = aircondition;

    }

    //Declaration of getters and setters


    public int getYear ( ) { return year; }
    public void setYear ( int year ) { this.year = year; }
    public int getPrice ( ) { return price; }
    public void setPrice ( int price ) { this.price = price; }
    public int getcC ( ) { return cC; }
    public void setcC ( int cC ) { this.cC = cC; }
    public int getPower ( ) { return power; }
    public void setPower ( int power ) { this.power = power; }
    public String getDrive ( ) { return drive; }
    public void setDrive ( String drive ) { this.drive = drive;}
    public String getTransmission ( ) { return transmission; }
    public void setTransmission ( String transmission ) { this.transmission = transmission; }
    public String getAircondition ( ) { return aircondition; }
    public void setAircondition ( String aircondition ) { this.aircondition = aircondition; }

    //Declaration of print in main

    public String toString( ) { return ( "Year of production: " + year + "  Price: " + price + "  Volume of engine: " + cC + "  Power in kW: " + power + "  Type of drive: " + drive + "  Type of transmission" + transmission + "  Type of air condition: " + aircondition );
    }

}
