import java.util.Scanner;
class FactorCountPrinter {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
 int userInput = scanner.nextInt();
  int factorCount = countFactors(userInput);
System.out.println("Number of factors of " + userInput + " is: " + factorCount);
 }
static int countFactors(int number) {
 int count = 0;
for (int i = 1; i <= number; i++) {
 if (number % i == 0) {
 count++;
}
        }
        return count;
    }
}
