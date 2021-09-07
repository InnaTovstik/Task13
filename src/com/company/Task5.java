package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Task5 {
    public static void findDurationSeason(int year) {
        System.out.println("Задание 5");

        long minutesInWinter = ChronoUnit.MINUTES
                .between(findStartSeason(1965, "winter"),
                        findStartSeason(1965, "spring"))
                + ChronoUnit.DAYS
                .between(findStartSeason(1965, "end year"),
                        findStartSeason(1966, "winter"));
        long minutesInSpring = ChronoUnit.MINUTES
                .between(findStartSeason(1965, "spring"),
                        findStartSeason(1965, "summer"));
        long minutesInSummer = ChronoUnit.MINUTES
                .between(findStartSeason(1965, "summer"),
                        findStartSeason(1965, "autumn"));
        long minutesInAutumn = ChronoUnit.MINUTES
                .between(findStartSeason(1965, "autumn"),
                        findStartSeason(1965, "end year"));

        System.out.println("Зима в 1965 году длилась " + minutesInWinter + " минут");
        System.out.println("Весна в 1965 году длилась " + minutesInSpring + " минут");
        System.out.println("Лето в 1965 году длилось " + minutesInSummer + " минут");
        System.out.println("Осень в 1965 году длилась " + minutesInAutumn + " минут");

    }

    public static LocalDateTime findStartSeason(int year, String season) {
        switch (season) {
            case "winter":
                return LocalDateTime.of(year, 1, 1, 0, 0);
            case "spring":
                return LocalDateTime.of(year, 3, 1, 0, 0);
            case "summer":
                return LocalDateTime.of(year, 6, 1, 0, 0);
            case "autumn":
                return LocalDateTime.of(year, 9, 1, 0, 0);
            case "end year":
                return LocalDateTime.of(year, 12, 1, 0, 0);
        }
        return null;
    }

}
