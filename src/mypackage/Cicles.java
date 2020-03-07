package mypackage;

public class Cicles {
    public static void main(String[] args) {

        System.out.println("Start of program");

        for (int i =0; i < 5; i++){
            System.out.println(i);
        }

        System.out.println("End of program");

        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

        int[] array = new int[10];

        System.out.println();
        for (int i = 0; i < 10; i++) {
            array[i] = i * 2;
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Element with index " + i + " is: " + array[i]);
        }

        for (int element: array) {
            System.out.println(element);

        }

        System.out.println();
        int i = 0;
        boolean bool = true;
        while (bool){
            System.out.println("While: " +i);
            i ++;

            if (i ==5) bool = false;
        }

        System.out.println();

        i = 5;
        do {
            System.out.println("Do:" + i);
            i ++;
        } while (i < 5);
    }


}
