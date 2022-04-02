//Assignment4_P1.java
//Write java code to print odd numbers from 1 to 100
//One uses a for loop, one uses a while loop, one uses a do-while loop

public class Assignment4_P1{
    public static void main(String [] args){
        
        for(int i = 1; i < 100; i++){
            if(i % 2 == 1){
                System.out.print(i);
            }
        }

        int index = 1;
        while(index <= 100){
            System.out.print(index);
            index++;
        }

        int x = 1;
        do{
            System.out.println(x);
            x++;
        }
        while(x <= 100);
    }
}