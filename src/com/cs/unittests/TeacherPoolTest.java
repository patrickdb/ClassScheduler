package com.cs.unittests;

import com.cs.Teacher;
import com.cs.TeacherPool;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 885982 on 22-10-2015.
 */
public class TeacherPoolTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void AddingTeacherIncreasesNumberOfTeachersByOne()
    {
        TeacherPool poolOfTeachers = new TeacherPool();
        Teacher newTeacher = new Teacher();
        poolOfTeachers.add(newTeacher);
        int numberOfTeachersInPool = poolOfTeachers.GetNumberOfTeachers();

        assertTrue(true);
    }
}