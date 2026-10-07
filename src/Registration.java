public class Registration {
    private Student student;
    private Course course;

    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
        displayConfirmationMessage();
    }

    public void displayConfirmationMessage() {
        System.out.println("CONFIRMATION: Student successfully registered for the course!");
    }

    public void displayRegistration() {
        System.out.println("=== Registration Details ===");
        student.displayStudent();
        course.displayCourse();
    }
}