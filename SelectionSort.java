import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            int max = 0;
            for(int j = 1; j < N - i; j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[N-i-1];
            arr[N-i-1] = temp;
        }
        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
