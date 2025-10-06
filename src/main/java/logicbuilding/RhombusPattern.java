package logicbuilding;

public class RhombusPattern {
    public static void main(String[] args) {
        int n = 5;
        printRhombusPattern(n);
    }

    public static void printRhombusPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
