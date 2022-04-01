import java.util.Scanner;

public class SumofDigits {

    public static int getDigitSum(int N) {
        int sum = 0;
        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }
        return sum;
    }

    public static int reverseInt(int N) {
        int rev = 0;
        while (N > 0) {
            rev = (rev * 10) + (N % 10);
            N /= 10;
        }
        return rev;
    }

    public static boolean isDigitSumPalindrome(int N) {
        int digitsum = getDigitSum(N);
        int revdigitsum = reverseInt(digitsum);

        if (digitsum == revdigitsum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        if (isDigitSumPalindrome(N) == true) {
            System.out.println("Sum of digits of " + N + " is a plaindrome");
        } else {
            System.out.println("Sum of digits of " + N + " is not a plaindrome");
        }

        if (N == reverseInt(N)) {
            System.out.print(N + " is a palindrome");
        }
    }
}
