package com.ssk.algo.search;

public class SelectionSort {

    public static void main(String[] args) {

        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.selctionSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);

    }

    private void selctionSort(int arr[]){

        for(int i =0; i < arr.length-1 ; i++){
            int minidx=i;

            for (int j=i+1;j< arr.length;j++){

                if(arr[j] < arr[minidx]){
                    minidx = j;
                }
            }
            int temp =arr[i];
            arr[i]=  arr[minidx];
            arr[minidx] = temp;
        }
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
