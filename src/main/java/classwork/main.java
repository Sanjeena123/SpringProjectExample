package classwork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {


    ApplicationContext context = new ClassPathXmlApplicationContext("newbean.xml");
    InstituteMain instituteMain = context.getBean(InstituteMain.class);
    Department department = instituteMain.getDepartment();
    department.getDepartmentData();
    department.validateDepartmentName();
        Student student = department.getStudent();
        student.validateStudentDate();
        student.validateStudentId();
        student.validateStudentName();
   // Department department = context.getBean(Department.class);

    }

}
    /*xml.Student student = (Student) context.getBean("student");
        System.out.println(student.getRollNumber() + " "+ student.getStudName() + " "+student.getStudId());
                student.setRollNumber(11);
                student.setStudId(2);
                student.setStudName("B");
                System.out.println(student.getRollNumber() + " "+ student.getStudName() + " "+student.getStudId());*/