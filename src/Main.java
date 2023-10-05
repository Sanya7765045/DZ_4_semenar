public class Main {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        // Создание учителей
        Teacher teacher1 = new Teacher("John Doe", 35, "Math");
        Teacher teacher2 = new Teacher("Jane Smith", 40, "English");
        Teacher teacher3 = new Teacher("David Johnson", 30, "Science");

        // Добавление учителей в группу
        TeacherGroup group = new TeacherGroup();
        group.addTeacher(teacher1);
        group.addTeacher(teacher2);
        group.addTeacher(teacher3);

        // Отображение списка учителей в группе
        teacherController.displayTeachers(group.getTeachers());

        // Создание и отображение нового учителя
        teacherController.createTeacher("Bob Williams", 45, "History");

        // Редактирование учителя и отображение изменений
        teacherController.editTeacher(teacher1, "John Doe Jr.", 36, "Mathematics");
    }
}