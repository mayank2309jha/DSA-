package com.example;

public class Main {
    //Merge Sort
    static void merge(int arr[], int l, int m, int r) {
        int i = l;
        int j = m + 1;
        // we will iterate over the arr, from i = l to i = m and j = m+1 to j = r
        // we will also make a new array and store the values in their right order
        // there.
        int[] aux = new int[r - l + 1];
        int curr = 0;
        while (i < m + 1 && j < r + 1) {
            if (arr[i] <= arr[j]) {
                aux[curr] = arr[i];
                curr++;
                i++;
            } else {
                aux[curr] = arr[j];
                curr++;
                j++;
            }
        }
        // either i = m+1 or j = r+1
        if (i == m + 1) {
            while (j < r + 1) {
                aux[curr] = arr[j];
                j++;
                curr++;
            }
        } else if (j == r + 1) {
            while (i < m + 1) {
                aux[curr] = arr[i];
                i++;
                curr++;
            }
        }
        // now we just fill arr with item from aux array in the sorted manner.
        curr = 0;
        i = l;
        // for (int item : arr)
        // System.out.println(item);

        while (i < r + 1) {
            arr[i] = aux[curr];
            curr++;
            i++;
        }
    }
    static void mergeSort(int arr[], int l, int r) {
        // case 1 = array of size less than 2
        if (l >= r) {
            return;
        }
        // case 2 = array of size at least 2
        int middleIndex = l + (r - l) / 2;
        // System.out.println(l + " " + middleIndex + " " + r);
        // for (int item : arr) {
        // System.out.println(item);
        // }
        // System.out.println("-----------------------------");
        mergeSort(arr, l, middleIndex);
        mergeSort(arr, middleIndex + 1, r);
        merge(arr, l, middleIndex, r);
    }

    public static void main(String[] args) {
        int[] array = { 4, 1, 3, 9, 7 };
        mergeSort(array, 0, array.length - 1);
        for (int item : array) {
            System.out.println(item);
        }
    }
}
