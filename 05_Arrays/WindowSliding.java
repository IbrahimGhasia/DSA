// Given an array of integers and a number k, find the maximum sum of k consecutive elemets.

public class WindowSliding {
    static int maxSum(int arr[], int k) {
        int n = arr.length;
        int res = Integer.MIN_VALUE;

        for (int i = 0; i + k - 1 < n; i++) {
            int curr = 0;
            for (int j = 0; j < k; j++) {
                curr += arr[i + j];
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    // Time Complexity O(n)
    static int maxSumEff(int arr[], int k) {
        int curr_sum = 0;
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            curr_sum += arr[i];
        }
        int max_sum = curr_sum;
        for (int i = k; i < n; i++) {
            curr_sum += (arr[i] - arr[i - k]);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 30, -5, 20, 7 };
        System.out.println(maxSum(arr, 3));
        System.out.println(maxSumEff(arr, 3));
    }
}
