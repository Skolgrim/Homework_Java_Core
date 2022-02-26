package Lesson_04;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        String[] array = {"nikon", "canon", "sony", "canon", "Nikon", "panasonic", "sony", "fujifilm", "sony"};


        Set<String> set = new HashSet<>(Arrays.asList(array));
        System.out.println(set);
        System.out.println("------------------------------------");


        Map<String, Integer> map = new HashMap<>();
        for (String word : array) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("------------------------------------");


        Phonebook phonebook = new Phonebook();

        phonebook.addContact("Петров", "88001000000");
        phonebook.addContact("Иванов", "88002000000");
        phonebook.addContact("Сидоров", "88004000000");
        phonebook.addContact("Сидоров", "88005000000");

        System.out.println("Петров: " + phonebook.getMap("Петров"));
        System.out.println("Иванов: " + phonebook.getMap("Иванов"));
        System.out.println("Сидоров1: " + phonebook.getMap("Сидоров"));
        System.out.println("Сидоров2: " + phonebook.getMap("Сидоров"));
    }
}
