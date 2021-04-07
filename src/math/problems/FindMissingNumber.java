package math.problems;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int arr[] ={1,2,3,4,5,6,7,9,10};
        int n = arr.length+1;
        int sum1 = n*(n+1)/2;
        int sum2 = Arrays.stream(arr).sum();
        System.out.println("Missing Number : "+(sum1-sum2));
    }

}


