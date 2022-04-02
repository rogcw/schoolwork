//Assignment5.java
//play with arrays

public class Assignment5{

    public static void main(String [] args){
        int [] QArray = new int[100];
        //Declare an array object with 100 elements inside of it

        for(int i = 1 ; i < QArray.length ; i += 2){
            //Fill the array with odd numbers
            QArray[i] = i;
        }

        int sum = 0;

        for(int index : QArray){ 
            //Enchanced for loop (for each loop)
            sum += index;
        }
        int avg = sum / QArray.length;

        System.out.println("Sum of QArray: " + sum);
        System.out.println("Average of QArray: " + avg);
    }
    
}