//Craps.java
//Craps class simulates the dice game Craps

import java.security.SecureRandom;
 public class Craps{
     //create secure random number generator for use in method rollDice
     private static final SecureRandom randomNumbers = new SecureRandom();

     private enum Status {CONTINUE, WON, LOST};

     //enum type with constants that represesnt the game status
     private static final int SNAKE_EYES = 2;
     private static final int TREY = 3;
     private static final int SEVEN = 7;
     private static final int YO_LEVEN = 11;
     private static final int BOX_CARS = 12;

     //plays on game of Craps
     public static void main(String[] args){
         int myPoint = 0; //point if no win or loss on the first roll
         Status gameStatus; //can contain CONTINUE, WON or LOST

         int sumOfDice = rollDice(); //first roll of the dice

         //determine game status and point based on the first roll
         switch (sumOfDice){
             case SEVEN: //win with seven on the first roll
             case YO_LEVEN: //win with eleven on the first roll
                gameStatus = Status.WON;
                break;
             case SNAKE_EYES: //lose with 2 on the first roll
             case TREY: //lose with 3 on the first roll
             case BOX_CARS: //lose with 12 on the first roll
                gameStatus = Status.LOST;
                break;

            default: //did not win or lose, so remember point
                gameStatus = Status.CONTINUE; //game is not over
                myPoint = sumOfDice; //remember the point

                System.out.printf("Point is %d%n", myPoint);
                break;
         }

         //while game is not complete
         while (gameStatus == Status.CONTINUE){
             sumOfDice = rollDice();

             //determine game status
             if(sumOfDice == myPoint) {
                 gameStatus = Status.WON;

             }
             else{
                 if(sumOfDice == SEVEN){ //lose by rolling 7 before point
                    gameStatus = Status.LOST;
                 }
             }
         }

         //display won or lost message
         if (gameStatus == Status.WON) {
             System.out.println("Player wins");
         }
         else{
             System.out.println("Player loses");
         }
     }

     //roll dice, calculate sum and display results
     public static int rollDice(){
         //pick random die values
         int die1 = 1 + randomNumbers.nextInt(6);
         int die2 = 1 + randomNumbers.nextInt(6);

         int sum = die1 + die2; //sum of die values

         //display results of this roll
         System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
         return sum;
     }
 }
