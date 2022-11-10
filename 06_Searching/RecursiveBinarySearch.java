public class RecursiveBinarySearch {
    static int search(int arr[], int low, int high, int x) {
        int mid = (low + high) / 2;
        if (low > high)
            return -1;

        if (arr[mid] == x)
            return mid;
        else if (arr[mid] > x)
            return search(arr, low, mid - 1, x);
        else
            return search(arr, mid + 1, high, x);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        System.out.println(search(arr, 0, arr.length - 1, 60));
    }
}
