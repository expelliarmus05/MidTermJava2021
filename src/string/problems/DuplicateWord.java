package string.problems;

import java.util.*;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        String sen = "Ball cat cat dog dog ball";

        sen = sen.toLowerCase().replace("."," ");
        String arr[] = sen.split(" ");
        List<String> words = Arrays.asList(arr);
        Set <String> set = new HashSet<>(words);
        int length=0,num=0;
        for (String word: set){
            if(Collections.frequency(words,word)>1){
                length += word.length();
                num++;
                System.out.println("Word : "+word +"\n"+"Frequency : "+ Collections.frequency(words,word));
            }
        }
        System.out.println("Avg length: "+(double)(length/num));
    }

}
