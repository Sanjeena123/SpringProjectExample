package classwork;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {


    public void validateStudentId(){
        System.out.println("your student ID: 101");
    }
    public void validateStudentName(){
        System.out.println("Student name is rojina ");
    }
    public void validateStudentDate(){
        System.out.println("student date of birth is 1992");
    }

}
