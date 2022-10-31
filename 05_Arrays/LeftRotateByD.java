// Left rotate the given array by D position

public class LeftRotateByD {
    // Better Solution. Time Complexity O(n), Aux Space O(d).
    static void rotate(int arr[], int d) {
        int temp[] = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[arr.length - d + i] = temp[i];
        }
    }

    static void rotateEff(int arr[], int d) {
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    static void reverse(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // rotate(arr, 2);
        rotateEff(arr, 2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
