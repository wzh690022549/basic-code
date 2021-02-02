package com.haohao.demo06.StringBuilder;
/*
    Method Summary:
        StringBuilder append(...): Adds a string representation of any type of data and returns the current object itself.
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        // The append method returns this, the object on which the method was called.
//        StringBuilder bu2 = bu1.append("abc");
//        System.out.println(bu1);
//        System.out.println(bu2);
//        System.out.println(bu1 == bu2);


//        bu1.append("abc");
//        bu1.append(1);
//        bu1.append(true);
//        bu1.append(8.8);
//        bu1.append('中');
//        System.out.println(bu1);

        // Chained programming: The return value of a method is an object against which you can continue to call the method.
        bu1.append("abc").append(1).append(true).append(8.8).append('中');
        System.out.println(bu1);
    }
}
