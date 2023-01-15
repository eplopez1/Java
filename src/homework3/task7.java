package homework3;
import java.sql.SQLOutput;
import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
      /*  Ask user to enter their country and capture it.
                Once values are captured print which language user speaks.

                Allow user to enter grade and then provide explanation:
        A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
            At the end your program should print which grade was entered by a user with explanation.*/
       Scanner scan=new Scanner(System.in);
        System.out.println("Enter your country");
        String country= scan.next();

       switch (country) {
           case "Usa":
               System.out.println("English");
               break;
           case "Mexico":
               System.out.println("Spainish");
           case "China":
               System.out.println("chinese");
           default:
               System.out.println("Sorry");


       }

       Scanner input=new Scanner(System.in);
        System.out.println("Enter grade for explanation");
        String grade= input.next();

        switch (grade){
            case "a":
                System.out.println("A-Excellent");
                break;
            case"b":
                System.out.println("B-Excellent");
                break;
            case"c":
                System.out.println("C-Average");
                break;
            case"d":
                System.out.println("D-Bad");
                break;
            default:
                System.out.println("Not acceptable");





        }


    }
}
