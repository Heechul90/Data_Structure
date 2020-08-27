package array;

import com.sun.org.apache.xerces.internal.impl.dv.xs.BaseDVFactory;

import java.util.Arrays;

/*
array이 안에서 임의의 두 수를 더한 값이 내가 제시한 n값과 같은 같이 있는지 찾아내는것
 */

public class PairSum1 {
    // Java program to check if given array has 2 elements whose sum is equal to the given value

    // Function to check if array has 2 elements whose sum is equal to the given value
    static boolean hasArrayTwoCandidates(int A[], int arr_size, int sum) {
        int l, r;

        // Sort the elements
        Arrays.sort(A);

        // Now look for the two candidates in the sorted array
        l = 0;
        r = arr_size - 1;
        while (l < r) {
            if (A[l] + A[r] == sum)
                return true;
            else if (A[l] + A[r] < sum)
                l++;
            else  // A[i] + A[j] > sum
                r--;
        }
        return false;
    }

    // Driver Code
    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 10, -8};
        int n = 50;
        int arr_size = A.length;

        // Function callting
        if (hasArrayTwoCandidates(A, arr_size, n))
            System.out.println("Array has two elements with given sum");
        else
            System.out.println("Array doesn't have two elements with given sum");

    }
}