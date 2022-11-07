// Find out the length of longest subarray, that has alternating even-odd elements

public class MaxLengthEvenOddSubarray {
    static int maxLength(int arr[]) {
        int n = arr.length;
        int res = 1;
        int curr = 1;

        for (int i = 1; i < n; i++) {
            if ((arr[i - 1] % 2 == 0 && arr[i] % 2 != 0) || (arr[i - 1] % 2 != 0 && arr[i] % 2 == 0)) {
                curr++;
                res = Math.max(res, curr);
            } else {
                curr = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 12, 14, 7, 8 };
        System.out.println(maxLength(arr));
    }
}
