package com.haohao.demo04;

import java.util.Arrays;

/*
java.util.Arrays is an array-related utility class that provides a number of static methods to perform common array operations.

public static String toString(array): Change the parameter array to a string ( default format: [element 1, element 2, element 3, ...])
public static void sort(array): Sorts the elements of an array in the default ascending order, from smallest to largest.

Remark:
    1. Sort defaults from smallest to largest in ascending order for numeric values.
    2. If it is a string, sort defaults to alphabetical ascending order.
    3. If the class is a custom type, then the custom class needs to have support for the Comparable or Comparator interface.
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        // Changes the int array to string in the default format.
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);// [10, 20, 30]

        int[] array1 = {2, 1, 3, 10, 6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"bbb", "aaa", "ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
