public class BreakIContinuePrimeri {

    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
            if(i == 5) {
                System.out.println("Ako je 5 = 5 vise se ne izvrsava petlja");
                break;
            }
        }
    }

}
