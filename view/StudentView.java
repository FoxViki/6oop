package view;

import data.Student;
import mus.StudentGroup;

import java.util.List;
import controller.StudentControler


public class StudentView implements UserView<Student>{

    @Override
    public void sendOnConsole(List<Student> studentList) {
        for(Student teacher: studentList){
            System.out.println(student);
        }
    }

    
}