package com.example.coding.backjoon;

import java.util.Scanner;

public class P1546 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++) {
            A[i] = s.nextInt();
        }
        long max = 0;
        long sum = 0;
        for(int i=0;i<N;i++) {
            if (max < A[i]) max = A[i];
            sum = sum + A[i];
        }
        System.out.println(sum * 100.0 / max / N);
    }
}
