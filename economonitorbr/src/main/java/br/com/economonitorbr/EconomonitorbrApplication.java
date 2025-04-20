package br.com.economonitorbr;

import br.com.economonitorbr.application.ConsoleEconomonitorApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EconomonitorbrApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EconomonitorbrApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		ConsoleEconomonitorApplication console = new ConsoleEconomonitorApplication();
		try {
			console.exibeMenu();
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
