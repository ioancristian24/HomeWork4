import java.util.Scanner;

public class Fibonacci {

    //Read a number n.
    //Write 2 methods that print out the Fibonacci sequence bot iteratively and recursively.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        fibonacciIteration(number);


        System.out.print("The Fibonacci sequences of this number by recurssing are: ");
        for (int i = 0; i < number; i++){
            System.out.print(fibonacciRecurssion(i) + " ");
        }
    }

    public static void fibonacciIteration(int input) {

        int n1 = 0;
        int n2 = 1;
        int sum;

        System.out.print("The Fibonacci sequences of this number by interating are: ");
        System.out.print(" " + n1);
        System.out.print(" " + n2);
        sum = n1 + n2;
        System.out.print(" " + sum);

        while (sum < input) {
            n1 = n2;
            n2 = sum;
            sum = n1 + n2;
            System.out.print(" " + sum);
        }
        System.out.println();

    }


    public static int fibonacciRecurssion(int number) {

        if (number == 0) return 0;
        if (number == 1) return 1;

        int fibonacci_term;

        fibonacci_term = fibonacciRecurssion(number - 1) + fibonacciRecurssion(number -2);


        return fibonacci_term;
    }
}
