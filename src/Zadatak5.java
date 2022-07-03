import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

    // 5. Napisati program koji racuna potrosnju goriva. Korisnik unosi distancu, tip vozila i tip goriva,
    // a program ispisuje koliko ce goriva biti potroseno i koja je ukupna cena.
    //Motor trosi 5 litara na 100 km
    //Automobil trosi 9 litara na 100 km
    //Kamion trosi 15 litara na 100 km
    //Tipovi goriva su:
    //Benzin kosta 170 dinara po litru
    //Dizel kosta 190 dinara po litru
    //Zadatak raditi kroz switch i pokriti samo happy flow uz default


    Scanner s = new Scanner(System.in);

    System.out.println("Unesite distancu");
    double distanca = s.nextDouble();

    System.out.println("Unesite tip vozila (motor, automobil, kamion): ");
    String vozilo = s.next();

    System.out.println("Unesite tip goriva (benzin, dizel): ");
    String gorivo = s.next();


    double potošnjaMotor = distanca * 0.05;
    double potrošnjaAutomobila = distanca * 0.09;
    double potrošnjaKamiona = distanca * 0.15;



    switch (vozilo) {
        case "motor":
            if (gorivo.equals("benzin")) {
                System.out.println("Potrošeno je " + potošnjaMotor + " litara i cena goriva je " + (potošnjaMotor * 170) + " dinara.");
            } else if (gorivo.equals("dizel")) {
                System.out.println("Potrošeno je " + potošnjaMotor + " litara i cena goriva je " + (potošnjaMotor * 190) + " dinara.");
            }
            break;
        case "automobil":
            if (gorivo.equals("benzin")) {
                System.out.println("Potrošeno je " + potrošnjaAutomobila + " litara i cena goriva je " + (potrošnjaAutomobila * 170) + " dinara.");
            } else if (gorivo.equals("dizel")) {
                System.out.println("Potrošeno je " + potrošnjaAutomobila + " litara i cena goriva je " + (potrošnjaAutomobila * 190) + " dinara.");
            }
            break;
        case "kamion":
            if (gorivo.equals("benzin")) {
                System.out.println("Potrošeno je " + potrošnjaKamiona + " litara i cena goriva je " + (potrošnjaKamiona * 170) + " dinara.");
            } else if (gorivo.equals("dizel")) {
                System.out.println("Potrošeno je " + potrošnjaKamiona + " litara i cena goriva je " + (potrošnjaKamiona * 190) + " dinara.");
            }
      break;
        default:
            System.out.println("Niste uneli ispravne podatke.");
    }





    }
}
