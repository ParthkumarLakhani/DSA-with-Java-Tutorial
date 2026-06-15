package com.dsaWithJava.dsa.passby_val_ref_03;

//primitive type
public class Greeting {

    public String greet(String str){
        str = "Please Accept The Greeting";
        return str;
    }

    public void swap(int num1 , int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
    }

}


/*  Java is strictly pass-by-value.

    1. Primitive Types (int, double, boolean, etc.)
        When you pass a primitive type, the actual value itself is copied into a new local variable inside the method.
        Modifying the parameter inside the method has no effect on the original variable outside.


    2. Object Types (Reference Types)
        When you pass an object, Java does not pass the physical object itself.
        Instead, it passes the value of the reference (the memory address) pointing to that object.

        Because both the caller's variable and the method's parameter hold copies of the same memory address, they point to the exact same object in memory.
        You can mutate (change fields of) the object, and the changes will be visible outside.
        You cannot reassign the pointer to make the original variable point to a new object.

 */