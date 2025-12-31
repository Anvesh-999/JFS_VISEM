package com.su2;

import java.util.Scanner;
import java.util.Arrays;

public class App {

    public static void printPrime(int start, int end) {
        if (end < 2) return;

        boolean[] arr = new boolean[end + 1];
        Arrays.fill(arr, true);

        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i * i <= end; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= end; j += i) {
                    arr[j] = false;
                }
            }
        }

        for (int i = Math.max(start, 2); i <= end; i++) {
            if (arr[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    if (n == 2) {
        return true;
    }
    if (n % 2 == 0) {
        return false;
    }

    for (int i = 3; i * i <= n; i += 2) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a starting number:");
        int start = sc.nextInt();

        System.out.println("Enter an ending number:");
        int end = sc.nextInt();

        printPrime(start, end);

        sc.close();
    }
}
