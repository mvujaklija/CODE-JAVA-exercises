public class BasicOperators {

    //Declaration of main method

    public static void main(String[] args) {

    //Declaration of variables
    
    String r = "Result of our mathematical calculation is: ";
    double a = 5;
    double b = 6;
    double c = 11;
    double d = 8;
    double e = 23;

    //Declaration of expression result that we are going to calculate

    double result;

    //Declaration of expression tht we want to calculate
    
        result = (a * (c - ((a + (b * d)) / d))) - e;

    /* In the statement result there is one important thing that Nikola did not mention
    and  this is ORDER of operations in JAVA
     * First operation is brackets
     * Next operation is exponent which I did not use here
     * Next operation is multiplication
    * Next operation is division
    * Next operation is modulo which I did not use here
    * Next operation is addition
    * And final operation is subtraction

    So calculation steps will follow this rules :
    * first is b*d=48
    * next is a+48=53
    * next is 53/d=6.625
    * next is c-625=4.375
    * next is a*4.357=21.875
    * and final 21.875-e=-1.125

    */

    //Declaration of printing result in terminal

        print.sentence(r);
        print.dnum(result);


    }
}



