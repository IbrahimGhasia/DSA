public class MergeFunction {
    public static void main(String[] args) {
        int arr[] = { 10, 15, 20, 40, 8, 11, 15 };
        int low = 0;
        int mid = 3;
        int high = 6;
        merge(arr, low, mid, high);
    }

    static void merge(int arr[], int low, int mid, int high) {
        int left[] = new int[mid - low + 1];
        int right[] = new int[high - mid];
        for (int i = 0; i < mid + 1; i++)
            left[i] = arr[low + i];

        for (int i = 0; i < high - mid; i++)
            right[i] = arr[mid - low + 1 + i];

        int i = 0, j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                System.out.print(left[i] + " ");
                i++;
            } else {
                System.out.print(right[j] + " ");
                j++;
            }
        }

        while (i < left.length) {
            System.out.print(left[i] + " ");
            i++;
        }

        while (j < right.length) {
            System.out.print(right[j] + " ");
            j++;
        }
    }

    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
