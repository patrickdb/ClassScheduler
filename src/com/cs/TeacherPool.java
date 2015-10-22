package com.cs;

/**
 * Created by 885982 on 22-10-2015.
 */
public class TeacherPool {

    Teacher teacher;

    public void add(Teacher newTeacher) {
        teacher = newTeacher;
    }

    public int GetNumberOfTeachers() {
        return 1;
    }

    public Teacher GetTeacher(String teacherToBeFound)
    {
        return teacher;
    }
}
