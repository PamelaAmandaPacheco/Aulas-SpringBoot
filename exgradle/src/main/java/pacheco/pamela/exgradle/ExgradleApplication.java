package pacheco.pamela.exgradle;

import model.Calculadora;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExgradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExgradleApplication.class, args);
	}

	Calculadora calculadora = new Calculadora();

	public String toString() {
		return "\nNumero 1: " + calculadora.getNumero1() + "\nNumero 2: " + calculadora.getNumero2() + "\nSoma dos dois numeros: " + calculadora.multiplicacaoDosDoisNumeros();
	}

}
