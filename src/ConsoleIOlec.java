import java.util.Scanner;

public class ConsoleIOlec {
    public static void main(String[] args) {
        String name = "123";
        String cohortName = "Kotlin";
        System.out.print("Favorite number " + name + "\n");

        System.out.println("Favorite number " + name);

//        the f in printf stands for format
//        printf allows you to pass in a value to your output.
//        %s is the placeholder that will be replaced with the passed value as the second argument.
        System.out.printf("Favorite Number is %s, and favorite cohort is %s %n", cohortName, name);


        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the day today? \n");

//        .next() will only return the first word before any whitespace.
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
////        same result using the printf
//        System.out.printf("You entered: %s %n", userInput);

//        .nextLine();
        System.out.println("Enter Something: ");
        String userInput2 = scanner.nextLine();
        System.out.print("You entered: " + userInput2 + "\n");

//        using .nextInt();
        System.out.println("Enter a number: ");
        int userNum = scanner.nextInt();
        System.out.print("Your favorite number is: " + userNum);
    }
}
