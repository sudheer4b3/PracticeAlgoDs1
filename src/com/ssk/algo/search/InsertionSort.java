package com.ssk.algo.search;

public class InsertionSort {

    public static void main(String[] args) {

        InsertionSort ob = new InsertionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);

    }

    private void sort(int arr[]){



    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
