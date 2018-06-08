package mvcpattern;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // get model from database
        Student model = getStudentFromDatabase();

        // get view
        StudentView view = new StudentView();

        // get controller
        StudentController controller = new StudentController(model, view);

        // print view
        controller.updateView();

        // change model info
        model.setName("Lucy");
        model.setRollNo("1002");

        // update view
        controller.updateView();
    }

    public static Student getStudentFromDatabase() {
        Student student = new Student();
        student.setRollNo("1001");
        student.setName("Jack");
        return student;
    }
}
