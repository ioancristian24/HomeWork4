import java.util.Scanner;

public class SquarePattern {

    //Write a program called SquarePattern that prompts user for the size (a non-negative integer in int);
    //and prints the following square pattern using two nested for-loops

    public static void main(String[] args) {

        //Rezolvare prin FOR LOOP

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();

        for (int row = 0; row <= size - 1; row++) {
            for (int col = 0; col <= size - 1; col++) {
                System.out.print(" " + "#");
            }
            System.out.println();
        }

        System.out.println();

        //Rezolvare prin WHILE LOOP

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti valoarea: ");
        int marime = scanner1.nextInt();

        int rand = 0;

        while (rand <= marime - 1) {
            int coloana = 0;
            while (coloana <= marime - 1) {
                System.out.print(" " + "#");
                coloana++;
            }
            System.out.println();
            rand++;
        }
    }

}

