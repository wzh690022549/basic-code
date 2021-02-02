package com.haohao.demo06.StringBuilder;

/*
    StringBuilder and String can be converted to each other.
        StringBuilder(String)
        public String toString()
 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("str:" + str);
        StringBuilder bu = new StringBuilder(str);
        bu.append(" world");
        System.out.println("bu:" + bu);

        String s = bu.toString();
        System.out.println("s" + s);
    }
}
