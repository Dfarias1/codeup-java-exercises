import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("What would you say to Bob?");
        Scanner sc = new Scanner(System.in);
        String question = sc.nextLine();
        while (!question.isBlank()){
            if (question.endsWith("?") || question.endsWith("?!")) {
                System.out.println("Bob: sure.");
            } else if (question.endsWith("!")) {
                System.out.println("Bob: whoa, chill out!");
            } else if (question.isBlank()) {
                System.out.println("Bob: fine. be that way.");
                break;
            }else {
                System.out.println("Bob: whatever.");
            }
            question = sc.nextLine();
        }
    }
}
