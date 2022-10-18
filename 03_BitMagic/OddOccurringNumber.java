public class OddOccurringNumber {
    public static void main(String[] args) {
        int[] a1 = { 4, 3, 4, 4, 4, 5, 5 };
        System.out.println(oddOccurringNumbers(a1));

    }

    public static int oddOccurringNumbers(int arr[]) {
        int res = 0;
        for (int i = 0; i < arr.length; i++)
            res = res ^ arr[i];
        return res;
    }

}
