package logicbuilding;

public class ButterFlyPattern {
    public static void main(String[] args) {
        int n = 6;
        printButterFlyPattern(n);
    }

    public static void printButterFlyPattern(int n) {
        for (int i = 1; i <= n - i; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
