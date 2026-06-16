package com.dsaWithJava.dsa.loops_02;

import java.util.ArrayList;
import java.util.HashMap;

public class LogicalPrograms {

    public Boolean isPrimeNumber(int num){
        //  prime ->(exactly two divisor), by 1 and itself. +integer should be prime.

        boolean isPrime = true;
        int i = 2;
        double limit = Math.sqrt(num);

        while(i<=limit){
            if(num%i == 0){
                isPrime = false;
                break;
            }
            i++;
        }

        return isPrime;

        // why 0 is not prime ? -> by mathematical definition, prime numbers must be positive integers greater than 1.
        // Because zero is not greater than 1, it cannot be considered prime.

        // why 1 is not prime ? -> a prime number must have exactly two distinct positive divisors: 1 and itself.
        // Since 1 is only divisible by 1, it has only one divisor, making it a unique category called a unit.

    }

    public ArrayList<Integer> fibonacciSeries(int num){
        // The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.

        // two possible question on fibonacci
        // what is 5th element.
        // list of element inside number.
        // 0 1 1 2 3 5 8 13 21,...


        int firstPointer = 0;
        int secondPointer = 1;

        int nextPointer = 0;

        for (int i = 2; i <= num ; i++) {
            nextPointer = firstPointer + secondPointer;
            firstPointer = secondPointer;
            secondPointer = nextPointer;
        }
        System.out.println(nextPointer);




        ArrayList<Integer> list = new ArrayList<>();


        return list;
    }

    public HashMap<Integer, Integer> countOccurrence(int[] ary){

        // list of occurrence
        // another is like how many 3's of there ?

        int len = ary.length - 1;

        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i<= len; i++){

            boolean isKeyExists = list.containsKey(ary[i]);
            if(isKeyExists){
               int val = list.get(ary[i]);
               list.put(ary[i],val+1);
            }else {
                list.put(ary[i], 1);
            }

        }

        return list;
    }

    public int reverseNum(int num){

        int reverseNum = 0;

        while (0 < num){
            int reminder = num % 10 ;
            num = num / 10 ;
            reverseNum = reverseNum * 10 +  reminder;
        }

        return reverseNum;
    }

    public int calculatorProgram(int num){


        return num;
    }

    public boolean isNumArmStrong(int num){
        // 153 -> cub of every digit in addition.
        // 1^3 + 5^3 + 3^3 = 153

        boolean isArmStrong = false;

        return isArmStrong;
    }


}
