public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Hello,");
        System.out.print(" World!\n");

        int myFavoriteNumber = 42;
        String myString = "What is your favorite number?";
        System.out.println(myString);

//        myString ='c';
//        myString = 3.14159;
//        long myNumber;
//        System.out.println(myNumber);
//        myNumber =3.14;
//        myNumber = 123L;
//        myNumber = 123;
        float myNumber = 3.14F;
        double pi = (double) myNumber;
        System.out.println(myNumber);
        System.out.println(pi);
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        the first example increments after the variable is printed, and the second          increments before it is printed
//        String class = "stuff";
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
//        A string is not an integer no mater how you manage to assign it first
//        int x = 4;
//        x += 5;
//        System.out.println(x);
//        int x = 3;
//        int y = 4;
//        y = y *= x;
//        System.out.println(y);
        int x = 10;
        int y = 2;
        x = x /= y;
        y = y -= x;
        System.out.println(y);
    }
}
