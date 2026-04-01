package com.dsaWithJava.dsa.linearSearch;

public class LinearSearch {

    public static boolean linearSearch(int[] ary, int target){
        int length = ary.length;

        if(length == 0){
            return false;
        }

        for(int index = 0; index < length; index++){
            if (ary[index] == target){
                return true;
            }
        }

        return false;
    }
}
