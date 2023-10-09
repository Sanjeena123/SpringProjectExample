package annotationspringframwork.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {
    @Bean(name = "car1")
    public Car car() {
        Car car = new Car(engine());
        return car;
    }


    @Bean(name = "engine")
    public Engine engine() {
        Engine engine = new Engine();
        return engine;

    }
}