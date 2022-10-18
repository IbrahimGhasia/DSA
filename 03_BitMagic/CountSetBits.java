public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(countSet(5));
    }

    public static int countSet(int n) {
        int res = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                res++;
            }
            n = n >> 1;
        }
        return res;
    }
}
