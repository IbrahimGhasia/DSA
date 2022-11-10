public class IndexOfFirstOccurrence {

    // Time Complexity O(n)
    static int findFirstOcc(int arr[], int x) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == x)
                return i;
        return -1;
    }

    static int findFirstOccEff(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 10, 10, 20, 20, 20, 40 };
        System.out.println(findFirstOcc(arr, 20));
        System.out.println(findFirstOccEff(arr, 20));
    }
}
