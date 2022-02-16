package br.com.academiacapgemini.desafio;

import java.util.Scanner;

public class Questao02 {
	
	public static boolean senhaForte(String senha) {
	    if (senha.length() < 6) return false;

	    boolean achouNumero = false;
	    boolean achouMaiuscula = false;
	    boolean achouMinuscula = false;
	    boolean achouSimbolo = false;
	    for (char c : senha.toCharArray()) {
	         if (c >= '0' && c <= '9') {
	             achouNumero = true;
	         } else if (c >= 'A' && c <= 'Z') {
	             achouMaiuscula = true;
	         } else if (c >= 'a' && c <= 'z') {
	             achouMinuscula = true;
	         } else if(c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '*' || c == '(' || c == ')' || c == '-' || c == '+'){
	             achouSimbolo = true;
	         }
	    }
	    return achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo;
	}
	
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.println("Digite sua senha com os seguintes requisitos: ");
		System.out.println("Possuir no mínimo 6 caracteres;");
		System.out.println("No mínimo 1 digito;");
		System.out.println("No mínimo 1 letra em minúsculo;");
		System.out.println("No mínimo 1 letra em maiúsculo;");
		System.out.println("No mínimo 1 caractere especial ( ! @ # $ % ^ & * ( ) - + ).");
		String senha = scann.nextLine();
		if (Questao02.senhaForte(senha)) {
			System.out.println("Senha salva com sucesso!");
		}else if(senha.length()< 6){
			
			System.out.println("Faltam " + (6-(senha.length()))+" Digitos");
		}else {
			System.out.println("Desculpe sua senha não atende os requisitos.");
		}
		
}
}