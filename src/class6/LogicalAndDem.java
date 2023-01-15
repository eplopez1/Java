

package class6;
import java.util.Scanner;


public class LogicalAndDem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your day");
        String day=scan.next();

        if(day.equals("Monday")||day.equals("Friday")) {
            System.out.println("No class today");

        }else if (day.equals("Saturday")|| day.equals("Sunday")){
            System.out.println("java class");
        }else if (day.equals ("Wedenesday")|| day.equals("Tuesday")){
            System.out.println("manuel testing class");
        }else if (day.equals("Thursday")){
            System.out.println("Review class");
        }else{
            System.out.println("Wrong day entered");
        }

    }
}
