import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import data.Teacher;
import view.TeacherView;

public class TeacherControler {
    private List<Teacher> teacherList = new ArrayList<>();
    private TeacherView teacherView = new TeacherView();
    
    public TeacherControler(TeacherView teacherView) {
        this.teacherView = teacherView;
    }
    @Override
    public void addTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth,
            Teacher teacherId) {
        Teacher newTeacher = new Teacher();
            teacherList.add(newTeacher);
    }
    
    @Override
    public void printTeacher() {
        teacherView.printTeacher(teacherList);
        
    }
}
