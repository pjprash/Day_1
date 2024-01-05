import java.util.Scanner;

class Pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);  // Read a character input
        int row = sc.nextInt();  // Assuming you want to read an integer for the number of rows
        printPattern(ch, row);
    }

    public static void printPattern(char c, int n) {
        for (int i = 1; i <= n; i++) {
            printLine(c, i);
        }
    }

    public static void printLine(char c, int col) {
        System.out.println();  // Move to a new line before printing the pattern
        for (int j = 1; j <= col; j++) {
            System.out.print(c);
        }
    }
}
