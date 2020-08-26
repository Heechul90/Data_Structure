package array;

/*
In an unsorted array,
the search operation can be performed by linear traversal from the first element to the last element.
 */

public class UnsortedSearch {
    // Function to implement
    // search operation

    static int findelement(int arr[], int n, int key) {
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }

    // Driver Code
    public static void main(String[] args) {
        int arr[] = {12, 34, 10, 6, 40};
        int n = arr.length;

        // Using a last element as search element
        int key = 40;
        int position = findelement(arr, n, key);

        if (position == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element Fount at Position: " + (position + 1));
    }
}

/*
Output
Element Found at Position: 5
 */