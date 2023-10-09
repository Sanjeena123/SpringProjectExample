package annotationspringframwork.main;

import annotationspringframwork.component.AnnotationConfig;
import annotationspringframwork.component.Car;
import annotationspringframwork.component.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Car car = context.getBean(Car.class);
        Engine engine = car.getEngine();
        engine.setMileage(15.6);
        engine.setGear("auto");
        car.displayEngineDetail();

        Engine engine1 = context.getBean(Engine.class);
        engine1.setMileage(15.8);
        engine1.setGear("manual");
        System.out.println(engine1.getMileage()+"::"+engine1.getGear());
    }
}
