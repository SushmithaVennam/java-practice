public class Quicksort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partitionIndex(int[] arr, int pivot, int l, int r) {
        int i = l;
        int b = l;
        while (i <= r) {
            if (arr[i] <= pivot) {
                swap(arr, i, b);
                b++;
            }
            i++;
        }
        int pi = b - 1; // pi = small element and small element will always be "1" position less than
                        // big
        swap(arr, l, pi);
        return pi;
    }

    public static int[] quickSort(int arr[], int l, int r) {
        if (l >= r) {
            return arr;
        }
        int pivot = arr[l];
        int pi = partitionIndex(arr, pivot, l, r);
        quickSort(arr, l, pi - 1);
        quickSort(arr, pi + 1, r);
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 7, 9, 1, 12, 23, 4 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
