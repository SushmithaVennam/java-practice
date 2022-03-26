import java.util.Scanner;

public class Numbers {
    public static int fact(int n) {
        int fact = 1;
        while (n > 1) {
            fact *= n;
            n--;
        }
        return fact;
    }

    public static int Npr(int n, int r) {
        int npr;
        npr = fact(n) / fact(n - r);
        return npr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int npr = Npr(n, r);
        System.out.println(npr);
        sc.close();
    }
}
