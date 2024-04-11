import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int[][] matr2;
        int righe2, colonne2;

        System.out.println("damminumero di righe");
        righe2 = t.nextInt();
        System.out.println("dammi numerodi colonne");
        colonne2 = t.nextInt();
        if (colonne2 != righe2)
            System.out.println("devi darmi due valori uguali");
        else {
            matr2 = new int[righe2][colonne2];
            for (int i = 0; i < colonne2; i++) {
                for (int p = 0; p < righe2; p++) {
                    System.out.println("dammi valore da inseire");
                    matr2[i][p] = t.nextInt();
                }
            }

            // stampa
            for (int i = 0; i < matr2.length; i++) {
                for (int p = 0; p < matr2[i].length; p++) {
                    System.out.print(matr2[p][i] + " ");
                }
                System.out.println();
            }

            // terzo es
            if (Simmetria(matr2))
                System.out.println("la matrice è simmetrica rispetto alla diagonale");
            else
                System.out.println("la matrice non è simmetrica rispetto alla diagonale");

            // stampa
            for (int i = 0; i < matr2.length; i++) {
                for (int p = 0; p < matr2[i].length; p++) {
                    System.out.print(matr2[p][i] + " ");
                }
                System.out.println();
            }
        }
    }

    private static boolean Simmetria(int[][] matr) {
        boolean uguali = true;
        for (int i = 0; i < matr.length; i++) {
            for (int p = 0; i<matr[i].length; p++){
                if(matr[i][p]!=matr[p][i]) {
                    uguali = false;
                    break;
                }
            }
        }
        return uguali;
    }
}