package problemandsolutions;

import java.util.Scanner;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.
    int sequentialSearch(int arr[], int num){
        for (int i = 0; i < arr.length; i++ ){
          if(arr[i] == num){
              return i+1;
          }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SearchElementOfArray obj = new SearchElementOfArray();
        int a[] = new int[10];
        System.out.println("Input the array :");
        for (int i = 0; i < a.length; i++){
            a[i] = input.nextInt();
        }
        System.out.println("The number to be searched : ");
        int n = input.nextInt();
        int m = obj.sequentialSearch(a,n);
        if ( m == -1){
            System.out.println("Not found");
        }
        else {
            System.out.println("Found in index number "+m);
        }
    }
}
