package dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Pamela Amanda
 */
@Component
@Getter @Setter
public class ClassDAO {

    @Autowired
    private ClassJDBC classJDBC;
}
