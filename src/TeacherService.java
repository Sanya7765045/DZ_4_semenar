public class TeacherService {
    public boolean validateTeacher(Teacher teacher) {
        // Реализация логики валидации
        // Возвращаем true, если учитель прошел валидацию, и false в противном случае
        return teacher.getAge() >= 25 && teacher.getAge() <= 60;
    }
}