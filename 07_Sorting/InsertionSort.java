public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 10, 7, 8, 9, 6, 5, 4, 3, 2, 1 };
        display(arr);
        insertionSort(arr);
        display(arr);
    }

    static int[] insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "->");
        }
        System.out.println();
    }
}
