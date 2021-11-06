package com.ngoc.java8;

import java.util.Scanner;

public class ListExam {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("1. Sum of elements of list: " + findSumOfList(arr));
        System.out.println("2. First element of list is smaller than 0: " + findFirstMinSmallerThan0(arr));
        System.out.print("3. Even elements of list:");
        findEvenElements(arr);
        System.out.println();
        System.out.print("4. A new list up 2 times an old list:");
        createANewList(arr);
        System.out.println();
    }

    public static int findSumOfList(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int findFirstMinSmallerThan0(int[] arr) {
        for (int i = 0; i < 10; i++) {
            if (arr[i] < 0) return arr[i];
        }
        return 0;
    }

    public static void findEvenElements(int[] arr) {
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) System.out.print(arr[i] + " ");
        }
    }

    public static void createANewList(int[] a) {
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] * 2 + " ");
        }
    }
}
