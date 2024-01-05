class Test{
public static void main(String args[]){
int i=0;
int sum=0;
for(i<=100)
{
System.out.print(i+"+");
sum=sum+i;//sum +=i;
i=i+5;
}
System.out.println("\b"+"="+sum);
}
}