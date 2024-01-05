class Student7 {
int id;
String name;
int age;
Student7(int i,String n){
id = i;
name = n;
}
Student7(Student7 s ){
id = s.id;
name = s.name;
}
void display(){System.out.println(id+" "+name);}

public static void main(String args[]){
Student7 s1=new Student7(111,"Marvels");
Student7 s2=new Student7(222,"DC");
s1.display();
s2.display();
}
}