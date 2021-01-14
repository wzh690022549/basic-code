package com.haohao.demo02;

/*
定义方法的完整格式：
修饰符 返回值类型 方法名称（参数类型 参数名称，...）{
    方法体
    return 返回值；
}
*/
public class Demo02MethodDefine {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

}
