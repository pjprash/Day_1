import java.util.regex.Matcher;
import java.util.regex.Pattern;
class SpecialCharIdentifier {
    public static void main(String[] args) {
        String inputString = "Hello! This is a sample string with @special characters #123";

        // Call the method to identify and print special characters
        identifySpecialCharacters(inputString);
    }

    private static void identifySpecialCharacters(String input) {
        // Define a regular expression pattern for special characters
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9\\s]");

        // Create a matcher object to find matches in the input string
        Matcher matcher = pattern.matcher(input);

        // Check for special characters and print them
        System.out.println("Special characters in the string:");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
