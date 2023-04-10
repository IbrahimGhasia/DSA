public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 6, 3, 2, 1, 4, 8, 7, 9 };
        System.out.println("Before Swap");
        display(arr);
        sort(arr);
        System.out.println("After Sorting");
        display(arr);

    }

    static int[] sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
        return arr;
    }

    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "->");
        }
        System.out.println();
    }
}