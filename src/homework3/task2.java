package homework3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
       /* 2) Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output
    “It is a weekday”, anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”*/


Scanner input=new Scanner(System.in);
        System.out.println("Enter a day");

        int day=input.nextInt();
        if (day==1||day==2||day==3||day==4||day==5){
            System.out.println("it is a weekday");
        }else if(day==6||day==7) {
            System.out.println("it is the weekend");
            }else{
            System.out.println("invalid day");
        }









    }
}
