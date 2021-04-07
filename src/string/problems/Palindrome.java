package string.problems;

import java.util.*;

public class Palindrome {
    static  void pallindrome(String word){
        char arr1[] = word.toLowerCase().toCharArray();
        char arr2[] = new char[arr1.length];
        for (int i = 0; i < arr1.length; i++ ){
            arr2[i] = arr1[arr1.length-i-1];
        }
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
            String word = "osssio";
            pallindrome(word);
    }

}