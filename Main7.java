package Week1;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        //Assuming you are riding a bike and police officer stops yoy
        /* Police officer asking you to provide 2 details
        your current speed and if it is your birthday today?
        The police officer will calculate fine based on following parameters
        If it is your Birthday you will be exempted with 5 miles/hr
        if it is not your birthday no exemption will be given

        if your speed is greater than 80 ticket raised will be 'High Ticket'
        if your speed is between 60 & 80 ticket raised will be 'Mid-Ticket'
        if your speed is below 60 ticket raised will be no ticket.

        Find the Ticket !!
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed : ");
        int speed = sc.nextInt();

        System.out.print("Today is your Birthday? : ");
        boolean isBirthday=sc.nextBoolean();
        if (isBirthday==true){
            speed-=5;
        }

        if (speed>80){
            System.out.printf("High Ticket");
        } else if (speed>60&&speed<=80) {
            System.out.println("Mid Ticket");
        }else {
            System.out.println("No Ticket");
        }
    }
}
