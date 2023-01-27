package Week1;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        //How Long is Your Burp?

        //Ask the User to Enter an Integer ( Burp Length )

        //Depending on the input provided 'Burp' will be produced
        /*
        For example:
        5 : 'Burrrrp'
        25 : 'Burrrrrrrrrrrrrrrrrrrrrrrrrp' etc
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("How long is you 'BURP' : ");
        int burpLength = sc.nextInt();

        String msg="";
        for (int i =1; i<=burpLength; i++){
            msg = msg+"r"; //can also be written as msg+=r
        }
        System.out.println("Bu"+msg+"p");



    }
}
