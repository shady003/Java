package com.ok.test1.array;

public class binarysearch {
    private static int binaryS(int [] arr, int key){
       int  f = 0;
       int  l = arr.length - 1 ;
        while (f <= l){
            int mid = (f + l) / 2 ;
            if (arr[mid] == key){
                return mid;
            }
            else if (key < arr[mid] ){
                l = mid - 1;
            }
            else{
                f = mid + 1 ;
            }
        }
        return -1;
    }
    public static void main (String [] argv){
        System.out.println(binaryS(new int[] {1,2,3,4,5,6,7,8,9},7 ));;
    }
}
