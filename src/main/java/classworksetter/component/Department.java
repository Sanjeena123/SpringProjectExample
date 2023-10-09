package classworksetter.component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Department {
    private Student student;

   /* public Department(Student student) {
        this.student = student;
    }*/
    public void validateDepartmentName(){
        System.out.println("department name is civil");
    }
    public void getDepartmentData(){
        System.out.println("department date is 2018");
    }
}
