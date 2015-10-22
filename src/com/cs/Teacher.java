package com.cs;

/**
 * Created by 885982 on 22-10-2015.
 */
public class Teacher implements ITeacher {

    private ISchedule weeklySchedule = new WeeklySchedule();
    private String teacherName = "defaultTeacherName";

    public Teacher(String addedName) {
        teacherName = addedName;
    }

    public Teacher() {
    }

    public final String getName() {
        return teacherName;
    }

    @Override
    public ISchedule getSchedule() {
        return weeklySchedule;
    }
}
