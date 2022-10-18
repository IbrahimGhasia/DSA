public class SecondLargestElement {
    public static int getLargest(int arr[]) {
        int largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest])
                largest = i;
        }
        return largest;
    }

    public static int secondLargest(int arr[]) {
        int largest = getLargest(arr);
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[largest]) {
                if (res == -1) {
                    res = i;
                } else if (arr[i] > arr[res])
                    res = i;
            }
        }
        return res;
    }

    // Efficient Solution:
    public static int secondLargestEff(int arr[]) {
        int res = -1, largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res])
                    res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 20, 12, 20, 10 };
        int arr2[] = { 10, 10, 10 };
        // System.out.println(secondLargest(arr2));
        System.out.println(secondLargestEff(arr));
    }

}
