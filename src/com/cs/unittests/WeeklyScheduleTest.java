package com.cs.unittests;

import com.cs.DailySchedule;
import com.cs.ISchedule;
import com.cs.ScheduleItem;
import com.cs.WeeklySchedule;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 885982 on 22-10-2015.
 */
public class WeeklyScheduleTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * We have 5 working days. Weekends are not taken into account while scheduling
     */
    @Test
    public void GivenANewWeeklyScheduleItContainsFiveFreeDailySchedules()
    {
        ISchedule weekSchedule = new WeeklySchedule();
        int amountOfFreeDays = weekSchedule.GetNumberOfFreeDaysInSchedule();

        assertEquals(5, amountOfFreeDays);
    }

    /***
     * We are working with 2 blocks that can  be scheduled each day.
     * A morning part and an afternoon part. More graininess is not needed
     */
    @Test
    public void GivenADailyScheduleItContainsTwoValidScheduleItems()
    {
        ISchedule weekSchedule = new WeeklySchedule();
        DailySchedule dailySchedule = weekSchedule.getDaySchedule(0);

        ScheduleItem blockA = dailySchedule.GetScheduleItems(0);
        ScheduleItem blockB = dailySchedule.GetScheduleItems(1);

        assertNotNull(blockA);
        assertNotNull(blockB);
    }

    @Test
    public void GivenADailyScheduleItContainsTwoFreeScheduleItems()
    {
        ISchedule weekSchedule = new WeeklySchedule();
        DailySchedule dailySchedule = weekSchedule.getDaySchedule(0);

        int freeItems = dailySchedule.getNumberOfFreeScheduleItems();
    }

    @Test
    public void GivenADailyScheduleRetrieveingAThirdScheduleItemReturnsNull()
    {
        ISchedule weekSchedule = new WeeklySchedule();
        DailySchedule dailySchedule = weekSchedule.getDaySchedule(0);

        ScheduleItem blockA = dailySchedule.GetScheduleItems(3);
        assertNull(blockA);
    }


}