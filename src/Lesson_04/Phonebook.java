package Lesson_04;

import java.util.*;

class Phonebook {
    private Map<String, HashSet<String>> map = new HashMap<>();

    void addContact(String lastName, String number) {
        HashSet<String> numbers;

        if (map.containsKey(lastName)) {
            numbers = map.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(number);
        map.put(lastName, numbers);
    }

    Set<String> getMap(String lastName) {
        return map.get(lastName);
    }
}