package logicbuilding;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 6;
        printPascalsTriangle(n);
    }

    public static void printPascalsTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            int x = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x = x * (i - j) / j;
            }
            System.out.println();
        }

    }
}
