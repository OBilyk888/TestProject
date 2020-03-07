package mypackage;

public class Conditions {

    public static void main(String[] args) {

        int i = 10;

        System.out.println("SOP");

        if (i > 10) {
            System.out.println("i > 5");
            i++;
            System.out.println(i);
        }

        else if (i < 10 && i > 5) {
            System.out.println("i < 10 and i > 5");
            i --;
            System.out.println(i);

        }

        else{
            System.out.println("Nothing");
        }

        System.out.println("EOP");

        i = 0;

        switch (i) {
            case 1:
                System.out.println("Then number is 1");
                break;
            case 2:
                System.out.println("Then number is 2");
                break;
            case 3:
                System.out.println("I don't know the number");
                break;
            default:
                System.out.println("You are good!");
        }

    }


}
