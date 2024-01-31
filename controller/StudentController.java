import java.time.LocalDate;

import data.Student;

public interface StudentController{
    void addStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Student studentId);
    void printStudent();
}
