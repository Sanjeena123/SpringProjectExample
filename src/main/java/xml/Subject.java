package xml;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Subject {
    private int subjectId;
    private String subjectName;
    private Student student;

    public Subject() {
        System.out.println("Subject class constructor invoked!!");
    }
}
