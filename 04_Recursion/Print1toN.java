import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        printNto1(n);
        System.out.println();
        print1toN(n);
        sc.close();
    }

    static void printNto1(int n) {
        if (n == 0 || n < 0)
            return;
        System.out.print(n + " ");
        printNto1(n - 1);
    }

    static void print1toN(int n) {
        if (n == 0)
            return;
        print1toN(n - 1);
        System.out.print(n + " ");
    }
}
