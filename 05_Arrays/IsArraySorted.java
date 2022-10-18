public class IsArraySorted {
    public static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    }

    public static boolean isSortedEff(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 12, 20, 2 };
        int arr2[] = { 1, 2, 1 };
        // System.out.println(isSorted(arr));
        System.out.println(isSortedEff(arr2));
    }
}
