package xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutionXmlMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //Student student = (Student) context.getBean("student");
        /*Student student = context.getBean(Student.class);
        student.setStudId(1);
        student.setStudName("A");
        System.out.println(student.getStudId() + " :: " + student.getStudName());
        Student student1 = context.getBean(Student.class);
        student1.setStudId(2);
        System.out.println(student1.getStudId());
        System.out.println(student.getStudId());
        student.setStudId(3);
        System.out.println(student1.getStudId());
        System.out.println(student.getStudId());
        Student student2 = context.getBean(Student.class);
        student2.setStudId(10);
        student2.setStudName("B");
        System.out.println(student2.getStudId() + " "+ student2.getStudName());*/

        /*Subject subject = context.getBean(Subject.class);
        subject.setSubjectId(2);
        subject.setSubjectName("Math");
        System.out.println(subject.getSubjectId()+ " :: "+ subject.getSubjectName());*/

        //setter method
        /*Student student = (Student) context.getBean("student");
        System.out.println(student.getRollNumber());
        Subject subject = student.getSubject();
        subject.setSubjectName("Math");
        subject.setSubjectId(1);
        System.out.println(subject.getSubjectName());*/

        //constructor
        Student student = (Student) context.getBean("student");
        System.out.println(student.getRollNumber() + " "+ student.getStudName() + " "+student.getStudId());
        student.setRollNumber(11);
        student.setStudId(2);
        student.setStudName("B");
        System.out.println(student.getRollNumber() + " "+ student.getStudName() + " "+student.getStudId());
        /*Subject subject = student.getSubject();
        subject.setSubjectId(2);
        subject.setSubjectName("Physics");
        System.out.println(subject.getSubjectName());*/

    }
}
