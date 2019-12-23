package com.company;

import java.util.*;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        int number1 = 0;
        System.out.println("Введите строки для списка А: ");
        while (number1 < 5) {
            list1.add(scan.nextLine());
            number1++;
        }
        System.out.println("Итак в списке А:");
        Iterator iter1 = list1.iterator();
        while (iter1.hasNext()) {
            Object num = iter1.next();
            System.out.print(num + ", ");
        }

        int number2 = 0;
        System.out.println("\n Введите строки для списка Б: ");
        while (number2 < 5) {
            list2.add(scan.nextLine());
            number2++;
        }
        System.out.println("Итак в списке Б:");
        Iterator iter2 = list2.iterator();
        while (iter2.hasNext()) {
            Object num = iter2.next();
            System.out.print(num + ", ");
        }
        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(list1);
        Collections.sort(list2);
        Collections.reverse(list2);
        list3.add(1, list2.get(0));
        list3.add(3, list2.get(1));
        list3.add(5, list2.get(2));
        list3.add(7, list2.get(3));
        list3.add(9, list2.get(4));

        System.out.println("\n Итак в списке C:");
        ListIterator listIterator = list3.listIterator();
        while (listIterator.hasNext()) {
            Object num = listIterator.next();
            System.out.print(num + ",");
        }

        Comparator<String> byLength = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
        Collections.sort(list3);
        System.out.println("\n Конечный список C");
        listIterator = list3.listIterator();
        while (listIterator.hasNext()) {
            Object num = listIterator.next();
            System.out.print(num + ",");
        }
    }
}
