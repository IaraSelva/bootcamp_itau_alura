package br.com.alura.spring.data.repository;

import br.com.alura.spring.data.orm.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Scanner;

@Repository
public interface CrudCargo extends CrudRepository<Cargo, Integer> {

}
