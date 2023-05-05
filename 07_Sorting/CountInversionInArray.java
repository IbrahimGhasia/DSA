public class CountInversionInArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        int count = countInversion(arr);
        System.out.println(count);
    }

    static int countInversion(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    count++;
            }
        }
        return count;
    }

    // static int effCountInversion(int arr[]) {

    // }
}
