package Week1;

import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int computerChoice = rnd.nextInt(20);
        System.out.println("Computer Choice : "+ computerChoice);

        //Guess the number
        System.out.println("Guess a number between 0 and 20 ");
        int userChoice = sc.nextInt();
        if (userChoice > computerChoice){
            System.out.println("Your guess id too high");
        } else if (userChoice<computerChoice) {
            System.out.println("Your guess is too low ");
        } else {
            System.out.println("Gotcha!You guessed it right !!");
        }
    }
}
