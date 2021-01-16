package com.haohao.demo02;

import java.util.Scanner;

/*
Title：Keyboard input a string, and statistics of the number of various characters.
Types are: capital letters, lowercase letters, numbers, others

Thinking:
1.Since keyboard input is used, it must be Scanner
2.The keyboard input is String, then: String str = scanner.next();
3.Define four variables to represent the times of occurrence of each character.
4.You need to check a String one word at a time, you can convert the String to a char array using toCharArray()
5.Traverse the character array to determine the type of the current character, and use four variables to increment.
6.Print out four variables, representing the occurrence times of four characters respectively.
 */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String input = scanner.next();  //Gets the string input by the keyboard.

        int countUpper = 0, countLower = 0, countNumber = 0, countOther = 0;

        char[] charArray = input.toCharArray();
        for (char c : charArray) {  //c --> The current character.
            if ('A' <= c && c <= 'Z'){
                countUpper++;
            } else if ('a' <= c && c <= 'z'){
                countLower++;
            } else if ('0' <= c && c <= '9'){
                countNumber++;
            } else {
                countOther++;
            }
        }

        System.out.println("The capital letters are:" + countUpper);
        System.out.println("The lowercase letters are:" + countLower);
        System.out.println("The numbers are:" + countNumber);
        System.out.println("Others are:" + countOther);
    }
}
