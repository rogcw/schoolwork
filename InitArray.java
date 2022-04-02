//InitArray.java
//This is an example on how to initialize arrays
//play with arrays more

public class InitArray{

    public static void main(String [] args){
        //declare variable array and initialize it with an array object
        int array [] = new int[10];

        System.out.printf("%s%8s%n", "Index", "Value");
        //Print column headings 

        for(int counter = 0; counter < array.length; counter++){
            //zero based counting
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}