class DeleteElementFromArray {
    public static void main(String[] args) {
        int arr[] = { 3, 8, 12, 5, 6 };
        delete(arr, 5, 12);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int delete(int arr[], int n, int x) {
        int i;
        for (i = 0; i < n; i++)
            if (arr[i] == x)
                break;
        if (i == n) // This conditions says that we couldn't find the element
            return n;

        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        return (n - 1);
    }
}