package com.company;
//1.C помощью класса LocalDateTime посчитать сколько дней, часов, минут и секунд
// проходит между началом лекции во вторник и концом лекции в субботу.
// (один и тот же промежуток отобразить в днях, часах, минутах и секундах)

import java.time.Duration;
import java.time.LocalDateTime;
import static java.time.temporal.ChronoUnit.*;
import static java.time.temporal.ChronoUnit.SECONDS;

public class Task1 {
    static final int SECONDS_PER_MINUTE = 60;

    public static void findDurationLesson(LocalDateTime startLessonTuesday, LocalDateTime finishLessonSaturday) {

        System.out.println("Задание 1 (вариант с ChronoUnit)");
        System.out.println("Между началом лекции во вторник и концом лекции в субботу проходит: ");
        System.out.println(" дней - "
                + DAYS.between(startLessonTuesday, finishLessonSaturday) +
                ", часов - "
                + MINUTES.between(startLessonTuesday, finishLessonSaturday) +
                ", минут - "
                + HOURS.between(startLessonTuesday, finishLessonSaturday) +
                ", секунд - "
                + SECONDS.between(startLessonTuesday, finishLessonSaturday));
        System.out.println("Задание 1 (вариант с Duration)");

        // Вариант с Duration для сравнения))))
        System.out.println("Между началом лекции во вторник и концом лекции в субботу проходит: ");
        System.out.println(" дней - "
                + Duration.between(startLessonTuesday, finishLessonSaturday)
                .toDays() +
                ", часов - "
                + Duration.between(startLessonTuesday, finishLessonSaturday)
                .toHours() +
                ", минут - "
                + Duration.between(startLessonTuesday, finishLessonSaturday)
                .toMinutes() +
                ", секунд - "
                + Duration.between(startLessonTuesday, finishLessonSaturday)
                .toMinutes() * SECONDS_PER_MINUTE);
    }
}