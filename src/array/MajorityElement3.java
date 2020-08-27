package array;

/*
findCandidate함수가 이해가 좀 안되지만 결과는 잘 나옴
Using Moore’s Voting Algorithm
Algorithm:
1.Loop through each element and maintains a count of majority element, and a majority index, maj_index
2.If the next element is same then increment the count if the next element is not same then decrement the count.
3.if the count reaches 0 then changes the maj_index to the current element and set the count again to 1.
4.Now again traverse through the array and find the count of majority element found.
5.If the count is greater than half the size of the array, print the element
6.Else print that there is no majority element
 */

public class MajorityElement3 {
    // Program for finding out majority element in an array

    // Function to print Majority element
    void printMajority(int a[], int size) {
        // Find the candidate for Majority
        int cand = findCandidate(a, size);

        // Print the candidate if it is majority
        if (isMajority(a, size, cand))
            System.out.println(" "+cand+" ");
        else
            System.out.println("No Majority Element");
    }

    // Function to find the candidate for Majority
    int findCandidate(int a[], int size) {
        int maj_index = 0, count = 1;
        int i;
        for (i=1; i<size; i++) {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }

    // Function to check if the candidate occurs more than n/2 times
    boolean isMajority(int a[], int size, int cand) {
        int i, count = 0;
        for (i=0; i<size; i++) {
            if (a[i] == cand)
                count++;
        }
        if (count > size/2)
            return true;
        else
            return false;
    }

    // Driver program to test the above functions
    public static void main(String[] args) {
        MajorityElement3 majorityElement = new MajorityElement3();
        int a[] = new int[]{1, 3, 3, 1, 2, 6, 7, 8, 9, 3, 3, 3, 3, 3, 3};
        int size = a.length;
        majorityElement.printMajority(a, size);

    }
}
