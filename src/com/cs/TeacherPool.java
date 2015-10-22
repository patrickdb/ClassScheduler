package com.cs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 885982 on 22-10-2015.
 */
public class TeacherPool implements ITeacherPool {

    private final List<ITeacher> availableTeachers = new ArrayList<ITeacher>();

    final public void add(ITeacher newTeacher) {

        availableTeachers.add(newTeacher);
    }

    final public int GetNumberOfTeachers() {
        return availableTeachers.size();
    }

    final public ITeacher GetTeacher(String teacherToBeFound)
    {
        ITeacher teacherfound = new Teacher();

        for (ITeacher teacher : availableTeachers) {
            if (teacher.getName().equals(teacherToBeFound)) {
                teacherfound = teacher;
            }
        }

        return teacherfound;
    }
}
