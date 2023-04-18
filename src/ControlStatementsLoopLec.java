import java.util.Scanner;

public class ControlStatementsLoopLec {
    public static void main(String[] args) {
        //-----boolean experssions---------
//        System.out.println(10 > 5);
//        System.out.println(5 == 5);
//        System.out.println(true == false);
//        System.out.println(2 <= 2);

        //------ logical operators---------
//        System.out.println((true == true) || (true == false));
//        System.out.println((true == true) && (true == false));

//        boolean isLoggedIn = true;
//        boolean isAdmin = false;
//        if (isLoggedIn && isAdmin){
//            System.out.println("show the home page");
//        }else {
//            System.out.println("login in");
//        }
    //----------------string comparison--------
        Scanner sc = new Scanner(System.in);
        System.out.println("Continue? [y/n]");
        String userInput = sc.next();

        boolean confirmation = userInput .equals("y");
        System.out.println(confirmation);

        //---another example of string comparision
//        String str1 = "y";
//        System.out.println("Type 'y'");
//        String str2 = sc.next();
//
//        System.out.println("String 1 is: " + str1);
//        System.out.println("String 2 is: " + str2);
//        System.out.println("String 1 == String 2 ?" + str1 == str2);

        //----------while loops-------------
//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }
//
//        boolean orderFood = true;
//        while (orderFood){
//            System.out.println("Order food, I'm hungry");
//            orderFood = false;
//        }
//        //-----do while loops------
//        do{
//            System.out.println("You will see this despite the condition");
//        }while(false);
//        do {
//            System.out.println("order food again");
//            orderFood = false;
//        }while(orderFood);

        //--------for loops---------


    }
}
