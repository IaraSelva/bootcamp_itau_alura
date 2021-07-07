package br.com.alura.spring.data;

import br.com.alura.spring.data.repository.CrudCargo;
import br.com.alura.spring.data.service.CrudCargoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

	private boolean system = true;

	private final CrudCargoService service;

	public SpringDataApplication(CrudCargoService service){
		this.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		while(system){
			System.out.println("Qual ação você quer executar?");
			System.out.println("0 -- SAIR");
			System.out.println("1 -- CARGO");

			int action = scanner.nextInt();
			if(action == 1){
				service.inicial(scanner);
			}else{
				system = false;
			}
		}

	}
}
