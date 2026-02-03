package Java.Collections.Queue;

public class Students {
    private String subject;
    private int marks;

    public Students(String subject, int marks) {
        this.subject = subject;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "subject='" + subject + '\'' +
                ", marks=" + marks +
                '}';
    }
}
