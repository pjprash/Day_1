class Empolyee{
int id;
String  name;
void insertRecord(int r, String n){
id=r;
name=n;
}
void displayInformation(){System.out.println(id+" "+name);}
}
class TestEmpolyee4{
public static void main(String args[]){
Empolyee s1=new Empolyee();
Empolyee s2=new Empolyee();
Empolyee s3=new Empolyee();
s1.insertRecord(111,"Prasad");
s2.insertRecord(999,"Prashanth");
s3.insertRecord(777,"BSY");
s1.displayInformation();
s2.displayInformation();
s3.displayInformation();
}
}
