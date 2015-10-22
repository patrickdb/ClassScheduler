package com.cs;

/**
 * Created by 885982 on 22-10-2015.
 */
public class DailySchedule {
    private int max_daily_blocks;
    private ScheduleItem [] scheduleBlocks = null;

    public DailySchedule()
    {
        max_daily_blocks = 2;
        scheduleBlocks = new ScheduleItem[max_daily_blocks];
        scheduleBlocks[0]=new ScheduleItem();
        scheduleBlocks[1]=new ScheduleItem();
    }

    public ScheduleItem GetScheduleItems(int block) {
        if (block < max_daily_blocks)
        {
            return scheduleBlocks[block];
        }
        else
        {
            return null;
        }
    }

    public int getNumberOfFreeScheduleItems() {
        return 2;
    }
}
