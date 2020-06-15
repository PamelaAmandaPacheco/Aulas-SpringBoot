package pacheco.pamela.exemplolombok.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pacheco.pamela.exemplolombok.model.Client;

import java.util.ArrayList;

@RestController
public class ClientController {

    @GetMapping("/clients")
    public ArrayList<Client> getClients() {

        ArrayList<Client> clients = new ArrayList<>();

        Client client = new Client();
        client.setName("Pamela");
        client.setLastName("Pacheco");
        client.setAge(20);

        Client client1 = new Client();
        client1.setName("Matheus");
        client1.setLastName("Hedlund");
        client1.setAge(22);

        clients.add(client);
        clients.add(client1);

        return clients;

    }
}
