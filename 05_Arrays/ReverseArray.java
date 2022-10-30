// Write a program to reverse an Array.

public class ReverseArray {
    static void revereseArray(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 6, 7, 30 };
        revereseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
