package com.dsaWithJava.dsa.passby_val_ref_03;

public class Scopes {

    public void scope(){
        int a = 10;
        {
            a = 100;
            System.out.println(a);

            int b = 20;
            System.out.println(b);
        }
        a = 200;
        System.out.println(a);

    }

}
