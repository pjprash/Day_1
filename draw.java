class DrawCircle {
    public static void main(String[] args) {
        int radius = 3; // You can adjust the radius as needed

        drawCircle(radius);
    }

    private static void drawCircle(int radius) {
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
