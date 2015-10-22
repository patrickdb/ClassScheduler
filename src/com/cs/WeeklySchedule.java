package com.cs;

/**
 * Created by 885982 on 22-10-2015.
 */
public class WeeklySchedule implements ISchedule {

    DailySchedule dailySchedule = new DailySchedule();
    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int GetNumberOfFreeDaysInSchedule() {
        return 5;
    }

    @Override
    public DailySchedule getDaySchedule(int i) {
        return dailySchedule;
    }
}
