public class GenerateSubset {
    public static void main(String[] args) {
        subsets("ABC", "", 0);
    }

    static void subsets(String str, String curr, int i) {
        if (i == str.length()) {
            System.out.print(" " + str);
            return;
        }

        subsets(str, curr, i + 1);
        subsets(str, curr + str.substring(0, i), i + 1);
    }
}
