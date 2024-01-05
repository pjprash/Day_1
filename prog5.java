class Test {
    public static void main(String args[]) {
        int sum = 0;
        
        for (int i = 0; i <= 100; i += 5) {
            System.out.print(i);
            sum += i;

            if (i < 100) {
                System.out.print("+");
            }
        }

        System.out.println("=" + sum);
    }
}
