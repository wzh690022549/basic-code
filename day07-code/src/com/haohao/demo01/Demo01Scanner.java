package com.haohao.demo01;

import java.util.Scanner;//1.导包

/*
引用类型的一般使用步骤：
1.导包
import包路径.类名称；
如果需要使用人目标类，和当前类位于同一个包下，则可以省略导包语句不写。
只有java.lang包下的内容不需要导包，其他的包都需要import语句。

2.创建
类名称 对象名 = new 类名称（）；

3.使用
对象名.成员方法名（）

获取键盘输入的一个int数字：int num = scanner.nextInt();
获取键盘输入的一个字符串：String str = scanner.next();
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //2.创建
        //备注：System.in代表从键盘进行输入
        Scanner scanner = new Scanner(System.in);
        //3.获取键盘输入的int数字
        int num = scanner.nextInt();
        System.out.println("输入的int数字是：" + num);
        //4.获取键盘输入的字符串
        String str = scanner.next();
        System.out.println("输入的字符串是：" + str);
    }
}
