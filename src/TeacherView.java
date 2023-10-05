import java.util.List;

public class TeacherView {
    public void displayTeacher(Teacher teacher) {
        System.out.println(teacher);
    }

    public void displayTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}