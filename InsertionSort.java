import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
