package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task3 {
    public static void parseString(String text) {
        // 3.	С помощью класса DateTimeFormatter парсить строку в формате "1999/Jun/18 07:34:56 PM"
        // (год/аббревиатура месяца/число часы в 12-часовом формате:минута:секунда) в LocalDateTime.
        System.out.println("Задание 3");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/dd hh:mm:ss a");
        LocalDateTime parsedDate = LocalDateTime.parse(text, dtf);
        System.out.println("Строка в формате LocalDateTime: " + dtf.format(parsedDate));
    }
}
