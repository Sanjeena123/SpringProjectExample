package classwork;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Create a Spring Basics project having included IOC container, Spring bean and Dependency Injection concept using
annotation and xml configuration both.

        Introduces 3 class 'Institute', 'Department' and 'Student'. Connection between these 3 classes are as follows,
        As an Institute has a Department and a department has a student.

        Now create 3 method named validateStudentId(), validateStudentName(), getStudnetData() in student class
and 2 method named validateDepartmentName() and getDepartmentData() in department class.
        All these method no need to write any logic just put System.out.println() would be fine.

        Try to invoke all the methods by creating Institute Object by using spring bean in IOC container.
        Make sure other 2 classes ('Department' & 'Students') are also need to configure inside configure class.

        Hints: all 3 method of Student class should be invoked from Department class then those
         method will be finally invoked from Institute class.*/
@Setter
@Getter
public class InstituteMain {


       private Department department;

    public InstituteMain(Department department) {
        this.department = department;
    }

    //ApplicationContext context = new ClassPathXmlApplicationContext("newbean.xml");
    }
