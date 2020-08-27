package array;

import java.util.HashSet;

/*
PairSum 이해가 잘 안가네요.
확인해봐야 할거 같습니다.
 */

public class PairSum2 {
    // Java implementation using  Hashing

    static void printpairs(int arr[], int sum) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];

            // checking for condition
            if (s.contains(temp)) {
                System.out.println("Pair with given sum "+sum+ " is ("+arr[i]+", "+temp+")");
            }
            s.add(arr[i]);
        }
    }

    // Main to test teh above function
    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 10, 8};
        int n = 5;
        printpairs(A, n);
    }
}
