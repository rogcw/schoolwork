//Assignment3.java
//This is a program that will print my name etc.
import java.util.Scanner;

public class Assignment3_P1{
    public static void main(String[] args){
        System.out.println("Christopher " + "W " + "Rogers");

        Scanner input = new Scanner(System.in);
        System.out.println("Please input two numbers: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = sumNumbers(num1, num2);
        System.out.println("Result is: " + sum);

        input.close();
    }
    public static int sumNumbers(int x, int y){

        return x + y;
    }
}