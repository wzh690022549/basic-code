package com.haohao.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
java.util.Iterator<E>
    Interface Iterator<E>: An iterator over a collection.

    Method Summary:
        boolean	hasNext()	Returns true if the iteration has more elements.
        E	next()	Returns the next element in the iteration.

    Iterator is an interface, we can't ues it directly, an implementation class object that uses the Iterator interface is required.
    There is a method in the Collection interface, called iterator(), which returns an implementation class object that uses the Iterator interface.
        Iterator<E> iterator()

    The steps to use iterator:
        1. Use the iterator() method in the Collection to get the implementation class object of the iterator. Use the iterator interface to receive(polymorphic).
        2. Use the method hasNext() in the Iterator interface to determine if there is another element.
        3. Use the method next() in the Iterator interface to fetch the next element in the Collection.
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("A");
        coll.add("B");
        coll.add("C");
        coll.add("D");
        coll.add("E");

        Iterator<String> it = coll.iterator();

//        boolean b = it.hasNext();
//        System.out.println(b);
//
//        String s = it.next();
//        System.out.println(s);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
