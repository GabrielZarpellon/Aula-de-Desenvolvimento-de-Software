package Aula02;

import java.util.Scanner;

public class Fix2 {

	public static void main(String[] args) {
		
		/*
		transformar o programa do exercicio de fixação 1 em um sistema que permita ler a entrada de dados pelo usuário em um vetor durante execução;
		Permitir que o usuário informe, primeiro, os dados de 5 alunos e depois de capturados os dados, imprimir o relatório final com todos os dados;
		Matricula: xxxx
		Nome: xxxx
		Aprovado:()sim ()nao
		nota final: xx
		*/
		
		Scanner leitor = new Scanner(System.in);
		
		int qtde = 2;
		
		String[] matriculas = new String[qtde];
		String[] nomes = new String [qtde];
		int[] notas1 = new int[qtde];
		int[] notas2 = new int [qtde];
		
		for (int i = 0; i < qtde; i++) {
			
			System.out.println("Informe a matricula");
			matriculas[i]= leitor.nextLine();
			
			System.out.println("Informe o nome");
			nomes[i]= leitor.nextLine();
			
			System.out.println("Informe a nota1");
			notas1[i]= leitor.nextInt();
			
			System.out.println("Informe a nota2");
			notas2[i]= leitor.nextInt();
			
			leitor.nextLine(); /*Força quebra de linha */
			
		};
		
		int contador = 0;
		while(contador < qtde) {
			
			System.out.println("Nome: " + nomes[contador]);
			System.out.println("Matricula: " + matriculas[contador]);
			
			int notaFinal = (notas1[contador] + notas2[contador]) / 2;
			
			if (notaFinal >=6) {
				System.out.println("Aprovado: (x)sim ()não");
			} else {
				System.out.println("Aprovado: ()sim (x)não");
			}
			System.out.println("Nota final: " + notaFinal + "\n");
			
			contador ++;
		};
		
		leitor.close();
		
	}

}

