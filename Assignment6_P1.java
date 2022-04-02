//Assignment6.java
//Make up work
import java.util.Arrays;

public class Assignment6{

    public static void main(String [] args){
        //initialize array
        int [] myArr = {0, 3, 1 , 2, 4, 7, 4, 8 ,11, 19};
        System.out.println("Unsorted array: ");
        for(int index : myArr){
            System.out.print(index);
            System.out.print(' ');
        }
        System.out.println();
        Arrays.sort(myArr);

        System.out.println("Sorted array: ");
        for(int index : myArr){
            System.out.print(index);
            System.out.print(' ');
        }

        int [] my2ndArr = Arrays.copyOf(myArr, myArr.length);
        System.out.println("\n");

        for(int index: myArr){
            //for each loop to print original array
            System.out.print(index);
            System.out.print(' ');
        }
        System.out.println("\n");
        for(int index: my2ndArr){
            //for each loop to print copied array
            System.out.print(index);
            System.out.print(' ');
        }
        Arrays.fill(my2ndArr, 99);
        System.out.println("\n");
        //Fill my2ndArr with 99 for all elements

        boolean result = Arrays.equals(myArr, my2ndArr);
        System.out.println(result);

        int indexOf = Arrays.binarySearch(myArr, 15);
        System.out.println(indexOf);
        //The value 15 doesn't exist in the array and returns a negative result
    }
}