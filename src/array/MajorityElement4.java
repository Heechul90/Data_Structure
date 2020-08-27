package array;

import java.util.HashMap;

/*
Using Hashmap
Algorithm:
1.Create a hashmap to store a key-value pair, i.e. element-frequency pair.
2.Traverse the array from start to end.
3.For every element in the array, insert the element in the hashmap if the element does not exist as key,
  else fetch the value of the key ( array[i] ) and increase the value by 1
4.If the count is greater than half then print the majority element and break.
5.If no majority element is found print “No Majority element”
 */
public class MajorityElement4 {
    // Program for finding out majority element in an array

    private static void findMajority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i=0; i<arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) + 1;
                if (count > arr.length/2) {
                    System.out.println("Majority found : "+arr[i]);
                    return;
                } else
                    map.put(arr[i], count);
            } else
                map.put(arr[i], 1);
        }
        System.out.println("No Majority element");
    }

    // Driver program to test the above functions
    public static void main(String[] args) {
        int a[] = new int[]{2, 2, 2, 2, 5, 5, 2, 3, 3};
        findMajority(a);
    }
}
