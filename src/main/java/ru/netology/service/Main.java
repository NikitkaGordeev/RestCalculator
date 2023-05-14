package ru.netology.service;

import ru.netology.service.RestServiceCalc;

public class Main {
    public static void main(String[] args) {
        RestServiceCalc service = new RestServiceCalc();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int count = service.calculate(income, expenses, threshold);

    }
}