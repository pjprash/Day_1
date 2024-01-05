import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
char i=scob.next().charAt(0);
if(i=='0'||i=='1'||i=='2'||i=='3'||i=='4'||i=='5'||i=='6'||i=='7'||i=='8'||i=='9' )
System.out.println("YES");
else
System.out.println("NO");
}
}