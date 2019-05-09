import java.util.Scanner;

public class MyMathematicalOperations {

    //Write a java class that asks the user to input a mathematical operation in the following format:
    //a operator b and then performs the operation

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce the mathematical operation: ");
        String myOperation = scanner.nextLine();

        if (myOperation.contains("+")) {
            add(myOperation);
        } else if (myOperation.contains("-")) {
            substraction(myOperation);
        } else if (myOperation.contains("*")) {
            multiplication(myOperation);
        } else if (myOperation.contains("/")) {
            division(myOperation);
        } else if (myOperation.contains("%")) {
            remainder(myOperation);
        } else {
            System.out.println("This is not a valid operation!");
        }

    }

    public static void add (String myOperation){
        String [] myOperationArray = myOperation.split("\\+");
        int a = Integer.valueOf(myOperationArray[0].trim());
        int b = Integer.valueOf(myOperationArray[myOperationArray.length - 1].trim());
        int rezultat = a + b;
        System.out.println(rezultat);
    }

    public static void substraction(String myOperation){
        String [] myOperationArray = myOperation.split("-");
        int a = Integer.valueOf(myOperationArray[0].trim());
        int b = Integer.valueOf(myOperationArray[myOperationArray.length -1].trim());
        int rezultat = a - b;
        System.out.println(rezultat);
    }

    public  static void multiplication (String myOperation) {
        String [] myOperationArray = myOperation.split("\\*");
        int a = Integer.valueOf(myOperationArray[0].trim());
        int b = Integer.valueOf(myOperationArray[myOperationArray.length - 1].trim());
        int rezultat = a * b;
        System.out.println(rezultat);
    }

    public static void division (String myOperation){
        String [] myOperationArray = myOperation.split("/");
        int a = Integer.valueOf(myOperationArray[0].trim());
        int b = Integer.valueOf(myOperationArray[myOperationArray.length - 1].trim());
        int rezultat = a / b;
        System.out.println(rezultat);
    }

    public  static void remainder (String myOperation){
        String [] myOperationArray = myOperation.split("%");
        int a = Integer.valueOf(myOperationArray[0].trim());
        int b = Integer.valueOf(myOperationArray[myOperationArray.length - 1].trim());
        int rezultat = a % b;
        System.out.println(rezultat);
    }


}
