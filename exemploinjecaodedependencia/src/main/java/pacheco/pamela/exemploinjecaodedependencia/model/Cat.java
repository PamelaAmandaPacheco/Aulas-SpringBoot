package pacheco.pamela.exemploinjecaodedependencia.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pacheco.pamela.exemploinjecaodedependencia.interfaces.AnimalInterface;

/**
 * @author Pamela Amanda
 */
@Component
@Primary
public class Cat implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("Miau miau!");
    }
}
