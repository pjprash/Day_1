class BSC{
private int age;
public void setAge(int age)
{
if(age<0)this.age=0;
else
this.age=age;
}
public int getAge(){return this.age;}
}
class BCA{
public static void main(String args[])
{
System.out.println("GoodMorning");
BSC ob=new BSC();
//ob.setAge(-10);
ob.setAge(10);
System.out.println("Age:"+ob.getAge());
}
}