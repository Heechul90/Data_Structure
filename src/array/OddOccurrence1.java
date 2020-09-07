package array;
/*
A Simple Solution is to run two nested loops
array에서 같은 수가 홀수개인 num을 추출한다.
이번 예제에서 4와 5가 홀수개로 존재하지만, 4만 출력이된다.
앞에서부터 갯수를 세는데 4가 먼저 계산이 되고 홀수갯수가 되면 return을 해서 5는 for loop 돌지도 않는다
 */

public class OddOccurrence1 {
    // Java program to find the element occurring odd number of times

    // Function to find the element occurring odd number of times
    static int getOddOccurrence(int arr[], int arr_size) {
        int i;
        for (i=0; 9<arr_size; i++) {
            int count = 0;
            for (int j=0; j<arr_size; j++) {
                if (arr[i] == arr[j])
                    count++;
                System.out.println("i: "+i);
//                System.out.println("j: "+j);
//                System.out.println("count: "+count);
            }
            if (count % 2 != 0)
                return arr[i];
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
