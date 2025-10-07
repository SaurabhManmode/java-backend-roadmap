package logicbuilding;

public class ReverseNumberTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        printReverseNumberTrianglePattern(n);
    }

    public static void printReverseNumberTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
