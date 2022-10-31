// Move all zeros to End

public class MoveZeros {

    static void move(int arr[]) {
        // Naive Solution O(n^2).

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] == 0) {
        // int temp = arr[j];
        // arr[j] = arr[i];
        // arr[i] = temp;
        // }
        // }
        // }

        // Efficient Sol.
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 0, 0, 8, 0, 9, 0 };
        move(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
