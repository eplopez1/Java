package homework4;

public class task3 {
    public static void main(String[] args) {
       /* Print even numbers from 20 to 1 (2 ways)

        Print odd numbers between 20 and 50 (2 ways)*/

        int num=20;
        while (num>1){

           if (num%2==0) {
               System.out.println(num);
            }num--;


        }
        int num1=2;
        while (num1<22) {

            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
            num1++;
        }
    }
}

