package homework5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class task2 {
/*2) Create a program that will be asking user to apply for a credit card 10 times.
    As soon you get an “yes” from a user program should stop asking.*/

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        for (int i = 1; i < 11 ; i++) {
            System.out.println("Apply for credit card");
            if (scan.next().equals("yes")){
                break;
            } else if (i == 10) {
                System.out.println("Thank you for your time.");
        }





        }


    }
}
