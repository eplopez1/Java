package class6;

public class Switch{
    public static void main(String[] args) {

        String country="USA";

        switch(country.toLowerCase()){// converts the text to lowercase USA will be converted to "usa"

            case "usa":
                System.out.println("Burgers");
                break;
            case "Italy":
                    System.out.println("Pasta");
                    break;
            case "Iran":
                System.out.println("Kabob");
                break;
            default:
                System.out.println("Wrong country");




        }
    }
}
