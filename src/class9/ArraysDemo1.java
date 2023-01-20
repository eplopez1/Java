package class9;

public class ArraysDemo1 {
    public static void main(String[] args) {
        // write a loop to print all the names from array

        String [] names={"Bob","Josh","Serg","Al","Mike"};
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
    }
}
