package pacheco.pamela.exemplocomponentscan;

import dao.ClassDAO;
import dao.ClassJDBC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("dao")
public class ExemplocomponentscanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemplocomponentscanApplication.class, args);

		ClassDAO objectDAO = applicationContext.getBean(ClassDAO.class);

		System.out.println("objectDAO: " + objectDAO);
		System.out.println("objectJDBC dentro do objectDAO: " + objectDAO.getClassJDBC());

	}

}
