package mvcpattern;

/**
 * act as model in MVC pattern
 */
public class Student {
    private String rollNo;
    private String name;

//    public Student(String rollNo, String name) {
//        this.rollNo = rollNo;
//        this.name = name;
//    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }
}
