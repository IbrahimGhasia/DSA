public class MaximumDiff {
    static int MaxDifference(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] > max)
                    max = arr[j] - arr[i];
            }
        }
        return max;
    }

    static int maxDiffEff(int arr[]) {
        int res = arr[1] - arr[0], minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = Math.max(res, arr[i] - minValue);
            minValue = Math.min(minValue, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        // int arr[] = { 7, 9, 5, 6, 3, 2 };
        int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
        System.out.println(MaxDifference(arr));
        System.out.println(maxDiffEff(arr));
    }
}
