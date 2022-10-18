// Our task is to cut the rope into maximum number of pieces such that every piece
// has length either a or b or c.
public class RopeCutting {
    public static void main(String[] args) {
        System.out.println(ropeCut(5, 2, 5, 1));
    }

    static int ropeCut(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n < 0)
            return -1;

        int res = Math.max(Math.max(ropeCut(n - a, a, b, c), ropeCut(n - b, a, b, c)), ropeCut(n - c, a, b, c));

        if (res == -1)
            return -1;
        return res + 1;
    }
}
