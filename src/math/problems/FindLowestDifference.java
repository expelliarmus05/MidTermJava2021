package math.problems;
import java.util.Arrays;
public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int arr1[] = {1, 3, 5, 7,9};
        int arr2[] = {5,3,7,8,9,2};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int dif = (arr1[0] - arr2[0] )> 0? (arr1[0] - arr2[0] ): (arr2[0] - arr1[0] );
        System.out.println("Lowest difference : "+ dif);

    }

}



