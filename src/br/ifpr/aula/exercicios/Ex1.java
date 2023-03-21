package br.ifpr.aula.exercicios;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Ex1
        double salario = 1000;
        double aumento = 10;
        System.out.println(SalarioAtualizado(salario, aumento));

        //Ex2
        TiposDados();

        //Ex3
        System.out.println(SomaZero(3));

        //Ex4
        System.out.println(NomeIdade("Mateus", 14, 01, 2000));

        //Ex5
        ImprimirDisciplinas();

        //Ex6
        ImprimirNome("Mateus", 14, 01, 2000);

    }
    //Ex1
    static double SalarioAtualizado(double salario, double aumento) {
        double salarioFinal = salario + salario * (aumento / 100);
        return salarioFinal;
    }
    //Ex2
    static void TiposDados() {
        System.out.printf("byte;\nshort;\nint;\nlong;\nboolean;\nchar;\nfloat;\ndouble.\n");
    }
    //Ex3
    static int SomaZero(int valor1) {
        int soma = 0;
        for (int i = 0; i <= valor1; i++) {
            soma += i;
        }
        return soma;
    }
    //Ex4
    static String NomeIdade(String nome, int dia, int mes, int ano) {
        String nomeIdade = "Nome: " + nome + " - Idade: " + dia + "/" + mes + "/" + ano;
        return nomeIdade;
    }
    //Ex5
    static void ImprimirDisciplinas() {
        System.out.println("ALGORITMOS E ESTRUTURAS DE DADOS II ");
        System.out.println("ANÁLISE E PROJETO DE SISTEMAS");
        System.out.println("ARQUITETURA DE COMPUTADORES");
        System.out.println("BANCO DE DADOS II");
        System.out.println("CÁLCULO");
        System.out.println("EMPREENDEDORISMO EM TECNOLOGIA DA INFORMAÇÃO");
        System.out.println("INTERAÇÃO HUMANO-COMPUTADOR");
        System.out.println("PROGRAMAÇÃO ORIENTADA A OBJETOS");
        System.out.println("PROJETO INTEGRADOR I");
    }
    //Ex6
    static void ImprimirNome(String nome, int dia, int mes, int ano) {
        System.out.println(NomeIdade(nome, dia, mes, ano) + " - Em 15/03/2023");
    }
}