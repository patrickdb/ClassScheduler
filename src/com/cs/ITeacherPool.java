package com.cs;

/**
 * Created by 885982 on 22-10-2015.
 */
@SuppressWarnings("ALL")
public interface ITeacherPool {
    void add(ITeacher newTeacher);
    int GetNumberOfTeachers();
    ITeacher GetTeacher(String teacherToBeFound);
}
