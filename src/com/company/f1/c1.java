package com.company.f1;

import java.util.*;
import java.util.Random;
import java.util.stream.Collectors;

public class c1 {
    public static void print_deuce(Map<String, List<Integer>> states) {

        List<String> deuce = new ArrayList<>();
        //Выбор двоечников, первый элемент в значении ключа не считаем, потому что это группа
        for (var m : states.keySet()) {
            if (states.get(m).subList(1, states.get(m).size() - 1).contains(2)) {
                deuce.add(m);
            }
        }

        System.out.println("\nДвоечники");
        if (deuce.size() == 0) {
            System.out.println("Двоечников нет");
            return;
        }

        //Печать всех двоечников
        Collections.sort(deuce);
        for (String s : deuce) {
            System.out.println(s + " " + states.get(s));
        }
        System.out.println("\nРандомный двоечник");

        //рандомно выбранный двоечник
        int random_deuce = (int) Math.random() * deuce.size();

        System.out.println(deuce.get(random_deuce) + " " + states.get(deuce.get(random_deuce)));
    }

    //29. Студенты
    public static void main(String[] args) {
        Map<String, List<Integer>> states = new HashMap<>();

        states.put("Akihiko K", Arrays.asList(1, 5, 4, 4, 5));
        states.put("Carmack J", Arrays.asList(3, 5, 4, 3, 5));
        states.put("Kojima H", Arrays.asList(9, 3, 3, 4, 4));
        states.put("Persson М", Arrays.asList(3, 4, 2, 4, 3));

        System.out.println("Студенты");
        //Сортировка всех студентов по имени и вывод
        List<String> names = new ArrayList<>(states.keySet());
        Collections.sort(names);
        for (String s : names) {
            System.out.println(s + " " + states.get(s));
        }

        print_deuce(states);
    }


}

