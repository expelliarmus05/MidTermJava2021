package problemandsolutions;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySort {
    // By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.
    void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        ArraySort obj = new ArraySort();
        obj.bubbleSort(arr);
        System.out.print("Sorted array : ");
        for(int a: arr){
            System.out.print(a + " ");
        }
    }


}
