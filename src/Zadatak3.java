import java.util.Scanner;

public class Zadatak3 {
    //Aleksandar Vuksanović
    public static void main(String[] args) {

    // 3. Napraviti program koji racuna koliko puta se neki broj pojavljuje u nizu.
    // Korisnik preko skenera unese koji broj zeli da prebroji u nizu

    Scanner s = new Scanner(System.in);

    int niz1 [] = {10, 4, 5, 11, 22, 22, 34, 34, 5, 5, 5, 2, 1, 5, 3, 6, 1, 8, 10};
     System.out.println("Unesite broj za proveru");
     int broj = s.nextInt();
     int count = 0;

     for (int i = 0; i < niz1.length; i++) {
         if (broj == niz1[i]) {
             count = count + 1;
         }
         }

     if (count > 0) {System.out.println("Uneti broj se ponavlja " + count + " puta u nizu.");}
     else {
         System.out.println("Uneti broj ne postoji u nizu");
     }


     }


    }
