package homework3;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
   /*     5) Write a program to find largest of three double
        values using if-else..if and logical
        operators provided by a user (numbers must be distinct)*/

Scanner scanner=new Scanner(System.in);

int number1,number2,number3;
        System.out.println("Please enter three numbers");
        number1=scanner.nextInt();
        number2=scanner.nextInt();
        number3=scanner.nextInt();

        if(number1>number2&& number1>number3){
            System.out.println("The largest number is"+number1);
        }else if (number2>number3 && number2>number1){
            System.out.println("The largest number is"+number2);
        } else if (number3>number2&&number3>number1) {
            System.out.println("Largest number is "+number3);

        }


    }
}
