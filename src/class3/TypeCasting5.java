package class3;

public class TypeCasting5 {
    public static void main(String[] args) {
        long number=125;
        byte shorterNumber=(byte) number;
        float f=10.f;
        int num=(int)f;

        System.out.println(shorterNumber);
        System.out.println(num);

        /*
        if we try to stro the contents from a small box to a larger box java dosent complain because the
        content can easily fit inside the larger box but if we try the otherway around we get
        an error and we need to type cast it to store the contents
         */
        byte b=10;
        int number2=b;
        short c=(short) number2;
        System.out.println(b);


    }
}
