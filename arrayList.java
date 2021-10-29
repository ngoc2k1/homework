package com.ngoc.aibles.arrayHanding;

import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Integer[] a = new Integer[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("1. Sum of elements of list: " + findSumOfList(a));
        System.out.println("2. First element of list smaller than 0: " + findFirstMinSmallerThan0(a));
        System.out.println("3. Even elements of list:");
        findEvenElements(a);
        System.out.println();
        System.out.println("4. A new list up 2 times an old list:");
        createANewList(a);
        System.out.println();
    }

    public static int findSumOfList(Integer[] a) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static int findFirstMinSmallerThan0(Integer[] a) {
        for (int i = 0; i < 10; i++) {
            if (a[i] < 0) return a[i];
        }
        return 0;
    }

    public static void findEvenElements(Integer[] a) {
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) System.out.print(a[i] + " ");
        }
    }

    public static void createANewList(Integer[] a) {
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] * 2 + " ");
        }
    }

}
