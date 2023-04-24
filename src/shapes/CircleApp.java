package shapes;
import util.*;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        String userChoice = "y";
        while (input.yesNo(userChoice)) {
            Circle.outputCircleInfo();
            userChoice = input.getString("Would you like another circle?");
        }
        System.out.println(Circle.totalCircles);
    }
}