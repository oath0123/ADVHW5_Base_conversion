package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {    //進制轉換https://vipwealthy.pixnet.net/blog/post/196934235
        Scanner scanner = new Scanner(System.in);
        String temp;
        int inttemp = 0;
        while (true) {
            System.out.println("(1)輸入一個十進位數，將數字轉成二進位，八進位，十六進位");
            temp = scanner.next();
            try {
                inttemp = Integer.parseInt(temp);
            } catch (Exception e) {
                System.out.println("這種類型不能轉成整數");
                return;
            }
            System.out.println("二進位:" + Integer.toBinaryString(inttemp) + "八進位:" + Integer.toOctalString(inttemp) + "十六進位:" + Integer.toHexString(inttemp));
            System.out.println("(2)輸入一個二進位數，將數字轉成十進位，八進位，十六進位");
            temp = scanner.next();
            for (int i = 0; i < temp.length(); i++) {
                if (!temp.substring(i, i + 1).equals("0")) {
                    if (!temp.substring(i, i + 1).equals("1")) {
                        System.out.println("這不是二進制");
                        return;
                    }
                }
            }
            inttemp=Integer.valueOf(temp, 2);
            System.out.println("十進位:" + inttemp + "八進位:" + Integer.toOctalString(Integer.valueOf(temp, 2)) + "十六進位:" + Integer.toHexString(Integer.valueOf(temp, 2)));
            System.out.println("(3)輸入一個十六進位數，將數字轉成二進位，八進位，十進位");
            temp=scanner.next();

            System.out.println("二進位:"+Integer.toBinaryString(Integer.valueOf(temp,16))+"八進位:"+Integer.toOctalString(Integer.valueOf(temp,16))+"十進位:"+Integer.valueOf(temp,16).toString());
        }
    }
}
