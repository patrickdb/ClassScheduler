package com.cs.unittests;

import com.cs.ISchedule;
import com.cs.Teacher;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by 885982 on 22-10-2015.
 */
public class TeacherTest  {

    public void setUp() throws Exception {

    }

    public void tearDown() throws Exception {

    }

    @Test
    public void WhenNonParameterInCTorNameIsDefault() {
        Teacher newTeacher = new Teacher();
        assertEquals("defaultTeacherName", newTeacher.getName());
    }

    @Test
    public void AddingNewTeacherWithNameInCTor() {
        String teacherName = "Patrick";
        Teacher newTeacher = new Teacher(teacherName);
        assertEquals(teacherName, newTeacher.getName());
    }

    @Test
    public void WhenCreatingNewTeacherEmptyScheduleIsAdded()
    {
        Teacher teacher = new Teacher();
        ISchedule schedule = teacher.getSchedule();

        assertNotNull(schedule);
        assertTrue(schedule.isEmpty());
    }
}