package pacheco.pamela.exemplopostconstructpredestroy.model;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Pamela Amanda
 */

@ToString
@Getter @Setter
@AllArgsConstructor
@Component
public class Client {

    private String name;
    private String lastName;

    private Client() {
        System.out.println("Classe cliente!");
    }
}
