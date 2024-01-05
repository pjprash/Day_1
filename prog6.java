import java.util.Scanner;

class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First number:");
        double num1 = sc.nextDouble();

        double num2;
        do {
            System.out.println("Enter the Second number (should not be zero):");
            num2 = sc.nextDouble();

            if (num2 == 0) {
                System.out.println("Please enter a non-zero value for the Second number.");
            }
        } while (num2 == 0);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        double div = num1 / num2;
        double quotient = num1 % num2;

        System.out.println("The sum of the two numbers: " + sum);
        System.out.println("The difference of the two numbers: " + difference);
        System.out.println("The division of the two numbers: " + div);
        System.out.println("The product of the two numbers: " + product);
        System.out.println("The quotient of the two numbers: " + quotient);
    }
}
