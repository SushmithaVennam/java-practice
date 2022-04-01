import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        // rotate an array 3 times
        Scanner sc = new Scanner(System.in);
        int last = 0;
        int array_size = sc.nextInt();
        int N[] = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            N[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < 3; i++) {
            last = N[array_size - 1];
            for (int j = array_size - 1; j > 0; j--) {
                N[j] = N[j - 1];
            }
            N[0] = last;
        }
        for (int i = 0; i < array_size; i++) {
            System.out.print(N[i] + " ");
        }
    }
}
