package com.haohao.demo01;

/*
The final keyword stands for final, immutable.

Four common uses:
    1. Can be used to modify a class.
    2. Can be used to modify a method.
    3. Can also used to modify a local variable.
    4. Can also used to modify a member variable.
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        // Once final is used to modify a local variable, that variable cannot be changed.
        // Once assigned, never changed.
        final int num2 = 200;
        System.out.println(num2);

//        num2 = 250;
//        num2 = 200;

        // As long as there is guaranteed to be a unique assignment.
        final int num3;
        num3 = 30;

        // For a primitive type, immutability means that the data in a variable is immutable.
        // For reference types, immutability means that the address value in a variable cannot be changed.
        Student stu1 = new Student("ZhaoLiYing");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1 = new Student("HuoJianHua");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        System.out.println("========================");

        final Student stu2 = new Student("GaoYuanYuan");
        System.out.println(stu2.getName());
        // Wrong writing! Final reference type variable where the address cannot be changed.
//        stu2 = new Student("ZhaoYouTing");
        stu2.setName("GaoYuanYuanYuanYuanYuanYuan");
        System.out.println(stu2.getName());
    }
}
