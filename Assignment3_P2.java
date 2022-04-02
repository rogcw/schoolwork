//Assignment3_P2.java
//Calculates the maximum of 3 numbers
import java.util.Scanner;
import java.util.Arrays;

public class Assignment3_P2{

    public static void main(String [] args) {

        System.out.println("Please input 3 numbers: ");
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();


        //Simply replax calculateMax2 with calculateMax1 to try either method
        int x = calculateMax2(num1, num2, num3);
        System.out.println(x);
        input.close();
    }
    public static int calculateMax1(int x, int y, int z){
        //First method of calculating maximum of three numbers

        int max;

        //Assume x is largest until proved otherwise
        if(x < y){
            max = y;
        }
        if(y < z){
            max = z;
        }
        else{
            max = x;
        }
        return max;
    }
    public static int calculateMax2(int x, int y, int z){
        int[] values = {x,y,z};
        Arrays.sort(values);
    
        int max = values[values.length-1];

        return max;

    }
}