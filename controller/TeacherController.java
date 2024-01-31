import java.time.LocalDate;

import data.Teacher;

public interface TeacherController {
    void createTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Teacher teacherId);
    void printTeacher();
}
