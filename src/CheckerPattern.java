import java.util.Scanner;

public class CheckerPattern {

    //Write a program called CheckerPattern that prompts user for the size (a non-negative integer in int);
    //and prints the following checkerboard pattern.
    //Enter the size: 7
    //  # # # # # # #
    //   # # # # # # #
    //  # # # # # # #
    //   # # # # # # #
    //  # # # # # # #
    //   # # # # # # #
    //  # # # # # # #

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row % 2) == 0) {
                    col = col - 1;
                } else {
                    col = col + 1;
                }
                System.out.print(" " + "#");
            }
            System.out.println();
        }

    }
}
