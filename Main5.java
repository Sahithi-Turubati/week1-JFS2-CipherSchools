package Week1;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        //Get User Division and Print his Rank

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Division : ");

        int div = sc.nextInt();
        switch (div){
            case 1 -> System.out.println("First Rank");
            case 2 -> System.out.println("Second Rank");
            case 3 -> System.out.println("Third Rank");
            default -> System.out.println("No Rank");

        }
    }
}
