public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(13));
    }

    static int fibonacci(int n) {
        // if (n == 0)
        // return 0;
        // if (n == 1)
        // return 1;
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
