package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static PhoneBook INSTANCE;
    private final Map<String, String> pBook = new HashMap<>();

    public PhoneBook() {
    }

    public static PhoneBook getInstance() {
        if (INSTANCE == null) {
            synchronized (PhoneBook.class) {
                if (INSTANCE == null) {
                    INSTANCE = new PhoneBook();
                }
            }
        }
        return INSTANCE;
    }

    public int add(String phone,String name) {

        return 0;
    }

}
