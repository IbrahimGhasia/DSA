import java.util.Arrays;

public class Frac_Knapsack {
    public static void main(String[] args) {
        Item arr[] = {
                new Item(18, 25),
                new Item(15, 24),
                new Item(10, 15),
        };
        int W = 20;
        System.out.println(fracKnapsack(arr, W));
    }

    public static double fracKnapsack(Item arr[], int W) {
        Arrays.sort(arr);

        double res = 0.0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].wt <= W) {
                res = res + arr[i].val;
                W = W - arr[i].wt;
            } else {
                res = res + (arr[i].val * (double) W) / (double) arr[i].val;
                break;
            }
        }

        return res;
    }
}

class Item implements Comparable<Item> {
    int wt, val;

    public Item(int w, int v) {
        wt = w;
        val = v;
    }

    public int compareTo(Item i) {
        return (this.wt) * (i.val) - (this.val) * (i.wt);
    }
}
