package com.company;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        LocalDateTime startLessonTuesday = LocalDateTime.of(2021, Month.AUGUST, 31, 20, 0);
        LocalDateTime finishLessonSaturday = LocalDateTime.of(2021, Month.SEPTEMBER, 4, 18, 0);
        LocalDateTime finishLesson = LocalDateTime.of(2021, Month.AUGUST, 31, 22, 0);
        String dateInString = "1999/Jun/18 07:34:56 PM";
        LocalDateTime dateTime = LocalDateTime.of(2001, Month.JANUARY, 15, 23, 56);

        Task1.findDurationLesson(startLessonTuesday, finishLessonSaturday);
        Task2.findMinutesInLesson(startLessonTuesday, finishLesson);
        Task3.parseString(dateInString);
        Task4.formatData(dateTime);
        Task5.findDurationSeason(1965);
    }
}
