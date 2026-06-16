package com.dsaWithJava.dsa.arrays_list_04;

import java.util.ArrayList;

public class Ary {

    public void swap(int[] arr, int index1, int index2){
        arr[index1] = arr[index1] + arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] = arr[index1] - arr[index2];
    }

    public void max(int[] arr){
        int max = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }

    public void reverseAry(int[] arr){

        int len = arr.length - 1;

        for (int i = 0, j = len; i<=j ; i++,j--){
            swap(arr,i,j);
        }

    }

    public void getArray(){

        int[] ary = new int[5];
        int[] aryOne = { 2,3,4,5 };


        ArrayList<Integer> list = new ArrayList<>();

        /* Difference between Array and ArrayList

            | Feature             | Array                            | ArrayList                                                 |
            | ------------------- | -------------------------------- | --------------------------------------------------------- |
            | Size                | Fixed once created               | Dynamic (can grow/shrink)                                 |
            | Package             | Built into Java language         | Part of `java.util` package                               |
            | Data Types          | Can store primitives and objects | Stores objects only (uses wrapper classes for primitives) |
            | Performance         | Faster                           | Slightly slower due to resizing and method calls          |
            | Length/Size         | `arr.length`                     | `list.size()`                                             |
            | Add/Remove Elements | Manual handling required         | `add()`, `remove()` methods available                     |
            | Type                | Language construct               | Collection Framework class                                |

         */

    }

    /* Pointer
        Java does not have pointers like C or C++.

        Java does not support explicit pointers. It uses references to objects instead.
        References provide pointer-like behavior without exposing memory addresses or allowing pointer arithmetic, making Java safer and easier to manage.


        int[] arr ={1,4,5,5};
        System.out.println(arr);        then what is this ?? [I@26bbe604

        This is not a memory address. It's the default toString() representation inherited from Object.
        It consists of:
            [I      -> int array ([] of int)
            @       -> separator
            26bbe604 -> hash code in hexadecimal



        Is the hash code a pointer?
        Not necessarily.

            Many JVM implementations derive the default hash code from object identity, which may be related to internal memory information, but Java does not guarantee that it is the memory address.
            The JVM is free to move objects in memory during garbage collection, so Java deliberately hides real addresses from you.
            That's why Java is said to use references, not exposed pointers.
     */
}
