public class UniversityCourseRegistration {
    public static void main(String[] args) {
        Student student = new Student("S101", "Alice Smith", "Computer Science");
        Course course = new Course("CS201", "Software Construction & Design", 3);

        Registration reg = new Registration(student, course);
        reg.displayRegistration();
    }
}