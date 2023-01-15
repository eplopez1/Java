package class4;

public class IfDemo1 {
    public static void main(String[] args) {

        int money = 15000;
        if (money > 1000) {
            System.out.println("Let's buy an iphone");
        }

        if (money > 2000) {
            System.out.println("Lets also buy a macbook");
        }

        boolean mothersDay = true;
        if (mothersDay) {
            System.out.println("happy mother day");
        }

        String name="Bob";

        // equals method is only used for non primitives
        if (name.equals(name)){
            System.out.println("I love football");
        }

    }
}
