package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String sen = "I am a boy.";
        sen = sen.replace("."," ");
        String arr[] = sen.split(" ");
        int max = arr[0].length();
        for(String a : arr){
            if(a.length()>max){
                max = a.length();
            }
        }
        for(String a : arr){
            if(a.length()== max){
                System.out.println(a.length()+" "+a);
            }
        }
    }
}
