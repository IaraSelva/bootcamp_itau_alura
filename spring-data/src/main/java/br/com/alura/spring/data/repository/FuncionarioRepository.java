package br.com.alura.spring.data.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.spring.data.orm.Funcionario;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Integer> ,
         JpaSpecificationExecutor<Funcionario> {

    List<Funcionario> findByNome(String nome);

    //List<Funcionario> findByNomeAndSalarioGreaterThanAndDataContratacao(String nome, Double salario, Date dataContratacao);

    @Query("SELECT f FROM Funcionario f WHERE " +
            "f.nome = :nome AND f.salario >= :salario AND f.dataContratacao = :data")
    List<Funcionario> findByNomeSalarioMaiorDataContratacao(String nome, Double salario, LocalDate data);

    @Query(value = "SELECT f.id, f.nome, f.salario FROM f Funcionarios", nativeQuery = true)
    List<FuncionarioProjecao> findFuncionarioSalario();


}
