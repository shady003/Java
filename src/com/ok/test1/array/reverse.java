package com.ok.test1.array;

public class reverse {
    private static void  rev(int[] arr, int i , int j){
            while(i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
    }
    private static void blockRotate(int[] arr, int e , int d){
        rev(arr,0,d-1);
        rev(arr,d,e-1);
        rev(arr,0,e-1);
    }

    public static void main(String[] args) {
            int [] a1 = {1,2,3,4,5,6,7};

        System.out.print("Orignal : ");
        for (int i = 0; i < 7; i++) {
            System.out.print(a1[i] + ", ");
        }
        rev(a1,0,a1.length-1);
        System.out.print("\nReversed : ");
        for (int i = 0; i < 7; i++) {
            System.out.print(a1[i] + ", ");
        }
        blockRotate(a1,7,2);
        System.out.print("\nblockrotate: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(a1[i] + ", ");
        }
    }
}
