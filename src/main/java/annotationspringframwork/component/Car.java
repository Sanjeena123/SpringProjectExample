package annotationspringframwork.component;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public  void displayEngineDetail(){
        System.out.println(this.engine.getMileage()+"::"+this.engine.getGear());
    }
}
