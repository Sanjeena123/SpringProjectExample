package xml;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student {
    private int studId;
    private String studName;
    private int rollNumber;
    private Subject subject;

    //Constructor DI
    public Student(Subject subject, String studName, int rollNumber, int studId) {
        System.out.println("Student class construtor invoked!!");
        this.subject = subject;
        this.rollNumber = rollNumber;
        this.studName = studName;
        this.studId = studId;
    }

    public void init() {
        System.out.println("Initializing of Student class!!");
    }
    public void cleanup() {
        System.out.println("Destroying of Student class!!");
    }
}