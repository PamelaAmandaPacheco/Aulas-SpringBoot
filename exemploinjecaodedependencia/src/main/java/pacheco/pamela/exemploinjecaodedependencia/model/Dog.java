package pacheco.pamela.exemploinjecaodedependencia.model;

import org.springframework.stereotype.Component;
import pacheco.pamela.exemploinjecaodedependencia.interfaces.AnimalInterface;

/**
 * @author Pamela Amanda
 */
@Component
public class Dog implements AnimalInterface {


    @Override
    public void comunicar() {
        System.out.println("Au au!");
    }
}
