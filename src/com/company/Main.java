package com.company;

public class Main {

    public static void main(String[] args) {
        long result = 1l;
        long number = 1l;
        do {
            result = result * number;
            ++number;
        } while (number >= 1 && number <= 25);
        System.out.println("Произведение чисел от 1 до 25 = " + result);
    }
}
