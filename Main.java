import Student.Osoba;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList< Osoba > nizOsoba = ucitajNizOsoba ( );
       stampajStudente(nizStudenata);
//        istampajStudenteNaBudgetu(nizOsoba);
        istampajRedovneProfesorkeJave(nizOsoba);
    }

    public static void stampaj(String s) {
        System.out.println(s);
    }

    public static ArrayList<Osoba> ucitajNizOsoba() {
        ArrayList<Osoba> nizOsoba = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            stampaj("Unesi (S) za studenta, (P) za profesora, (A) za asistenta ili (stop) za prekid programa");
            String komanda = scanner.next();
            if(komanda.equals("stop")) break;
            stampaj("Unesi ime");
            String ime = scanner.next();
            stampaj("Unesi prezime");
            String prezime = scanner.next();
            stampaj("Unesi pol");
            String pol = scanner.next();
            switch (komanda) {
                case "S" :
                    stampaj("Unesi broj indexa");
                    int brojIndexa = scanner.nextInt();
                    stampaj("Unesi godinu upisa");
                    int godinaUpisa = scanner.nextInt();
                    stampaj("Unesi godinu studija");
                    int godinaStudija = scanner.nextInt();
                    stampaj("Unesi da li je na budgetu");
                    boolean daLiJeNaBudzetu = scanner.nextBoolean();
                    Student student = new Student(ime, prezime, pol, brojIndexa, godinaUpisa, godinaStudija, daLiJeNaBudzetu);
                    nizOsoba.add(student);
                    break;
                case "P" :
                    stampaj("Unesi predmet");
                    String predmetProfesora = scanner.next();
                    stampaj("Unesi da li je na redovan");
                    boolean daLiJeRedovanProfesor = scanner.nextBoolean();
                    Profesor profesor = new Profesor(ime, prezime, pol, predmetProfesora, daLiJeRedovanProfesor);
                    nizOsoba.add(profesor);
                    break;

                case "A" :
                    stampaj("Unesi predmet");
                    String predmetAsistenta = scanner.next();
                    stampaj("Unesi da li je na redovan");
                    boolean daLiJeRedovanAsistent = scanner.nextBoolean();
                    stampaj("Unesi fond casova");
                    int fondCasova = scanner.nextInt();
                    Asistent asistent = new Asistent(ime, prezime, pol, predmetAsistenta, daLiJeRedovanAsistent, fondCasova);
                    nizOsoba.add(asistent);
                default:
                    stampaj("Nisi uneo dobru komandu");
                    break;
            }
        }
        return nizOsoba;
    }

    public static void stampajStudente(ArrayList<Student> nizStudenata) {
        //ovo je primer obicne for petlje
        //        for(int i=0; i<nizStudenata.size(); i++) {
//            Student studentUNizu = nizStudenata.get(i);
//            studentUNizu.stampaj();
//        }

        //ovo je primer foreach petlje
        for (Student studentUNizu : nizStudenata) {
            studentUNizu.stampaj();
        }
    }




    public static void istampajStudenteNaBudgetu(ArrayList<Osoba> nizOsoba) {
        for (Osoba osoba : nizOsoba) {
            if(osoba instanceof Student) {
                //castovanje
                Student student = (Student) osoba;
                if(student.isDaLiJeNaBudzetu()==true) {
                    osoba.stampaj();
                }
            }
        }
    }

//TODO domaci
    //istampaj sve studentkinje na budzetu - domaci
    //istampaj sve studente koji su upisali posle 2010
    //istampaj sve studente po starom statutu (upisali pre 2005)
    //istampaj sve asistente na predmetu java
    //istampaj prosek godina studiranja za sve studente



    public static void istampajRedovneProfesorkeJave(ArrayList<Osoba> nizOsoba) {
        for (Osoba osoba: nizOsoba) {
            if(osoba instanceof Profesor) {
                //castovanje
                Profesor profesor = (Profesor) osoba;
                if(profesor.getPol().equals("zenski") && profesor.isDaLiJeRedovan()) {
                    stampaj("Profesor je zenskog pola i redovan");
                    profesor.stampaj();
                }
            }
        }
    }

}
