public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int a[] = { 10, 20, 20, 40, 60 };
        int b[] = { 2, 20, 40, 20 };
        intersection(a, b);
    }

    static void intersection(int a[], int b[]) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (a[i] < b[j])
                i++;
            else if (a[i] > b[j])
                j++;
            else {
                System.out.println(" " + a[i]);
                i++;
                j++;
            }
        }
    }
}