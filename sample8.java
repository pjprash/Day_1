class Student{
int id;
String name;
}
class TestStudent2{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
s1.id=45;
s1.name="prashanth";
s2.id=69;
s2.name="Prasad";
System.out.println(s1.id+" "+s1.name);
System.out.println(s2.id+" "+s2.name);
}
}