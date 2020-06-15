package pacheco.pamela.exemplolombok.model;

import lombok.*;

/**
 * @author Pamela Pacheco
 */
@ToString
@AllArgsConstructor @NoArgsConstructor
public class Client {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private int age;

    /**
     *
     * @return Calculo idade em meses
     */
    public int calculateAgeInMonths() {
        return this.age * 12;
    }

}
