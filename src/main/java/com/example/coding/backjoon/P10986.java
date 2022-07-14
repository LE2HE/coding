package com.example.coding.backjoon;

import java.util.Scanner;

public class P10986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] sum = new long[N];
        long[] num = new long[M];
        long count = 0;
        sum[0] = sc.nextInt();
        for (int i=1;i<N;i++) {
            sum[i] = sum[i-1] + sc.nextInt();
        }
        for(int i=0;i<N;i++) {
            int x = (int) (sum[i] % M);
            if (x == 0) count++;
            num[x]++;
        }
        for (int i=0;i<M;i++) {
            if (num[i] > 1) {
                count = count + (num[i] * (num[i] -1) / 2);
            }
        }
        System.out.println(count);
    }
}
