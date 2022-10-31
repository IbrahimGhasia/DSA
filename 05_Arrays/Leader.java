// Find the leader in the given array.

public class Leader {
    static void findLeader(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                System.out.println(arr[i]);
        }
    }

    // Time Complexity O(n). In this solution we will pick the leader by
    // traversing the array in reverse order. So the last element will
    // allways be the leader.
    static void findLeaderEff(int arr[]) {
        int curr_leader = arr[arr.length - 1];
        System.out.print(curr_leader + " ");
        for (int i = arr.length - 2; i >= 0; i--) {
            if (curr_leader < arr[i]) {
                curr_leader = arr[i];
                System.out.print(curr_leader + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 3, 6, 5, 2 };
        findLeader(arr);
    }
}
