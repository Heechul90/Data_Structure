package array;

/*
빈도수가 많은 num을 리턴하는데 조건은 array길이의 반보다 빈도수가 많아야 한다.
Algorithm:
1.Create a variable to store the max count, count = 0
2.Traverse through the array from start to end.
3.For every element in the array run another loop to find the count of similar elements in the given array.
4.If the count is greater than the max count update the max count and store the index in another varaible.
5.If the maximum count is greater than the half the size of the array, print the element. Else print there is no majority element.
 */

public class MajorityElement1 {
    // Java program to find Majority element in an array

    // Function to find Majority element in an array
    static void findMajority(int arr[], int n) {
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i=0; i<n; i++) {
            int count = 0;
            for(int j=0; j<n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            // update maxCount if count of current element is greater
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        // if maxCount is greater than n/2 return the corresponding element
        if (maxCount > n/2)
            System.out.println(arr[index]);
        else
            System.out.println("No Majority Element");
    }

    // Driver Code
    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 6, 3, 5, 1};
        int n = arr.length;

        // Function calling
        findMajority(arr, n);
    }
}
