package com.haohao.demo05;

import java.util.ArrayList;

/*
题目：
打印ArrayList。格式参照{元素@元素@元素@元素}
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("宋远桥");
        list.add("张无忌");
        list.add("张翠山");
        System.out.println(list);
        printArrayList(list);
    }
    /*
    定义方法三要素：
    返回值类型：只是进行打印而已，没有运算，没有结果；所以用void
    方法名称：printArrayList
    参数列表：ArrayList<String>
     */
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + "@");
        }
        System.out.println(list.get(list.size() - 1) + "}");
    }
}
