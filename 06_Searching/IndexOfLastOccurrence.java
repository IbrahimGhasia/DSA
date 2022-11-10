public class IndexOfLastOccurrence {

    static int search(int arr[], int low, int high, int x) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;
        if (arr[mid] > x) {
            return search(arr, low, mid - 1, x);
        } else if (arr[mid] < x) {
            return search(arr, mid + 1, high, x);
        } else {
            if (mid == arr.length - 1 || arr[mid] != arr[mid + 1]) {
                return mid;
            } else {
                return search(arr, mid + 1, high, x);
            }
        }
    }

    static int searchIterative(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == arr.length - 1 || arr[mid] != arr[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 10, 10, 10, 20, 20 };
        System.out.println(search(arr, 0, arr.length - 1, 20));
        System.out.println(searchIterative(arr, 20));
    }
}
