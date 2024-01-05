import java.util.Scanner;
class difference{
         static void sub(int a,int b)
           {
             System.out.println(a+" "+b+" = "+(a-b));
            }
	       public static void main(String args[])
          	{
               int a;
	            int b;
               Scanner s=new Scanner(System.in);
               a=s.nextInt();
               b=s.nextInt();
               sub(a,b);
	}
}