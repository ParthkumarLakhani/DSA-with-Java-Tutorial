package com.dsaWithJava.dsa.linear_binary_search_05.binarySearch;


// MOST IMPORTANT
/*
    Working on sorting ary [ ascending/descending ]
    even it's also run on unsorted ary but result may get incorrect.


    Steps
    1.  Find the middle element of the array.
    2.  Compare the target value with the middle element.
    3.  If the target is equal to the middle element, the search is successful.
    4.  If the target is greater than the middle element, search in the right half of the array.
    5.  If the target is less than the middle element, search in the left half of the array.
    6.  Repeat the process until the target is found or the search space becomes empty.


    Time Complexity
        Best Case: O(1) (target found at the middle)
        Average Case: O(log n)
        Worst Case: O(log n)


    why we need binary search ??

    Time Complexity Comparison
        | Algorithm     | Time Complexity |
        | ------------- | --------------- |
        | Linear Search | O(n)            |
        | Binary Search | O(log n)        |


    For 1,000,000 items:
        | Algorithm     | Comparisons     |
        | ------------- | --------------- |
        | Linear Search | Up to 1,000,000 |
        | Binary Search | About 20        |




    Comparison
    Binary Search works by reducing the search space by **50% after each comparison**.

    ## Search Space Reduction
    N represents the total number of elements in the sorted array.
    A level represents one iteration (or one comparison) of Binary Search.  After each level, the search space is reduced by half.

    | Level | Remaining Elements |
    | ----- | ------------------ |
    | 0     | N                  |
    | 1     | N / 2              |
    | 2     | N / 4              |
    | 3     | N / 8              |
    | 4     | N / 16             |
    | 5     | N / 32             |
    | k     | N / 2ᵏ             |

    Binary Search stops when only one element remains:
        Yes. At level k, Binary Search stops when the search space has been reduced to exactly 1 element.

    Remaining Elements = N / 2^k
    When only one element is left:  N / 2^k = 1

    N = 2^k;
    logN = log2^k
    logN = klog2

    therefore
        k = log₂(N)  ==> total num of comparision

    Why Do We Care About Levels?
    The number of levels tells us the maximum number of comparisons Binary Search performs.

*/

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



    // binary search    ->  new
    public int searchItem() {

         int[] ary = { -101, 101 };

         int taget = 101;

         int len = ary.length;

         if (len == 0){
             return -1;
         }
         if(len == 1 && taget == ary[0]){
             return 0;
         }


        int firstPosition = 0;
        int lastPosition = len - 1;

        while (firstPosition <= lastPosition){

            int middle = (firstPosition + lastPosition) / 2 ;

            if(ary[middle] == taget){
                return middle;
            }

            if (taget > ary[middle]) {
                firstPosition = middle+1;
            }
            if(ary[middle] > taget){
                lastPosition = middle - 1;
            }
        }

        return -1;
    }



}
