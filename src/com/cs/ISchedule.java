package com.cs;

/**
 * Created by 885982 on 22-10-2015.
 */
public interface ISchedule {
    boolean isEmpty();

    int GetNumberOfFreeDaysInSchedule();

    DailySchedule getDaySchedule(int i);
}
