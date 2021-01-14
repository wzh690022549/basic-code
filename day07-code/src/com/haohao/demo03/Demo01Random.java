package com.haohao.demo03;

import java.util.Random;

/*
Random类用来生成随机数字。使用起来也是三个步骤：

1.导包
import java.util.Random;

2.创建
Random random = new Random(); //小括号留空即可

3.使用
获取一个随机的int数字(范围是int所有范围，有正负两种)：int num = random.nextInt();
获取一个随机的int数字(参数代表了范围，左闭右开区间)：int num = random.nextInt(3);
实际上代表的含义是：[0, 3)，也就是0~2
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random random = new Random();

        int num = random.nextInt();
        System.out.println("随机数是：" + num);
    }
}
