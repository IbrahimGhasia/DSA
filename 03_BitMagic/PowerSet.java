public class PowerSet {
    public static void main(String[] args) {
        powerSet("abc");
    }

    static void powerSet(String str) {
        int len = str.length();

        for (int counter = 0; counter < Math.pow(2, len); counter++) {
            for (int j = 0; j < len; j++) {
                if ((counter & (1 << j)) != 0)
                    System.out.print(str.charAt(j));
            }  
            System.out.print(" ");
        }
    }
}
