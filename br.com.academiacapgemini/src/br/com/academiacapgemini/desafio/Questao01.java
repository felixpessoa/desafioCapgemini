package br.com.academiacapgemini.desafio;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);

		System.out.println("Digite um Valor: ");
		int n = scann.nextInt();

		for (int i = 1; i <= n; i++) {
		String result = new String(new char[i]).replace("\0", "*");
		System.out.println(result);
		}

	}

}
