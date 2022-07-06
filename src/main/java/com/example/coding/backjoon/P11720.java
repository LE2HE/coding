package com.example.coding.backjoon;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String sNum = s.next();
        char[] cNum = sNum.toCharArray();

        int sum = 0;
        for (int i=0;i<cNum.length;i++) {
            sum += cNum[i] -'0';
        }
        System.out.println(sum);
    }
}