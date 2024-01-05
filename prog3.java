import java.util.Scanner;
class Subtraction {
public static void main(String[] args) {
int num1, num2, sub; 
Scanner sc = new Scanner(System.in);
System.out.print("Enter num1: ");
num1 = sc.nextInt();
System.out.print("Enter num2: ");
num2 = sc.nextInt();
sub = num1 - num2;
System.out.println("num1=" + num1);
System.out.println("num2=" + num2);
System.out.println("The sub=" + sub);
System.out.println(num1 + "-" + num2 + "=" + sub);
}
}