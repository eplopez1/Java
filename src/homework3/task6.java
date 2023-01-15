package homework3;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        /*6)Write a program to find
        largest number among three numbers using
        nested if provided by a user (numbers must be distinct*/
      Scanner scan=new Scanner(System.in);
        int number1,number2,number3;
      System.out.println("Enter 3 numbers");
         number1= scan.nextInt();
        number2= scan.nextInt();
        number3= scan.nextInt();

        if (number1>number2 && number1>number3){
            System.out.println("The largest number is "+number1);
        } else if (number2>number1 && number2>number3) {
            System.out.println("The largest number is "+number2);
        } else if (number3>number2 && number3>number1) {
            System.out.println("The largest number is "+number3);
        }


    }
}
