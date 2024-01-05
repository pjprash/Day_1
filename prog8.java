import java.util.Scanner;

class FrequencyDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int digitCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digitCount++;
            }
        }
        System.out.println("Number of digits: " + digitCount);
    }
}
