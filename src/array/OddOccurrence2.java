package array;

/*
A Better Solution is to use Hashing
HashMap에 저장하는데 가장 마지막에 저장된 값이 홀수의 갯수를 가졌을때 그 값을 가져온다.
여기서는 4하고 5가 홀수개의 갯수를 가졌지만 HashMap에 마지막으로 키와 값이 들어간 4가 출력된다.
 */

import java.util.HashMap;

public class OddOccurrence2 {
    // Java program to find the element occurring odd number of times

    // Function to find the element occurring odd number of times
    static int getOddOccurrence(int arr[], int n) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        // Putting all elements into the HashMap
        for (int i=0; i<n; i++) {
            if (hmap.containsKey(arr[i])) {
                int val = hmap.get(arr[i]);

                // If array element is already present then increase the count of that element
                hmap.put(arr[i], val+1);
            }
            else
                // If array element is not present then put element into the HashMap and initialize the count to one
                hmap.put(arr[i], 1);
        }
//        System.out.println(hmap);

        // Checking for odd occurrence of each element present in the HashMap
        for (Integer a:hmap.keySet()) {
            if (hmap.get(a) % 2 != 0)
                return a;
        }
        return -1;
    }

    // Driver Code
    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 4, 5, 5, 2, 4, 3, 5, 2, 4, 4, 2, 4};
        int n = arr.length;
        System.out.println(getOddOccurrence(arr, n));
    }
}
