import java.util.ArrayList;
import java.util.List;

public class TeacherGroup {
    private List<Teacher> teachers;

    public TeacherGroup() {
        teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}