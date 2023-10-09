package classworksetter.main;

import classworksetter.component.Department;
import classworksetter.component.Institute;
import classworksetter.component.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansetter.xml");
        Institute institute =context.getBean(Institute.class);
        Department department = institute.getDepartment();
        department.getDepartmentData();
        department.validateDepartmentName();
        Student student =department.getStudent();
        student.validateStudentDate();
        student.validateStudentId();
        student.validateStudentDate();
    }
}