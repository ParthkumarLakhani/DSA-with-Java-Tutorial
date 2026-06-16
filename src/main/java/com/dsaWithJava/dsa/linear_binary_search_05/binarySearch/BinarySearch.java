package com.dsaWithJava.dsa.linear_binary_search_05.binarySearch;

public class BinarySearch {

    //binary search
    public static boolean binarySearchInt(int[] ary, int target){

        int start = 0;
        int end = ary.length - 1;

        while (start <= end){
            int mid = start + ( end - start) / 2;

            if(ary[mid] > target){
                end = mid - 1;
            } else if (ary[mid] < target) {
                start = mid + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }

    //order agonist
    public static boolean binarySearchOrderAgonist(int[] ary, int target){

        int start = 0;
        int end = ary.length - 1;

        boolean isAsc = ary[0] < ary[end];

        while (start <= end){
            int mid = start + ( end - start) / 2;

            if(target == ary[mid]){
                return true;
            }

            if(isAsc){
                if(ary[mid] > target){
                    end = mid - 1;
                } else if (ary[mid] < target) {
                    start = mid + 1;
                }
            }else {
                if(ary[mid] > target){
                    end = mid - 1;
                } else if (ary[mid] < target) {
                    start = mid + 1;
                }
            }

        }


        return false;
    }
}
