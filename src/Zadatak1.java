public class Zadatak1 {
    public static void main(String[] args) {

     //1. Napraviti program koji nalazi najveci broj u nizu
     // i vraca informaciju da li je taj najveci broj paran

        int niz [] = {1, 10, 23, 45, 56, 77, 99, 19};

        int max = 0;

        for (int i = 0; i < niz.length; i++) {
            if (niz [i] > max) {max = niz [i];}
        }

        System.out.print("Najveći broj u nizu je " + max);
        if (max % 2 == 0) {
            System.out.println(" i broj je paran");
        } else {
            System.out.println(" i broj nije paran");
        }


    }
}
