import java.util.Scanner;

class Factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        printFactors(userInput);
    }
    static void printFactors(int number) {
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
