import java.util.Scanner;
class Test{
public static void main(String[] args){
int a,b;
boolean cond = true;
Scanner sc=new Scanner(System.in);
System.out.println("Cond is:"+cond);
a = sc.nextInt();
System.out.println("Var1:"+ a);
b = sc.nextInt();
System.out.println("Var2:"+ b);
System.out.println("Now Cond is:"+!cond);
System.out.println("!(a<b)="+!(a<b));
System.out.println("!(a>b)="+!(a>b));
}
}


