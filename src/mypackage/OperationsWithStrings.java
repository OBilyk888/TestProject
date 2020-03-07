package mypackage;

public class OperationsWithStrings {

    public static void main(String[] args) {

        String s = "HW";

        System.out.println(s.equals("HW"));
        System.out.println(s.equals("Hello"));

        String s2 = "Hello";

        System.out.println(s.equals(s2));
        s = "text";
        s2 = "TEXT";

        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));

        s = "TexT";
        System.out.println();
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println();
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf("xT"));

        s = "Hello World";
        System.out.println(s.contains("Hello"));

        System.out.println();
        System.out.println(s.length());

        System.out.println();
        System.out.println(s.startsWith("He"));
        System.out.println(s.startsWith("!"));
        System.out.println(s.endsWith("He"));
        System.out.println(s.endsWith("!"));

        s = "hello, world";
        System.out.println();
        String[] array = s.split(",");
        System.out.println(array[0] + "!" + array[1] + "!");

        System.out.println(array[0]);
        System.out.println(array[1]);

        String str = "My name is %s I'm %d years old";
        int age = 30;
        String name = "Ivan";

        System.out.println(String.format(str, name, age));
        System.out.println(String.format(str, "Vasya", 10));

        System.out.println();

        String age2 = "30";
        int a = Integer.parseInt(age2);

        System.out.println(a * 3);

        s = "Hello, world";
        System.out.println(s.substring(7));

        System.out.println(s.substring(7, s.length() - 1));

        String s1 = "Hello ";
        s2 = "world";
        String s3 = "!";
        String res;

        res = s1 + s2 + s3;
        System.out.println(res);

        res = s1.concat(s2).concat(s3);
        System.out.println(res);



    }
}
