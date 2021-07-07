package br.com.alura.spring.data.service;

import br.com.alura.spring.data.orm.Funcionario;
import br.com.alura.spring.data.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

@Service
public class RelatoriosService {

    private Boolean system = true;

    private final FuncionarioRepository funcionarioRepository;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public RelatoriosService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }


    public void inicial(Scanner scanner) {
        while (system) {
            System.out.println("Qual acao de cargo deseja executar");
            System.out.println("0 - Sair");
            System.out.println("1 - Busca Funcionário por Nome");

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    buscaFuncionarioNome(scanner);
                    break;
                case 2:
                    buscaFuncionarioNomeSalarioMaiorData(scanner);
            }
        }
    }

    private void buscaFuncionarioNome(Scanner scanner)    {
            System.out.println("Qual nome de funcionário deseja pesquisar?");
            String nome = scanner.next();
            List<Funcionario> list = funcionarioRepository.findByNome(nome);
            list.forEach(System.out::println);
        }

    private void buscaFuncionarioNomeSalarioMaiorData (Scanner scanner){
        System.out.println("Qual nome de funcionário deseja pesquisar?");
        String nome = scanner.next();

        System.out.println("Qual salário deseja pesquisar?");
        Double salario = scanner.nextDouble();

        System.out.println("Qual data de contratação deseja pesquisar?");
        String data = scanner.next();
        LocalDate localDate = LocalDate.parse(data, formatter);

        List<Funcionario> list = funcionarioRepository.findByNomeSalarioMaiorDataContratacao(nome, salario, localDate);

        list.forEach(System.out::println);
    }
}
