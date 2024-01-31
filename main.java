import view.StudentView;

public class main {
    
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        StudentControler studentControler = new StudentControler(studentView);

        studentControler.addStudent("ввллп", "ыыыы", "еепп");
        studentControler.printStudent();

        System.out.println();

        TeacherView teacherView = new TeacherView();
        TeacherControler teacherControler = new TeacherControler(teacherView);

        teacherControler.addTeacher("аллбв", "вбвлл", "аролл");
        teacherControler.printTeacher();

        System.out.println();
    }
}

