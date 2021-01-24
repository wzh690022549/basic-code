package com.haohao.demo03;
/*
Classification:
1. Member inner class.
2. Local inner class (including anonymous inner class).

Member inner class definition format:
modifier class externalClassName {
    modifier class innerClassName {
        // ...
    }
    // ...
}

Note: Inner use, free access; For external use, inner class object are required.

=================================================
How do I use member inner classes?
There are two ways:
1. Indirect mode: use inner class among methods of outer class; Then main simply calls the methods of the external class.
2. Direct mode, formula:
    externalClassName.innerClassName objectName = new externalClassName().new innerClassName();
 */
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body(); // External class object.
        // An object of the external class is used to call a method of the external class, which is indirectly using the inner class Heart.
        body.methodBody();
        System.out.println("==================");

        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
