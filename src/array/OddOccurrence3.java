package array;

/*
xor 연산을 통해서 얻은 beat??
The Best Solution is to do bitwise XOR of all the elements
 */

public class OddOccurrence3 {
    // Java program to find the element occurring odd number of times
    int getOddOccurrence(int ar[], int ar_size) {
        int i;
        int res = 0;
        for (i = 0; i < ar_size; i++) {
            res = res ^ ar[i];
            System.out.println(res);
        }
        return res;
    }

    // Driver Code
    public static void main(String[] args) {
        OddOccurrence3 occur = new OddOccurrence3();
        int ar[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int n = ar.length;
        System.out.println(occur.getOddOccurrence(ar, n));
    }
}
