package com.dsaWithJava.dsa.linearSearch;

public class LinearSearch {

    //search in int
    public static boolean linearSearchInt(int[] ary, int target){
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

    //search in string
    public static boolean linearSearchString(String str, char target){
        int length = str.length();

        if(length == 0){
            return false;
        }

        for(int index = 0; index < length; index++){
            if (str.charAt(index) == target){
                return true;
            }
        }

        return false;
    }


    //search in range
    public static boolean linearSearchRange(int[] ary, int target, int startIndex, int endIndex ){
        int length = ary.length;
        if(length == 0){
            return false;
        }

        if( !((startIndex >= 0 && endIndex >= 0) && ( endIndex > startIndex )) ){
            throw new RuntimeException("Please enter a valid index");
        }
        if( !(startIndex <= length-1) ){
            throw new RuntimeException("Please enter a valid startIndex");
        }
        if( !(endIndex <= length-1) ){
            throw new RuntimeException("Please enter a valid endIndex");
        }


        for(int index = startIndex; index < endIndex; index++){
            if (ary[index] == target){
                System.out.println("index at: "+index);
                return true;
            }
        }

        return false;
    }


}
