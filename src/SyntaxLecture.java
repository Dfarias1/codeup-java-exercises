public class SyntaxLecture {
    public static void main(String[] args){
        System.out.println("every statment must end with a semicolon.");
        // byte short int and long only store within their range and only whole numbers.
        byte myByte = 5;
        short myShort = 10000;
        int myInt = 100000;
        long myLong = 6L;
        // float and double can store within their range and store whole or decimal numbers.
        float myFloat = 56.78f;
        double myDouble = 6.78;
        //char will store individual character in a single qoute.
        char myChar = 'k';
        //boolean stores true and false values.
        boolean myBoolean = true;


        String myString = "this is my string,\n string needs to be in \"double qoutes.";
        //example of invalid string format
        // String myString = 'my single qoute string'
        System.out.println(myString);

        String myUnitializedString;
        myUnitializedString = "My string has value";

        //fina accomplishes the same thing as the const keyword from javascript
        final String name = "Daniel";

        System.out.println(1 + 2);
        System.out.println(1 - 2);
        System.out.println(1 * 2);
        System.out.println(1 / 2);
        System.out.println(1 % 2);
        //unary operators expect a variable not a hard coded number
        int num = 5;
        System.out.println(num++);
        System.out.println(++num);
        System.out.println(num--);
        System.out.println(--num);
        System.out.println(-num);

        //i have this integer that can also fit in a long
        int myInteger = 900;
        long morePrecise = myInteger;

        int bigBaby = 1000;
        //we get an error because we cant store something inside of a container that is smaller than itself
        //byte smallCrateNotForBigBaby = bigBaby;

        double pi = 3.14159;
        int almostPi = (int) pi;
    }
}
