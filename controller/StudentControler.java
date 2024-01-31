import data.Student;
import view.StudentView;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentControler implements StudentController{

    private List<Student> studentList = new ArrayList<>();
    private StudentView studentView = new StudentView();
    
    public StudentControler(StudentView studentView) {
        this.studentView = studentView;
    }
    @Override
    public void addStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth,
            Student studentId) {
        Student newStudent = new Student();
            studentList.add(newStudent);
    }
    
    @Override
    public void printStudent() {
        studentView.printStudent(studentList);
        
    }

}