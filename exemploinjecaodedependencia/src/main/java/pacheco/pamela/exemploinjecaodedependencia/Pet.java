package pacheco.pamela.exemploinjecaodedependencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pacheco.pamela.exemploinjecaodedependencia.interfaces.AnimalInterface;
import pacheco.pamela.exemploinjecaodedependencia.model.Cat;

/**
 * @author Pamela Amanda
 */
@Component
public class Pet {

    @Autowired
    private AnimalInterface animalInterface;

//    /**
//     *
//     * @param animalInterface
//     */
//    public Pet(AnimalInterface animalInterface) {
//        this.animalInterface = animalInterface;
//    }


    public void execute() {
        animalInterface.comunicar();
    }
}
