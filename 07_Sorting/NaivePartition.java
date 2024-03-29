public class NaivePartition {
    public static void main(String[] args) {
        int arr[] = { 5, 13, 6, 9, 12, 11, 8 };
        partition(arr, 0, 6, 6);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

    static void partition(int arr[], int l, int h, int p) {
        int temp[] = new int[h - l + 1];
        int index = 0;

        for (int i = l; i <= h; i++)
            if (arr[i] <= arr[p]) {
                temp[index] = arr[i];
                index++;
            }

        for (int i = l; i <= h; i++)
            if (arr[i] > arr[p]) {
                temp[index] = arr[i];
                index++;
            }

        for (int i = l; i <= h; i++)
            arr[i] = temp[i - l];

    }

}
