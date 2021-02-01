package com.haohao.demo01.Object;

public class Demo02Equals {
    public static void main(String[] args) {
        /*
        public boolean equals(Object obj) {
            return (this == obj);
        }
         */
        Person p1 = new Person("Di", 18);
        Person p2 = new Person("Di", 18);
//        Person p2 = new Person("Gu", 18);
//        p1 = p2;
        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);


        boolean b = p1.equals(p2);
        System.out.println(b);
    }
}
