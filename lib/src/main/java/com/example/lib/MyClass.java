package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {    //�i���ഫhttps://vipwealthy.pixnet.net/blog/post/196934235
        Scanner scanner = new Scanner(System.in);
        String temp;
        int inttemp = 0;
        while (true) {
            System.out.println("(1)��J�@�ӤQ�i��ơA�N�Ʀr�ন�G�i��A�K�i��A�Q���i��");
            temp = scanner.next();
            try {
                inttemp = Integer.parseInt(temp);
            } catch (Exception e) {
                System.out.println("�o�����������ন���");
                return;
            }
            System.out.println("�G�i��:" + Integer.toBinaryString(inttemp) + "�K�i��:" + Integer.toOctalString(inttemp) + "�Q���i��:" + Integer.toHexString(inttemp));
            System.out.println("(2)��J�@�ӤG�i��ơA�N�Ʀr�ন�Q�i��A�K�i��A�Q���i��");
            temp = scanner.next();
            for (int i = 0; i < temp.length(); i++) {
                if (!temp.substring(i, i + 1).equals("0")) {
                    if (!temp.substring(i, i + 1).equals("1")) {
                        System.out.println("�o���O�G�i��");
                        return;
                    }
                }
            }
            inttemp=Integer.valueOf(temp, 2);
            System.out.println("�Q�i��:" + inttemp + "�K�i��:" + Integer.toOctalString(Integer.valueOf(temp, 2)) + "�Q���i��:" + Integer.toHexString(Integer.valueOf(temp, 2)));
            System.out.println("(3)��J�@�ӤQ���i��ơA�N�Ʀr�ন�G�i��A�K�i��A�Q�i��");
            temp=scanner.next();

            System.out.println("�G�i��:"+Integer.toBinaryString(Integer.valueOf(temp,16))+"�K�i��:"+Integer.toOctalString(Integer.valueOf(temp,16))+"�Q�i��:"+Integer.valueOf(temp,16).toString());
        }
    }
}
