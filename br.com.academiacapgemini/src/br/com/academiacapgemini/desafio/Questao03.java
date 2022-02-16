package br.com.academiacapgemini.desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Questao03 {
	
	private static boolean saoAnagramas(String caracteresUm, String caracteresDois) {

		char[] cUm = caracteresUm.toCharArray();
		char[] CDois = caracteresDois.toCharArray();
		
		Arrays.sort(cUm);
		Arrays.sort(CDois);

		return Arrays.equals(cUm, CDois);
	}

	private static int verificaAnagramasSubstring(String a, int b) {
		Integer quantidadeAnagramas = 0;

		ArrayList<String> listaConjuntos = new ArrayList();

		for (int i = 0; i <= a.length() - b; i++) {
			listaConjuntos.add(a.substring(i, i + b));
		}

		for (int i = 0; i < listaConjuntos.size(); i++) {
			for (int c = i + 1; c < listaConjuntos.size(); c++) {

				String comparaUm = listaConjuntos.get(i);
				String comparaDois = listaConjuntos.get(c);

				if (saoAnagramas(comparaUm, comparaDois)) {
					quantidadeAnagramas++; 
				}
			}
		}

		if (b == 1) {
			return quantidadeAnagramas;
		}

		return quantidadeAnagramas + verificaAnagramasSubstring(a, b - 1);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a palavra que deseja ver quantos anagramas tem nas substrings: ");
		String palavraEscolhida = scan.next();

		Integer quantidadeAnagramas = verificaAnagramasSubstring(palavraEscolhida, palavraEscolhida.length());

		System.out.println(quantidadeAnagramas);

	}
	
}