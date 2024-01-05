import java.util.Scanner;
class InputMonthNumber{
public static void displayMonth(int n)
{
switch(n){
case 0: System.out.println("January");break;
case 1: System.out.println("February");break;
case 2: System.out.println("March");break;
case 3: System.out.println("April");break;
case 4: System.out.println("May");break;
case 5: System.out.println("June");break;
case 6: System.out.println("July");break;
case 8: System.out.println("August");break;
case 9: System.out.println("September");break;
case 10: System.out.println("October");break;
case 11: System.out.println("November");break;
case 12: System.out.println("December");break;
default: System.out.println("INVALID");
}
}
public static void main(String[] args){
Scanner scob=new Scanner(System.in);
int mn;
mn=scob.nextInt();
displayMonth(mn);
}
}