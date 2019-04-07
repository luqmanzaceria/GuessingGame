import java.util.*;
import java.lang.System;

public class GuessingGame {

        public static void main(String[] args) {
            System.out.println("Welcome to Guess The Number! " + "Pick a number greater than 2 (Example: 50, will allow you to play 0-50): ");

            Scanner inputnum = new Scanner(System.in);
            int maxnum;
            int minnum = 0;
            maxnum = inputnum.nextInt();


            Random rand = new Random();
            int number = rand.nextInt(maxnum);

            int tries = 0;
            Scanner input = new Scanner(System.in);



            boolean win = false;
            ArrayList<Integer> hl = new ArrayList<Integer>();
            hl.add(maxnum);
            ArrayList<Integer> ll = new ArrayList<Integer>();
            ll.add(minnum);

            if (maxnum<=2){
                System.out.println("The number should be greater than 2.");
                Scanner range = new Scanner(System.in);
                maxnum = range.nextInt();
            }



            while (win == false) {

                System.out.println("Guess a number between 0 and " + maxnum + ": ");
                int guess = input.nextInt();
                tries++;
                int lowGuess = 1;
                int highGuess = guess;

                if (guess == number) {
                    System.out.println("You win!");
                    System.out.println("It took you " + tries + " tries.");
                    break;
                } else if (guess > number) {
                    System.out.println("Too high! ");
                    highGuess = guess;
                    hl.add(guess);


                } else if (guess < number) {
                    System.out.println("Too low! " );
                    lowGuess = guess;
                    ll.add(guess);

                }


                Collections.sort(hl);
                Collections.sort(ll, Collections.reverseOrder());

                System.out.println(ll.get(0) + " - " + hl.get(0));



            }

        }
    }