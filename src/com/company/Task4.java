package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task4 {

    public static void formatData(LocalDateTime dateTime) {

        // 4.	С помощью класса DateTimeFormatter форматировать дату в строку вида "23:56 2001/15/01"
        // (часы:минуты год/месяц/день)
        System.out.println("Задание 4");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm yyyy/MM/dd");
        System.out.println("Дата преобразована в строку : " + dateTime.format(dtf1));
    }
}
