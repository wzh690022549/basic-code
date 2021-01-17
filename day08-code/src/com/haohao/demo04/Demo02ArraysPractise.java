package com.haohao.demo04;

import java.util.Arrays;

/*
Topic:
Use the Arrays API to sort all the characters in a random string in ascending order and print them in reverse order.
 */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "ashdfghsfsd456fsASFDAS1s5d6af4";

        // Sort them in ascending order.
        // Use toCharArray method to change the string to a char array, then sort it use Arrays.sort method.
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // Sort the array of characters in ascending order.

        // Reverse traversal.
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
