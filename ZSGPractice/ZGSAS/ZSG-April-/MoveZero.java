
import java.util.Arrays;
import java.util.Scanner;

public class MoveZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of an Array : ");
        int N = scanner.nextInt();
        int array[] = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        MoveZero moveZero = new MoveZero();
        moveZero.moveZeros(array, N);
        System.out.println(Arrays.toString(array));
    }

    private void moveZeros(int[] array, int N) {
        int i = 0;
        for (int j = 0; j < N; j++) {
            if (array[j] == 0 && i == 0) {
                i = j;
            } else if (array[i] == 0 && array[j] != 0) {
                swap(array, i, j);
                i++;
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
