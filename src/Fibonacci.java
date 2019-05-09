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
        fibonacciRecurssion(0,1,number,2);
    }

    public static void fibonacciIteration(int input) {

        int n1 = 0;
        int n2 = 1;
        int sum;

        System.out.print("The Fibonacci sequences of this number by iterating are: ");
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


    public static void fibonacciRecurssion(int n1, int n2, int number, int i) {

        if (i < number){
            int newnumber = n1 + n2;
            System.out.print(newnumber + " ");
            fibonacciRecurssion(n2, newnumber, number, i++);
        }

    }
}


//int i = 0;
//while (i < number) {
//System.out.print(fibonacciRecurssion(i) + " ");
// i++;
//}