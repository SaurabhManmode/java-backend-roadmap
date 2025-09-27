package datatypes;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 565;
        int sum = sumOfDigits(number);
        System.out.println(sum);
    }

    static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int remainder = number % 10;
            sum += remainder;
            number = number / 10;
        }
        return sum;

    }
}
