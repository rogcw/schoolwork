//InitArray4.java
//initializing and iterating 2D arrays

public class InitArray4{
    public static void main(String [] args){
        //create and output two-dimensional arrays

        int array1 [][] = {{1, 2, 3}, {4, 5, 6}};
        int array2 [][] = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Values in array1 by row are");
        outputArray(array1);

        System.out.printf("%nValues in array2 by row are%n");
        outputArray(array2);
    }
    public static void outputArray(int [][] array){
        //loop through array's rows
        for(int row = 0; row < array.length; row++){
            //loop through array's columns

            for(int column = 0; column < array[row].length; column++){
                System.out.printf("%d ", array[row][column]);
                //Several more operations could be performed but here we're just printing each element
            }
            System.out.println();
        }
    }
}