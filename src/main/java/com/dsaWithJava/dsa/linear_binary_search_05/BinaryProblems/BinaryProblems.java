package com.dsaWithJava.dsa.linear_binary_search_05.BinaryProblems;

import java.util.ArrayList;
import java.util.List;

public class BinaryProblems {

    //ceiling num ->  smallest element in array greater or equal to target element
    public int ceilingNum() {

        int[] ary = { -2, -1, 0, 1, 3, 44, 55, 66, 88, 99, 100, 110, 101, 990, 1000 };

        int target = 999;

        int len =  ary.length;

        if(len == 0){
            return -1;
        }
        if ( len == 1 && ary[0] == target ){
            return 0;
        }

        int firstPointer = 0;
        int lastPointer = len - 1;

        int middle = firstPointer + (lastPointer - firstPointer) / 2;;

        while (firstPointer <= lastPointer){
            middle = firstPointer + (lastPointer - firstPointer) / 2;
            if (ary[middle] == target){
                return ary[middle];
            }

            if(target > ary[middle]){
                firstPointer = middle + 1;
            }
            if(ary[middle] > target){
                lastPointer = middle - 1;
            }
        }

         if(ary[middle] > target){
            return ary[middle];
        }

        return -1;
    }

    // floor -> greatest number smaller or= target
    public int floorNum(){
        int[] ary = { -2, -1, 0, 1, 3, 44, 55, 66, 88, 99, 100, 110, 101, 990, 1000 };

        int target = 999;

        int len =  ary.length;

        if(len == 0){
            return -1;
        }
        if ( len == 1 && ary[0] == target ){
            return 0;
        }

        int firstPointer = 0;
        int lastPointer = len - 1;

        int middle = firstPointer + (lastPointer - firstPointer) / 2;

        while (firstPointer <= lastPointer){
            middle = firstPointer + (lastPointer - firstPointer) / 2;
            if (ary[middle] == target){
                return ary[middle];
            }
            if(target > ary[middle]){
                firstPointer = middle + 1;
            }
            if (ary[middle] > target){
                lastPointer = middle - 1;
            }
        }

        return ary[middle - 1];
    }

    //leet code 744
    public char smallLetter(){

        char[] ary = { 'x','x','y','y' };

        char target = 'z';

        int len = ary.length;

        if (len == 0){
            return '0';
        }
        if(len == 1 && ary[0] == target){
            return (char) ary[0] ;
        }

        int firstPointer = 0;
        int lastPointer = len - 1;

        int middle = firstPointer + ( lastPointer - firstPointer ) /2;

        while (firstPointer <= lastPointer){
            middle = firstPointer + ( lastPointer - firstPointer ) /2;

            if ( ary[middle] > target){
                lastPointer = middle - 1;
            }else{
                firstPointer = middle + 1;
            }
        }


        return ary[firstPointer % len] ;
    }

    //leet code 34 brute force
    public ArrayList<Integer> elementFirstAndLastPosition(){

        int[] ary = {};
        int target = 6;

        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;

        int firstPosition = -1;
        int lastPosition = -1;

        for(int i = 0; i<=ary.length -1; i++){
            if(ary[i] == target){
                if(count == 0){
                    firstPosition = i;
                    count++;
                }
                lastPosition = i;
            }
        }

        if(ary.length == 0 || count == 0){
            list.add(-1);
            list.add(-1);
        }else {
            list.add(firstPosition);
            list.add(lastPosition);
        }

        return list;
    }

    // leet code 34
    public ArrayList<Integer> elementPosition(){

        ArrayList<Integer> list = new ArrayList<>(10);


        return list;
    }
}
