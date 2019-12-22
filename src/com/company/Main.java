package com.company;

import java.util.*;
import java.util.stream.IntStream;

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
        list3.add(0, list1.get(0));
        list3.add(1, list2.get(4));
        list3.add(2, list1.get(1));
        list3.add(3, list2.get(3));
        list3.add(4, list1.get(2));
        list3.add(5, list2.get(2));
        list3.add(6, list1.get(3));
        list3.add(7, list2.get(1));
        list3.add(8, list1.get(4));
        list3.add(9, list2.get(0));
        System.out.println("\n Итак в списке C:");
        ListIterator listIterator = list3.listIterator();
        while (listIterator.hasNext()) {
            Object num = listIterator.next();
            System.out.print(num + ",");
        }

        Collections.sort(list3);
        System.out.println("\n Конечный список C");
        listIterator = list3.listIterator();
        while (listIterator.hasNext()) {
            Object num = listIterator.next();
            System.out.print(num + ",");
        }
    }
}
