package com.dsaWithJava.dsa.linear_binary_search_05;

/* Time Complexity

    Basic Amount of time taken to perform operation.

    Time Complexity is a measure of how the execution time of an algorithm grows as the input size (n) increases.

    How The time grows as your input grows.
 */

import java.util.ArrayList;

public class LinearSearch {

    public void linearSearch(){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(14);
        list.add(324);
        list.add(54);
        list.add(4);

        System.out.println(list);

        System.out.println(getIndexOfElement(list, 100));
    }

    public int getIndexOfElement(ArrayList<Integer> list, int target){
        int len = list.size();

        if(len <= 0){
            return Integer.MAX_VALUE;
        }

        for (int j = 0; j <= len-1; j++){
            if(list.get(j).equals(target)){
                System.out.println(j);
                return j;
            }
        }

        return Integer.MAX_VALUE;
    }

}
