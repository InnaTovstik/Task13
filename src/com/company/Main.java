package com.company;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    static final int SECONDS_PER_MINUTE = 60;

    public static void main(String[] args) {
        //1.C помощью класса LocalDateTime посчитать сколько дней, часов, минут и секунд
        // проходит между началом лекции во вторник и концом лекции в субботу.
        // (один и тот же промежуток отобразить в днях, часах, минутах и секундах)
        System.out.println("Задание 1 (вариант с ChronoUnit)");
        LocalDateTime startLessonTuesday = LocalDateTime.of(2021, Month.AUGUST, 31, 20, 0);
        LocalDateTime finishLessonSaturday = LocalDateTime.of(2021, Month.SEPTEMBER, 4, 18, 0);

        System.out.println("Между началом лекции во вторник и концом лекции в субботу проходит: ");
        System.out.println(" дней - " + ChronoUnit.DAYS.between(startLessonTuesday, finishLessonSaturday) +
                " часов - , " + ChronoUnit.MINUTES.between(startLessonTuesday, finishLessonSaturday) +
                " минут - , " + ChronoUnit.HOURS.between(startLessonTuesday, finishLessonSaturday) +
                " секунд - " + ChronoUnit.SECONDS.between(startLessonTuesday, finishLessonSaturday));
        System.out.println("Задание 1 (вариант с Duration)");
        // Вариант с Duration для сравнения))))
        System.out.println("Между началом лекции во вторник и концом лекции в субботу проходит: ");
        System.out.println(" дней - " + Duration.between(startLessonTuesday, finishLessonSaturday).toDays() +
                ", часов - " + Duration.between(startLessonTuesday, finishLessonSaturday).toHours() +
                ", минут - " + Duration.between(startLessonTuesday, finishLessonSaturday).toMinutes() +
                ", секунд - " + Duration.between(startLessonTuesday, finishLessonSaturday).toMinutes() * SECONDS_PER_MINUTE);

        // 2.	С помощью класса Duration посчитать количество минут и секунд в лекции
        System.out.println("Задание 2");
        LocalDateTime finishLesson = LocalDateTime.of(2021, Month.AUGUST, 31, 22, 0);
        System.out.println("Количество минут в лекции - " + Duration.between(startLessonTuesday, finishLesson).toMinutes() +
                " и секунд - " + Duration.between(startLessonTuesday, finishLesson).toMinutes() * 60);

        // 3.	С помощью класса DateTimeFormatter парсить строку в формате "1999/Jun/18 07:34:56 PM"
        // (год/аббревиатура месяца/число часы в 12-часовом формате:минута:секунда) в LocalDateTime.
        System.out.println("Задание 3");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/dd hh:mm:ss a");

        String text = "1999/Jun/18 07:34:56 PM";
        LocalDateTime parsedDate = LocalDateTime.parse(text, dtf);
        System.out.println("Строка в формате LocalDateTime: " + dtf.format(parsedDate));

        // 4.	С помощью класса DateTimeFormatter форматировать дату в строку вида "23:56 2001/15/01"
        // (часы:минуты год/месяц/день)
        System.out.println("Задание 4");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm yyyy/dd/MM");
        LocalDateTime dateTime = LocalDateTime.of(2001, Month.JANUARY, 15, 23, 56);
        System.out.println("Дата преобразована в строку : " + dateTime.format(dtf1));

        //5*. Посчитать сколько минут длились весна, лето, осень и зима в 1965 году
        System.out.println("Задание 5");
        LocalDateTime startWinter65 = LocalDateTime.of(1965, Month.JANUARY, 1, 0, 0);
        LocalDateTime startSpring65 = LocalDateTime.of(1965, Month.MARCH, 1, 0, 0);
        LocalDateTime startSummer65 = LocalDateTime.of(1965, Month.JUNE, 1, 0, 0);
        LocalDateTime startAutumn65 = LocalDateTime.of(1965, Month.SEPTEMBER, 1, 0, 0);
        LocalDateTime finishWinter65 = LocalDateTime.of(1965, Month.DECEMBER, 1, 0, 0);
        LocalDateTime startWinter66 = LocalDateTime.of(1966, Month.JANUARY, 1, 0, 0);

        long minutesInWinter = ChronoUnit.MINUTES.between(startWinter65, startSpring65) + ChronoUnit.DAYS.between(finishWinter65, startWinter66);
        long minutesInSpring = ChronoUnit.MINUTES.between(startSpring65, startSummer65);
        long minutesInSummer = ChronoUnit.MINUTES.between(startSummer65, startAutumn65);
        long minutesInAutumn = ChronoUnit.MINUTES.between(startAutumn65, finishWinter65);
        long year65 = minutesInAutumn + minutesInSpring + minutesInWinter + minutesInSummer;
        System.out.println("Зима в 1965 году длилась " + minutesInWinter + " минут");
        System.out.println("Весна в 1965 году длилась " + minutesInSpring + " минут");
        System.out.println("Лето в 1965 году длилось " + minutesInSummer + " минут");
        System.out.println("Осень в 1965 году длилась " + minutesInAutumn + " минут");
        System.out.println("Длина 1965 года " + year65 + " минут");

    }
}
