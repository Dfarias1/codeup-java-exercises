package grades;

import java.util.*;

public class GradesApplication {

    public static void outputStudentInfo(String userInput, HashMap<String, Student> students){
        if (students.containsKey(userInput)){
            Student student = students.get(userInput);
            System.out.printf("Name: %s, Github Username: %s%nCurrent Average: %.1f%n", student.getName(), userInput, student.getGradeAverage());
        } else {
            System.out.printf("Sorry, no student found with the Github username of \"%s\"%n", userInput);
        }
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student jase = new Student("Jase");
        jase.addGrades(new ArrayList<>(List.of(99, 97, 100)));
        Student oliver = new Student("Oliver");
        oliver.addGrades(new ArrayList<>(List.of(100, 92, 84)));
        Student mike = new Student("Mike");
        mike.addGrades(new ArrayList<>(List.of(95, 78, 83)));
        Student elon = new Student("Elon");
        elon.addGrades(new ArrayList<>(List.of(97, 94, 99)));

        students.put("Joe845", jase);
        students.put("Codelivia", oliver);
        students.put("Mateo2023", mike);
        students.put("EmmaGo2023", elon);

        Set<String> gitHubUserNames = students.keySet();
        for (String gitHubUserName : gitHubUserNames){
            System.out.printf("|%s| ", gitHubUserName);
        }
        System.out.println("");
        System.out.println("What student would you like to see more information on?");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        outputStudentInfo(userInput, students);
        while (true){
            System.out.println("Would you like to see another student? (yes/no)");
            System.out.println("");
            String userChoice = sc.nextLine().toLowerCase();
            if (userChoice.equals("no") || userChoice.equals("n")){
                System.out.println("Goodbye, and have a wonderful day!");
                System.out.println("");
                break;
            } else {
                System.out.println("What student would you like to see  more information on?");
                System.out.println("");
                userInput = sc.nextLine();
                outputStudentInfo(userInput, students);
            }
        }
    }
}