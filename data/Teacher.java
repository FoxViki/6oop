package data;

import java.time.LocalDate;

public class Teacher extends User implements Comparable<Teacher>{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

     @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }

}