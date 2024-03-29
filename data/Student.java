package data; //класс потомок с полями родителя и доп полем id.

import java.time.LocalDate;

public class Student extends User implements Comparable<Student>{
    private Long studentId;

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }


    // public Student(int i, String firstName, String secondName, String patronymic, LocalDate dateOfBirth,
    //         Student studentId2) {
    //     super(firstName, secondName, patronymic, dateOfBirth);
    //     this.studentId = studentId;

    // }


    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
               "studentId='" + studentId +'\'' +
               ", firstName='" + super.getFirstName() + '\'' +
               ", secondName='" + super.getSecondName() + '\'' +
               ", patronymic='" + super.getPatronymic() + '\'' +
               ", dateOfBirth=" + super.getDateOfBirth() +
               '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}