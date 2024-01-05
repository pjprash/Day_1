class PrintNumbers {
    public static void main(String[] args) {
        // Printing 0 to 100
        System.out.println("Numbers from 0 to 100:");
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        // Printing 0 to 100 in steps of -5
        System.out.println("\nNumbers from 0 to 100 in steps of -5:");
        for (int j = 0; j >= -100; j -= 5) {
            System.out.println(j);
        }
    }
}
