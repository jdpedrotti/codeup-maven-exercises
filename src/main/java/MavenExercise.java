import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class MavenExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Type something: ");

        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);

        boolean notNum = StringUtils.isNumeric(userInput);
            if (notNum){
                System.out.println(userInput + " is a number");
            } else {
                System.out.println(userInput + " is not a number");
            }

        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));

        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }

}
