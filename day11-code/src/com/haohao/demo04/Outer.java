package com.haohao.demo04;
/*
If a class is defined inside a method, it is a local inner class.
Local: Only the current method can use it, not outside of that method.

Define the format:
modifier class externalClassName {
    modifier returnValueType externalClassMethodName(parameter list) {
        class localInnerClassName {
            // ...
        }
    }
}

Let's summarize the permission modifier for the class:
public   >    protected    >   (default)   >    private
When defining a class, the permission modifier rule is:
1. External class: public  /  (default)
2. Member inner class: public  /  protected  /  (default)  /  private
3. Local inner class: Nothing can be written.
 */
public class Outer {
    public void methodOuter() {
        class Inner {   // Local inner class.
            int num = 10;
            public void methodInner() {
                System.out.println(num);
            }
        }

        Inner inner = new Inner();
        inner.methodInner();
    }
}
