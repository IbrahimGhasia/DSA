// Write a function to find the the largest element in array

public class LargestElementInArray {

    public static int largestElement(int arr[]) {
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
        // The time complexity is theta(n)
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 20, 10 };
        System.out.println(largestElement(arr));
    }
}
