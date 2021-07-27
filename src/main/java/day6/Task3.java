package day6;

public class Task3 {
    public static void main(String[] args) {
    Teacher teacher = new Teacher("Иван Николаевич Судников", "Математика");
    Student student = new Student("Иванов Иван Иванович");

    teacher.evaluate(student);
    }
}
