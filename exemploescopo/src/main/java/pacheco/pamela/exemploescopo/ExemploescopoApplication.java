package pacheco.pamela.exemploescopo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pacheco.pamela.exemploescopo.dao.ClassDAO;
import pacheco.pamela.exemploescopo.dao.ClassJDBC;

@SpringBootApplication
public class ExemploescopoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploescopoApplication.class, args);

		ClassJDBC objJDBC = applicationContext.getBean(ClassJDBC.class);
		ClassJDBC objJDBC1 = applicationContext.getBean(ClassJDBC.class);

		ClassDAO objDAO = applicationContext.getBean(ClassDAO.class);
		ClassDAO objDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("ClassJDBC: " + objJDBC);
		System.out.println("ClassJDBC1: " + objJDBC1);

		System.out.println("ClassDAO: " + objDAO);
		System.out.println("ClassDAO1: " + objDAO1);
	}

}
