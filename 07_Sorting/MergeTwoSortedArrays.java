public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int a[] = { 1, 3, 5, 7 };
        int b[] = { 0, 2, 6, 8, 9 };
        mergeSort(a, b);
    }

    static void mergeSort(int a[], int b[]) {
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                System.out.print(a[i] + "->");
                i++;
            } else {
                System.out.print(b[j] + "->");
                j++;
            }
        }

        // Remaining array!
        while (i < a.length) {
            System.out.print(a[i] + "->");
            i++;
        }

        while (j < b.length) {
            System.out.print(b[j] + "->");
            j++;
        }
    }
}