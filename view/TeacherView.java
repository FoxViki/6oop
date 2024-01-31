package view;

import java.util.List;

import data.Student;

public class TeacherView {
    
    @Override
    public void sendOnConsole(List<Teacher> teacherList) {
        for(Teacher teacher: teacherList){
            System.out.println(teacher);
        }
    }

}
