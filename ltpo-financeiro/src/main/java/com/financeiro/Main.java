package main.java.com.financeiro;

import main.java.com.financeiro.model.GestorFinanceiro;
import main.java.com.financeiro.model.Transacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GestorFinanceiro gestor = new GestorFinanceiro();

        System.out.println("Insira a quantidade de transações que deseja cadastrar: ");
        int quantidadeTransacoes = scanner.nextInt();

        for (int i = 0; i < quantidadeTransacoes; i++) {
            System.out.print("Insira a descrição da transação: ");
            String descricao = scanner.next();

            System.out.println("Insira o valor da transação: ");
            double salarioBase = scanner.nextDouble();

            System.out.println("Insira se essa transação é uma RECEITA ou uma DESPESA: ");
            String tipoTransacao = scanner.next();

            gestor.adicionarTransacao(descricao, salarioBase, Transacao.TipoTransacao.valueOf(tipoTransacao));
        }

        gestor.listarTransacoes();

        System.out.printf("\nSaldo final: R$ %.2f\n", gestor.calcularSaldo());
    }
}