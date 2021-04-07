package string.problems;


import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    void angramCheaker(String word1, String word2){
        char arr1[] = word1.toLowerCase().toCharArray();
        char arr2[] =word2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Angram");
        }
        else{
            System.out.println("Not angram");
        }
    }

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Scanner input = new Scanner(System.in);
        Anagram obj = new Anagram();
        System.out.println("1st Word :");
        String word1 = input.nextLine();
        System.out.println("2nd Word");
        String word2 = input.nextLine();
        obj.angramCheaker(word1,word2);

    }
}
