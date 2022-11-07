// Find the majority Element in the given array.
// Majority element is the element that appears more than n/2 times in the array

public class MajorityElement {
    static int majority(int arr[]) {
        int max = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int curr_ele = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == curr_ele) {
                    count++;
                }
            }
            if (count > max)
                return i;
        }
        return -1;
    }

    static int majorityEff(int arr[]) {
        // Find a canditate
        int n = arr.length, res = 0, count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i])
                count++;
            else
                count--;
            if (count == 0) {
                res = i;
                count = 1;
            }
        }

        // Check if the candidate is actually a majority
        count = 0;
        for (int i = 0; i < n; i++)
            if (arr[res] == arr[i])
                count++;
        if (count <= n / 2)
            res = -1;
        return res;
    }

    public static void main(String[] args) {
        // int arr[] = { 20, 30, 40, 50, 50, 50, 50 };
        int arr[] = { 8, 7, 6, 8, 6, 6, 6, 6 };
        System.out.println(majority(arr));
        System.out.println(majorityEff(arr));
    }
}
