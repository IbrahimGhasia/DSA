// Remove Duplicates from the given sorted array.

public class RemoveDuplicate {

    static int removeDuplicate(int arr[]) {
        int temp[] = new int[arr.length];
        temp[0] = arr[0];
        int res = 1;

        for (int i = 1; i < arr.length; i++) {
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }

        for (int i = 0; i < res; i++) {
            arr[i] = temp[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 30, 30, 30, 30 };
        System.out.println(removeDuplicate(arr));
    }

}