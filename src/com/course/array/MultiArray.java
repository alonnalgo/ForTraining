package array;

public class MultiArray {
    public static void main(String[] args) {
        int SIZE = 5;
        int counter = 1;
        int[][] graph = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                graph[i][j] = counter;
                counter++;
            }
        }


    }
}
