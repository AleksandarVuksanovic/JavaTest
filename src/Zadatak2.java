import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

    //2. Napraviti program koji, koristeci WHILE petlju,
    // racuna proizvod unetih brojeva sve dok korisnik ne unese 0

    Scanner s = new Scanner(System.in);
    int proizvod = 1;

    int i = 1;
    while (i != 0) {
        System.out.println("Unesite broj: ");
        i = s.nextInt();
        if (i != 0) {proizvod = proizvod * i;}
    }

        System.out.println("Proizvod unetih brojeva je: " + proizvod);


    }
}
