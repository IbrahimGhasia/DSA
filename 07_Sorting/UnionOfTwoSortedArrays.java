import java.util.Arrays;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = { 10, 20, 20 };
        int arr2[] = { 5, 20, 40, 40 };
        // union(arr1, arr2);
        unionEff(arr1, arr2);
    }

    static void union(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        int arr[] = new int[m + n];

        for (int i = 0; i < m; i++)
            arr[i] = arr1[i];

        for (int i = 0; i < n; i++)
            arr[m + i] = arr2[i];

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1])
                System.out.print(arr[i] + " ");
        }
    }

    static void unionEff(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;

        int i = 0, j = 0;
        while (i < m && j < n) {

            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                System.out.print(" " + arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.print(" " + arr2[j]);
                j++;
            } else {
                System.out.print(" " + arr1[i]);
                i++;
                j++;
            }
        }

        while (i < m) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            System.out.println(" " + arr1[i]);
            i++;
        }

        while (j < n) {
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            System.out.println(" " + arr2[j]);
            j++;
        }
    }
}
