package class7;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {

        boolean condition=true;
        Scanner scan=new Scanner(System.in);
        int number=10;
        while (condition){
            System.out.println("Please enter number between 10to20");
            int userinput=scan.nextInt();
            if(userinput>number){
                System.out.println("your entered number is greater");
            } else if (userinput<number) {
                System.out.println("You entered number is greater");

            }else{
                System.out.println("you won!!!");
                condition=false;
            }
        }


    }
}
