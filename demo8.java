class B
{
public static void main(){
System.out.println("Main method without argument called.");
}
public static void main(int x){
System.out.println("Main method without argument called"+x*2);
}
public static void main (String s){System.out.println("Welcome"+s);}
public static void main (String  args[]){
System.out.println("Anil is typing....");
main();
main("prashanth");
main(30);
}
}