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
        boolean test = true;
        if (pBook.containsValue(phone))
            if (phone.charAt(0) == '+') {
                if (!(phone.length() == 12)) {
                    test = false;
                }
            } else if (phone.length() > 12 || phone.length() < 10) {
                test = false;
            }
        if (phone.charAt(0) == '8') {
            if (!(phone.length() == 11)) {
                test = false;
            }
        } else if (phone.length() > 12 || phone.length() < 10) {
            test = false;
        }
        if (name.length() <= 1 | name.length() > 10) {
            test = false;
        }
        if (pBook.containsKey(phone)) {
            test = false;
        }
        if (test) {
            pBook.put(phone, name);
        }
        return pBook.size();
    }

    public String findByNumber(String phone) {
         return pBook.get(phone);
    }

    public String findByName(){
        return null;
    }
}
