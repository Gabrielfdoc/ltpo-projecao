package main.java.com.funcionarios;

import main.java.com.funcionarios.model.Funcionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a quantidade de funcionários que deseja cadastrar: ");
        int quantidadeFuncionarios = scanner.nextInt();

        Funcionarios[] funcionariosArray = new Funcionarios[quantidadeFuncionarios];

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.print("Insira o nome do funcionário: ");
            String nome = scanner.next();

            System.out.println("Insira o salário base deste funcionário: ");
            double salarioBase = scanner.nextDouble();

            System.out.println("Insira as horas trabalhadas deste funcionário: ");
            int horasTrabalhadas = scanner.nextInt();

            funcionariosArray[i] = new Funcionarios(nome, salarioBase, horasTrabalhadas);
        }

        System.out.println("\nRelatório de funcionários: ");
        for (Funcionarios funcionario : funcionariosArray) {
            funcionario.exibirDados();
        }
    }
}