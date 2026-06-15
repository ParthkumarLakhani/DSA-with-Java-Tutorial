package com.dsaWithJava.dsa.passby_val_ref_03;

public class Shadow {

    static int x = 1;

    public void shadowing(){
        System.out.println(x);

//        int x;    // scope will begin when value is initialized
//        System.out.println(x);

        int x = 50;
        System.out.println(x);



        fun();
    }

    //lower level is overriding the upper level. so higher level is shadowed.

    public void fun(){
        System.out.println(x);
    }
}
