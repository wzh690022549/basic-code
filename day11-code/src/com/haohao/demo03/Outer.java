package com.haohao.demo03;

// If the same name occurs, the format is: externalClassName.this.externalMemberVariableName
public class Outer {
    int num = 10;   // External class member variable.
    public class Inner {
        int num = 20;   // Inner class member variable.
        public void methodInner() {
            int num = 30;   // Inner class local variable.
            System.out.println(num);// Inner class local variable.
            System.out.println(this.num);// Inner class member variable.
            System.out.println(Outer.this.num);// External class member variable.
        }
    }
}
