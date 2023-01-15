package homework3;
import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
      /*  8)HomeWork: Using scanner class create calculator.
        Allow user to enter 2 numbers and operator(+,-,*,/).
        Based on operator provide the result to user.*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        int number1= scan.nextInt();
        System.out.println("Enter operator");
       char oper=scan.next().charAt(0);
        System.out.println("Enter second number");
        int number2= scan.nextInt();
        int result;

        switch(oper){
            case'+':
                result=number1+number2;
                System.out.println(result);
                break;
            case'-':
                result=number1-number2;
                System.out.println(result);
                break;
            case'*':
                result=number1*number2;
                System.out.println(result);
                break;
            case'/':
                result=number1/number2;
                System.out.println(result);
            default:
                System.out.println("wrong input");









        }







    }
}
