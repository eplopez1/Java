package homework3;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       /* 4)Write a program for user to enter his/hers birth month.
                Based on the month define the season.
                Example: if user is born in June, July or August → season =”Summer”.
        At the end of the program we should see output as “You were born __”.*/
        System.out.println("Enter your birth Month");
        String month=scan.next();


        switch (month){
            case "December":
            case "January":
            case"Feburary":
                System.out.println("winter");
                break;
            case "March":
            case "April":
            case"May":
                System.out.println("spring");
                break;
            case "June":
            case"July":
            case"August":
                System.out.println("summer");
                break;
            case"September":
            case"October":
            case"November":
                System.out.println("fall");


        }



    }
}
