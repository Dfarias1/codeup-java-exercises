import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.printf("The value of pi is %.2f.%n", pi);
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give me a number: ");
//        int userNum = sc.nextInt();
//        System.out.println(userNum);

//        System.out.println("Give me three words: ");
//        String wordOne = sc.next();
//        String wordTwo = sc.next();
//        String wordThree = sc.next();
//
//        System.out.printf("The three words are %n %s %n %s %n %s %n", wordOne, wordTwo, wordThree);


//        System.out.println("Give me a sentence: ");
////        String sentence = sc.next(); // if we enter "Today is monday" will return "Today" only aka first word
//        String sentence = sc.nextLine();
//        System.out.println(sentence);


        System.out.println("Enter the length of your classroom at Codeup:");
        String length = scanner.nextLine();
        System.out.println("Enter the width of your classroom at Codeup:");
        String width = scanner.nextLine();
        int perimeter = (Integer.parseInt(width) + Integer.parseInt(length)) * 2;
        System.out.printf("The perimeter of your classroom is: %d%n", perimeter);
    }
}
