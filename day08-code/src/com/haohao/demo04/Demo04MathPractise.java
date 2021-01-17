package com.haohao.demo04;
/*
Topic:
How many integers with absolute value greater than 6 or less than 2.1 are calculated between -10.8 and 5.9?

Analysis:
1. Now that the scope has been determined, so use the for loop.
2. The starting position of -10.8 should be converted to -10, use Math.ceil or strong int.
3. Use Math.abs to get the absolute value.
4. Once a number is found, you need to tell the counter++.
 */
public class Demo04MathPractise {
    public static void main(String[] args) {
        double min = -10.8, max = 5.9;
        int count = 0;
        for (int i = (int)min; i < max; i++){
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Count:" + count);
    }
}
