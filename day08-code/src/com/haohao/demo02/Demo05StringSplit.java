package com.haohao.demo02;
/*
分割字符串的方法：
public String[] split(String regex):按照参数的规则，将字符串切分成若干个部分。

注意事项：
split方法的参数其实是一个正则表达式
如果按照  .  进行切分，必须写成  \\.
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (String s : array1) {
            System.out.println(s);
        }
        System.out.println("=================");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (String s : array2) {
            System.out.println(s);
        }
        System.out.println("=================");

        String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split("\\.");
        System.out.println(array3.length);
        for (String s : array3) {
            System.out.println(s);
        }
    }
}
