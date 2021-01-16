package com.haohao.demo02;

/*
Topic:
Define a method to concatenate an array(1, 2, 3) into a string in the specified format.
The format is as follows: [word1#word2#word3].

Analysis:
1.First prepare an int array:1, 2, 3
2.Define a method for converting arrays to strings
The three elements:
    Return value type: String
    Method name: fromArrayToString
    Parameter list: int[]
3.Format: [word1#word2#word3]
Use:for loops, string concatenation, word before each array element, # for delimiters, and to see if it's the last one
4.Call the method, get the return value, and print the result string
 */
public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        String result = fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < (array.length - 1); i++) {
            str = str.concat("word" + array[i] + "#");
        }
        return str.concat("word" + array[array.length - 1] + "]");
    }
}
