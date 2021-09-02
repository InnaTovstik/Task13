package com.company;

//5*. Посчитать сколько минут длились весна, лето, осень и зима в 1965 году

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

        LocalDateTime startLessonTuesday = LocalDateTime.of(2021, Month.AUGUST, 31, 20, 0);
        LocalDateTime finishLessonSaturday = LocalDateTime.of(2021, Month.SEPTEMBER, 4, 18, 0);

        System.out.println("Между началом лекции во вторник и концом лекции в субботу проходит: ");
        System.out.println(" дней - " + ChronoUnit.DAYS.between(startLessonTuesday, finishLessonSaturday) +
                " часов - , " + ChronoUnit.MINUTES.between(startLessonTuesday, finishLessonSaturday) +
                " минут - , " + ChronoUnit.HOURS.between(startLessonTuesday, finishLessonSaturday) +
                " секунд - " + ChronoUnit.SECONDS.between(startLessonTuesday, finishLessonSaturday));

        // Вариант с Duration для сравнения))))
        System.out.println("Между началом лекции во вторник и концом лекции в субботу проходит: ");
        System.out.println(" дней - " + Duration.between(startLessonTuesday, finishLessonSaturday).toDays() +
                ", часов - " + Duration.between(startLessonTuesday, finishLessonSaturday).toHours() +
                ", минут - " + Duration.between(startLessonTuesday, finishLessonSaturday).toMinutes() +
                ", секунд - " + Duration.between(startLessonTuesday, finishLessonSaturday).toMinutes() * SECONDS_PER_MINUTE);

        // 2.	С помощью класса Duration посчитать количество минут и секунд в лекции

        LocalDateTime finishLesson = LocalDateTime.of(2021, Month.AUGUST, 31, 22, 0);
        System.out.println("Количество минут в лекции - " + Duration.between(startLessonTuesday, finishLesson).toMinutes() +
                " и секунд - " + Duration.between(startLessonTuesday, finishLesson).toMinutes() * 60);

        // 3.	С помощью класса DateTimeFormatter парсить строку в формате "1999/Jun/18 07:34:56 PM"
        // (год/аббревиатура месяца/число часы в 12-часовом формате:минута:секунда) в LocalDateTime.

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/dd hh:mm:ss a");

        String text = "1999/Jun/18 07:34:56 PM";
        LocalDateTime parsedDate = LocalDateTime.parse(text, dtf);
        System.out.println("Строка в формате LocalDateTime: " + dtf.format(parsedDate));

        // 4.	С помощью класса DateTimeFormatter форматировать дату в строку вида "23:56 2001/15/01"
        // (часы:минуты год/месяц/день)

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm yyyy/dd/MM");
        LocalDateTime dateTime = LocalDateTime.of(2001, Month.JANUARY, 15, 23, 56);
        System.out.println("Дата преобразована в строку : " + dateTime.format(dtf1));

    }
}
