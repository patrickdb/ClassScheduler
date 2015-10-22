package com.cs.unittests;

import com.cs.ITeacher;
import com.cs.Teacher;
import com.cs.TeacherPool;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 885982 on 22-10-2015.
 */
@SuppressWarnings("ALL")
public class TeacherPoolTest {

    private TeacherPool _poolOfTeachers = new TeacherPool();

    @org.junit.Before
    public void setUp() throws Exception {
        Teacher newTeacher = new Teacher();
        _poolOfTeachers.add(newTeacher);
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void AddingTeacherIncreasesNumberOfTeachersByOne()
    {
        int numberOfTeachersInPool = _poolOfTeachers.GetNumberOfTeachers();

        Teacher newTeacher = new Teacher("anotherTeacher");
        _poolOfTeachers.add(newTeacher);

        int deltaTeachersInPool = _poolOfTeachers.GetNumberOfTeachers() - numberOfTeachersInPool;

        assertEquals(1, deltaTeachersInPool);
    }

    @Test
    public void AddingTeacherResultsInTeacherInPool()
    {
        String teacherName = "Patrick";
        Teacher newTeacher = new Teacher(teacherName);
        _poolOfTeachers.add(newTeacher);
        ITeacher foundTeacher = _poolOfTeachers.GetTeacher(teacherName);
        assertEquals(teacherName, foundTeacher.getName());
    }
}