package homework3;

import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {

       /* Write a program that will read three inputs of scores
        (quiz, mid term, and final scores) and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F*/

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your Quiz Number");
        int quiz= scan.nextInt();
        System.out.println("Enter your Midterm Score");
        int midterm= scan.nextInt();
        System.out.println("Enter your Final score");
        int finals= scan.nextInt();


        double averagescore=(quiz+midterm+finals)/3;

if (averagescore>=90){
    System.out.println("grade= A");
} else if (averagescore>=70&&averagescore<90) {
            System.out.println("grade= B");
}else if (averagescore>=50&&averagescore<70){
            System.out.println("grade= C");
        }else if (averagescore<50){
            System.out.println("grade= F");
        }


    }
}
