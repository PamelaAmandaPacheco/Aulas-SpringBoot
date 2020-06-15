package pacheco.pamela.exemplolombok.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pacheco.pamela.exemplolombok.model.Client;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Exemplo lombox";
    }

//    @GetMapping("/client")
//    public Client getClient() {
//
//        Client client = new Client();
//        client.setName("Pamela");
//        client.setLastName("Pacheco");
//        client.setAge(20);
//        return client;
//    }

//    @GetMapping("/product")
//    public String getProduct() {
//        return "Objeto produto";
//    }
}
