import java.util.Scanner;
class Division{
public static void main(String[] args) {
int num1, num2, div; 
Scanner sc = new Scanner(System.in);
System.out.print("Enter num1: ");
num1 = sc.nextInt();
System.out.print("Enter num2: ");
num2 = sc.nextInt();
div = num1 / num2;
System.out.println("num1=" + num1);
System.out.println("num2=" + num2);
System.out.println("The div=" + div);
System.out.println(num1 + "/" + num2 + "=" + div);
}
}