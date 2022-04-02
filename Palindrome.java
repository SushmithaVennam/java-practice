import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = N;
        sc.close();
        int rev = 0;
        for (; N > 0; N = N / 10) {
            int m = N % 10;
            rev = (rev * 10) + m;
        }
        System.out.println(rev);
        if (n == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
