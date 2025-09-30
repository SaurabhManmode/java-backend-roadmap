package logicbuilding;

public class NumberIncreasingReversePyramid {
    public static void main(String[] args) {
        int n = 4;
        printNumberIncreasingReversePyramid(n);
    }

    public static void printNumberIncreasingReversePyramid(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
