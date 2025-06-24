package br.com.senaisp.bauru.aula06;

import java.util.Scanner;

import com.sun.source.tree.WhileLoopTree;

public class Exemplo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		do {
			try {
		System.out.println("Você nasceu em" + (2025-idade));
		idade = sc.nextInt();
		System.out.println("Você digitou uma idade inválida!");
	} catch (Exception e) {
		idade
	}
	} While(idade>0);
	sc.close();
	}
}
