public class Zadatak4 {
    public static void main(String[] args) {

     //4. Napraviti program koji uzme kreiran niz
     // i napravi drugi niz od postojeceg samo sa obrnutim redosledom clanova
     // Na primer ako prvi niz ima clanove {1,2,3} onda drugi niz treba da ima clanove {3,2,1}


     int nizA [] = {1, 5, 10, 15, 22, 23, 55};
     int nizB [] = new int [nizA.length];

     int brojač = 0;

    for (int i = nizB.length - 1; i >= 0; i-- ) {
         nizB [brojač] = nizA[i];
         brojač++;
    }

        for (int i = 0; i < nizB.length; i++) {
            System.out.println("Element na poziciji " + i + " je " + nizB[i]);
        }






    }
}
