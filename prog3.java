class Student{
private String name;
private int id;
public void setName(String name){this.name=name;}
public void setId(int id){this.id=id;}
public String getName(){return name;}
public int getId(){return id;}
}
class BCA{
public static void main(String args[]){
Student ob=new Student();
ob.setId(97653);
ob.setName("Prashanth");
System.out.println("Id:"+ob.getId());
System.out.println("Name:"+ob.getName());
}
}