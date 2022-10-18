// Sum of natural numbers using recursion

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNatNums(5));
    }

    static int sumOfNatNums(int n) {
        if (n == 0)
            return 0;
        return n + sumOfNatNums(n - 1);
    }
}
