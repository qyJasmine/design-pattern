package mvcpattern;

/**
 * act as view in MVC pattern
 */
public class StudentView {
    public void printStudentDetails(Student student) {
        System.out.println("Student info:");
        System.out.printf("Roll No:%s\n", student.getRollNo());
        System.out.printf("Name:%s\n", student.getName());
    }
}
