class WrapperExample3{
public static void main(String args[]){
byte b=10;
short s=20;
int n=30;
long l=40;
float f=50;
double d= 60.1D;
char c= 'a';
boolean b2= true;
//Autoboxing 
Byte byteobj=b;
Short shortobj=s;
Integer intobj=n;
Long longobj=l;
Float floatobj=f;
Double doubleobj=d;
Character charobj=c;
Boolean boolobj=b2;
System.out.println("----Printing object values----");
System.out.println("Byte object:"+byteobj);
System.out.println("Short object:"+shortobj);
System.out.println("Integer object:"+intobj);
System.out.println("Long object:"+longobj);
System.out.println("Float object:"+floatobj);
System.out.println("Double object:"+doubleobj);
System.out.println("Character object:"+charobj);
System.out.println("Boolean object:"+boolobj);
}
}

//Unboxing
byte bytevalue=byteobj;
short shortvalue=shortobj;
int intvalue=intobj;
long longvalue=longobj;
float floatvalue=floatobj;
double doublevalue=doubleobj;
char charvalue=charobj;
boolean boolvalue=boolobj;
//Printing primitives
System.out.println("----Printing Primitive values----");
System.out.println("byte value:"+bytevalue);
System.out.println("short value:"+shortvalue);
System.out.println("int value:"+intvalue);
System.out.println("long value:"+longvalue);
System.out.println("float value:"+floatvalue);
System.out.println("double vaue:"+doublevalue);
System.out.println("char value:"+charvalue);
System.out.println("boolean value:"+boolvalue);
}
}
