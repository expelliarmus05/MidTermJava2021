package math.problems;

import java.util.*;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}

    public static void main(String[] args) {
        int A[] = {1,2,3,4};
        int B[]={4,5,6,7,8};
        List<Integer> list1 = new ArrayList(A.length);
        for(int a : A){
            list1.add(Integer.valueOf(a));
        }
        for(int b : B){
            list1.add(Integer.valueOf(b));
        }
        Set<Integer> set = new HashSet(list1);
        int C[] = new int[set.size()];
        int i = 0;
        for(int a : set){
            C[i] = a ;
            i++;
        }
        for (int a : C){
            System.out.print(a+ " ");
        }



    }



}