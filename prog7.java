import java.util.Scanner;

class DifferenceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first positive integer:");
        int num1 = getPositiveInteger(sc);

        System.out.println("Enter the second positive integer:");
        int num2 = getPositiveInteger(sc);
        int difference = num1 - num2;
        System.out.println("The difference between the two numbers is: " + difference);
    }
    private static int getPositiveInteger(Scanner sc) {
        int num;
        do {
            System.out.println("Please enter a positive integer:");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive integer:");
                sc.next(); 
            num = sc.nextInt();
        } while (num <= 0);

        return num;
    }
}
