package com.akakour.lab.util;

/**
 * Decimal conversion
 */
public class DecConv {

    private static char[] array = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
            .toCharArray();

    public static String DeciConvert(int number, int n) {
        // String 是不可变的，每次改变都要新建一个Strng，很浪费时间。
        // StringBuilder是‘可变的String’ ,
        StringBuilder result = new StringBuilder();
        // 模拟计算进制的过程
        while (number > 0) {
            result.insert(0, array[number % n]);
            number /= n;
        }
        return result.toString();
    }
}
