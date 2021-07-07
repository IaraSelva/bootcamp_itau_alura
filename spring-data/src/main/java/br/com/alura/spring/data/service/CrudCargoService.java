package br.com.alura.spring.data.service;

import br.com.alura.spring.data.orm.Cargo;
import br.com.alura.spring.data.repository.CrudCargo;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CrudCargoService {

    private final CrudCargo cargoRepository;

    public CrudCargoService(CrudCargo cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public void inicial(Scanner scanner){
        salvar(scanner);
    }

    private void salvar(Scanner scanner){
        System.out.println("Descrição do Cargo");
        String descricao = scanner.next();
        Cargo cargo = new Cargo();
        cargo.setDescricao(descricao);
        cargoRepository.save(cargo);
        System.out.println("Registro salvo");
    }

    private void atualizar(Scanner scanner){
        System.out.println("Insira o ID");
        int id = scanner.nextInt();
        System.out.println("Descrição do novo cargo");
        String descricao = scanner.next();

        Cargo cargo = new Cargo();
        cargo.setId(id);
        cargo.setDescricao(descricao);
        cargoRepository.save(cargo);

        System.out.println("Cargo atualizado");
    }
}
