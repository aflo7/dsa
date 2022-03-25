/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flores;

import java.util.Random;

/**
 *
 * @author andres
 */
public class Main {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        
        int[] arr = new int[100];
        
        // genrate 100 random numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }
        
        // print unsorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        System.out.println("\n--Sorting-----------");
        
        mergeSort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
    
    private static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;
        
        if (inputLength < 2) {
            return;
        }
        
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];
        
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }
        
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        
        merge(inputArray, leftHalf, rightHalf);
    }
    
    private static void merge (int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        
        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }
    
}
