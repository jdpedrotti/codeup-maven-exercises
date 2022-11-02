import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class MavenExercise {

    public static void main(String[] args) {
        String prompt = "Type something: ";
        System.out.println(prompt);

        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        String promptEntry = "You entered: " + userInput;
        System.out.println(promptEntry);

        boolean notNum = StringUtils.isNumeric(userInput);
            if (notNum){
                System.out.println(userInput + " contains a number");
            } else {
                System.out.println(userInput + " is not a number");
            }

        String flipCase = StringUtils.swapCase(userInput);
        System.out.println("Flipped case: " + flipCase);

        String reverseString = StringUtils.reverse(userInput);
        System.out.println("Reversed: " + reverseString);

    }

}
