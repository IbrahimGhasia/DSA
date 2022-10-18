import java.util.Scanner;

public class KthBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.print("Enter the kth bit you want to check : ");
        int k = sc.nextInt();

        kthBit(n, k);
    }

    public static void kthBit(int n, int k) {
        if ((n & (1 << (k - 1))) != 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}