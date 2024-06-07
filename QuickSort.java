package com.example;

public class Main {
    //Quick Sort
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high){
        int pivotIndex = partition(arr,low,high);
        if(pivotIndex != -1){
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        //we take the first element of the arr.
        //we put the first element at it's right place.
        //now we divide the entire arr into two parts, one that has smaller 
        //elements than arr and one that has larger elements than the pivot. 
        //next, we will perform quicksort for those two parts.
        if(low >= high){
            return -1;
        }
        int i = low;
        int j = high;
        int pivot = low;
        while(i<j){
            while(i<=high && arr[i] <= arr[pivot]){
                i++;
            }
            while(arr[j] > arr[pivot]){
                j--;
            }
            //when they stop moving
            //i is at a number which is greater than pivot
            //j is at a number which is less than or equal to pivot
            if(i<=high && i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //When this loop ends, i is at the first number which is greater than the pivot.
        //j is at the first number that is less than or equal to pivot.
        //we swap the pivot with j
        int temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;
        return j;
    } 

    public static void main(String[] args) {
        int[] array = { 4, 1, 3, 9, 7 };
        mergeSort(array, 0, array.length - 1);
        for (int item : array) {
            System.out.println(item);
        }
    }
}
