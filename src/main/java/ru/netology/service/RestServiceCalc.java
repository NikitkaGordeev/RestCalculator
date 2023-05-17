package ru.netology.service;

public class RestServiceCalc {
    public int calculate(int income, int expense, int threshold) {
        //income - заработал
        //expense - потратил
        //threshold - осталось
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expense) / 3;
            } else {
                money = money + income - expense;

            }
        }
        System.out.println("Итого, за год, можно отдохнуть " + count + " раза (месяца)");
        return count;
    }
}