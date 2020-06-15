package pacheco.pamela.exemplopostconstructpredestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pacheco.pamela.exemplopostconstructpredestroy.dao.ClientDAO;
import pacheco.pamela.exemplopostconstructpredestroy.model.Client;

@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Pamela", "Pacheco"));

		System.out.println("ClientDAO: " + clientDAO);
		System.out.println("Client: " + clientDAO.getClient().toString());
	}

}
