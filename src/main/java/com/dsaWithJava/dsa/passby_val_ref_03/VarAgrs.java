package com.dsaWithJava.dsa.passby_val_ref_03;

import java.util.Arrays;

public class VarAgrs {

    public void varArgs(int ...ary){
        System.out.println(Arrays.toString(ary));
    }

    //variable length arg always at the end
    public void multipleVarArgs(int a, int b, String ...ary){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(ary));
    }

}
