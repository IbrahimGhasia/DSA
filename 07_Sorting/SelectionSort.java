public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        display(arr);
        effSelectionSort(arr);
        display(arr);
    }

    public static void selectionSort(int arr[]) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int min_index = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index])
                    min_index = j;
            }
            temp[i] = arr[min_index];
            arr[min_index] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void effSelectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_index])
                    min_index = j;

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ->");
        }
        System.out.println();
    }
}