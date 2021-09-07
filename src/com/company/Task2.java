package com.company;

import java.time.Duration;
import java.time.LocalDateTime;

public class Task2 {

   public static void findMinutesInLesson(LocalDateTime startLessonTuesday, LocalDateTime finishLesson){
        // 2.	С помощью класса Duration посчитать количество минут и секунд в лекции
        System.out.println("Задание 2");
        System.out.println("Количество минут в лекции - " +
                Duration.between(startLessonTuesday, finishLesson).toMinutes()
                + " и секунд - " + Duration.between(startLessonTuesday, finishLesson).toMinutes() * 60);

    }
}
