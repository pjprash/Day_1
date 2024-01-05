import java.util.Scanner;

 class AlphabetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
               char inputChar = scanner.next().charAt(0)
        if (isAlphabet(inputChar)) {
            System.out.println(inputChar + " is an alphabet.");
        } else {
            System.out.println(inputChar + " is not an alphabet.");
        }
        scanner.close();
    }

    // Function to check whether a character is an alphabet
    private static boolean isAlphabet(char ch) {
        // Check if the character is a lowercase or uppercase alphabet
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
}
