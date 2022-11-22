public class StringPrimeri {

    public static void main(String[] args) {

        String primerStringa = "Ovo je jedan string";
        System.out.println(primerStringa);

//        String malaSlova = primerStringa.toLowerCase();
//        System.out.println(malaSlova);
//
//        String velikaSlova = primerStringa.toUpperCase();
//        System.out.println(velikaSlova);
//
//        String spojeniStringovi = malaSlova + velikaSlova;
//        System.out.println(spojeniStringovi);

        int duzinaStringa = primerStringa.length();
        System.out.println("Broj karaktera je " + duzinaStringa);
        String zamena = primerStringa.replace("j", "1");
        System.out.println(zamena);

    }

}
