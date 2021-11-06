package com.ngoc.java8;

import java.util.List;
import java.util.stream.Collectors;

public class ListUsingStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(-1, -2, 0, 1, 2, 3, 4, 5, 6, 7);

        System.out.println("1. Sum of elements of list:");
        System.out.println(list.stream().mapToInt(d->d).sum());

        System.out.println("2. First element of list is smaller than 0:");
        list.stream().filter(d -> d < 0).limit(1).forEach(System.out::println);

        System.out.println("3. Even elements of list:");
        System.out.println(list.stream().filter(d -> d % 2 == 0).collect(Collectors.toList()));

        System.out.println("4. A new list up 2 times an old list: ");
        list.stream().forEach(d -> System.out.print(d * 2 + " "));
    }
}
