package com.haohao.demo04;
/*
Local inner class, if you want to access a local variable of the method, the local variable must be final or effectively final.

Note: Starting with Java 8+, the final keyword can be omitted as long as the local variable fact remains unchanged.

The reason:
1. The new object is in the heap.
2. Local variables follow methods, in the stack memory.
3. When the method is finished, the local variable will disappear immediately.
4. But the new object will continue to exist in the heap until the garbage collection disappears.
 */
public class MyOuter {
    public void methodOuter() {
        int num = 10;   // Local variable of the method.
//        num = 20;
        class MyInner {
            public void methodInner() {
                System.out.println(num);
            }
        }
    }
}
