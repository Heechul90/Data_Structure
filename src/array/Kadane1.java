package array;

/*
array에서 가장 큰 두 수 사이에 있는 값들을 합한것.
알고리즘은 좀 이해가 안감.
 */

public class Kadane1 {
    // Java program to print largest contiguous array sum

    public static void main(String[] args) {
        int [] a = {2, 4, -3, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is "+maxSubArraySum(a));
    }

    static int maxSubArraySum(int a[]) {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i=0; i<size; i++) {
            max_ending_here = max_ending_here + a[i];
            System.out.println("i: "+i+"  "+"max_so_far: "+max_so_far);
            System.out.println("i: "+i+"  "+"max_ending_here: "+max_ending_here);
            System.out.println("----------------");
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
