package annotationspringframwork.component;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class Engine {
    private double mileage;
    private String gear;
}
