import java.util.List;

public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public void createTeacher(String name, int age, String subject) {
        Teacher teacher = new Teacher(name, age, subject);
        if (teacherService.validateTeacher(teacher)) {
            teacherView.displayTeacher(teacher);
        } else {
            System.out.println("Invalid teacher data");
        }
    }

    public void editTeacher(Teacher teacher, String newName, int newAge, String newSubject) {
        teacher.setName(newName);
        teacher.setAge(newAge);
        teacher.setSubject(newSubject);
        teacherView.displayTeacher(teacher);
    }

    public void displayTeachers(List<Teacher> teachers) {
        teacherView.displayTeachers(teachers);
    }
}