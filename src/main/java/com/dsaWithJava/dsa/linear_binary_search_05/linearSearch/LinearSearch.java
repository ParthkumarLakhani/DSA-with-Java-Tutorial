package com.dsaWithJava.dsa.linear_binary_search_05.linearSearch;

/* Time Complexity

Basic Amount of time taken to perform operation.

Time Complexity is a measure of how the execution time of an algorithm grows as the input size (n) increases.

How The time grows as your input grows.
*/

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


    //search in 2d array
    public static boolean linearSearch2DAry(int[][] ary, int target){
        int length = ary.length;

        if(length == 0){
            return false;
        }

        for(int index = 0; index < length; index++){
            int newLen = ary[index].length;
            for (int key = 0; key < newLen; key++) {
                if (ary[index][key] == target){
                    System.out.println("outer index: "+index);
                    System.out.println("inner index: "+key);
                    return true;
                }
            }
        }

        return false;
    }

    // leet code 1295

    public void findEvenNumberOfDigits(){
        // ary of integers, return how many of them contain an even number of digits.

        int[] ary = { 12, 345, 2, 6, -7896, 89, 8789};

        System.out.println(findEvenNumberOfDigitsNumber(ary));
    }

    // findEvenNumberOfDigits  ->  using string
    public int findEvenNumberOfDigitsString(int[] ary ){
        int count = 0;

        for (int i = 0; i <= ary.length - 1; i++){

            String str = String.valueOf(Math.abs(ary[i]));

            if (str.length() % 2 == 0){
                count++;
            }

        }
        return count;
    }

    // with no in built method
    public int findEvenNumberOfDigitsNumber(int[] ary){
        int count = 0;

        for (int i = 0; i <= ary.length - 1; i++){
            if(isEven(ary[i])){
                count++;
            }
        }

        return count;
    }

    public boolean isEven(int num){

        if (num < 0){
            num = num * -1;
        }

        return numDigit(num) % 2 == 0;
    }

    public int numDigit(int num){
        int count = 0;

        while ( num > 0){
            count++;
            num = num/10;
        }

        return count;
    }

    // with log method
    public int withLog(int num){
        return (int)(Math.log(num) / 10 ) + 1;
    }


    //leet code - 1672
    public void richestCustomer(){
        int[][] amount = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };

        System.out.println(maxWealth(amount));
    }

    public static int maxWealth(int[][] amt){

        int max = 0;

        for (int i = 0; i <= amt.length - 1; i++ ){
            int subArraySum = 0;
            for (int j = 0; j <= amt[i].length - 1; j++) {
                subArraySum = subArraySum + amt[i][j];
            }
            if (subArraySum > max){
                max = subArraySum;
            }
        }

        return max;
    }




}
