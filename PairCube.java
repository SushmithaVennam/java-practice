public class PairCube {
    public static void main(String[] args) {
        int N = 9;
        int count = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = 1; j < N; j++) {
                if ((i * i * i + j * j * j) == N) {
                    System.out.println(i + " " + j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
