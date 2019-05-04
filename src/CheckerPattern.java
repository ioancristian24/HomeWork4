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
        String col1 = " ";
        String col2 = "#";
        String temp;

        for (int row = 1; row <= size; row++) {

            if ((row % 2) == 0) {
                temp = col1;
                System.out.print(col1);
            } else {
                temp = col2;
                System.out.print(col2);
            }
            for (int col = 1; col <= size; col++) {
                if (temp.equals(col1)) {
                    temp = col2;
                    System.out.print(col2);
                } else {
                    temp = col1;
                    System.out.print(col1);
                }
                System.out.print("");
            }
            System.out.println();
        }

    }
}
