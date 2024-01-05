class Main{
public static void main(String args[]){
int[] numbers={45, 34, 24, 21};
int sum=0;
Double average;
for(int number: numbers){
sum += number;
}
int arrayLength = numbers.length;
average = ((double)sum / (double)arrayLength);
System.out.println("Sum ="+sum);
System.out.println("Average ="+average);
}
}