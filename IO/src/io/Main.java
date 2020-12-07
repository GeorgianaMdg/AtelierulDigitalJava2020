package io;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook =  new PhoneBook("./src/io/input.txt");
        System.out.println(phoneBook);
        System.out.println(phoneBook.getByName("Abdul"));
    }
}
