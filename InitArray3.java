//InitArray3.java
//Use iteration to calculate array elements with less work

public class InitArray3{

    public static void main(String[] args){
        final int ARRAY_LENGTH = 10;
        int array [] = new int[ARRAY_LENGTH];

        //calculate elements
        for(int counter = 0; counter < array.length; counter++){
            array[counter] = 2 + 2 * counter;
        }

        System.out.printf("%s%8s%n", "Index","Value");
        //column headings

        //output each array element's Value
        for(int counter = 0 ; counter < array.length ; counter++){
            System.out.printf("%s%8s%n", counter, array[counter]);
        }
    }
}