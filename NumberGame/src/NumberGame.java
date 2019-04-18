/**
 * Coded by sieun-Bae on 19/04/19
 */


import java.util.Scanner;

public class NumberGame {
    public static void main(String [] args){
        //create random number
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("I have randomly chosen a number between 1 and 100");
        System.out.println("Try to guess it");
        System.out.println(randomNumber);

        //user input
        Scanner scanner = new Scanner(System.in);

        //iterate for 10 times
        for (int i= 10; i>0; i--) {
            System.out.println("You have " + i + " guess(es) left. Choose again: ");
            int guess = scanner.nextInt();

            //figure out if it's correct
            if (randomNumber < guess) {
                System.out.println("It's smaller than " + guess + ".");
            }
            else if (randomNumber > guess) {
                System.out.println("It's greater than " + guess + ".");
            }
            else {
                hasWon = true;
                break;
            }
        }

        //print out the result
        if(hasWon) {
            System.out.println("CORRECT... YOU WIN!!!");
        } else{
            System.out.println(("GAME OVER... YOU LOSE!!!"));
            System.out.println("The number was : " + randomNumber);
        }
    }
}
