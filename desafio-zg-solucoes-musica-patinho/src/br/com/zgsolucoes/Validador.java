package br.com.zgsolucoes;

import java.util.Scanner;

//validação da entrada do usuário
public class Validador {

	static Scanner entradaDoUsuario = new Scanner(System.in);

	public static int validaEntrada() {
		try {
			int numeroValido = Integer.parseInt(entradaDoUsuario.next());
			if(numeroValido > 0) return numeroValido;
			System.out.println("Insira um número positivo e maior que 0!");
			return Validador.validaEntrada();

		} catch (Exception e) {
			System.out.println("Entrada inválida, tente novamente!");
			return Validador.validaEntrada();
		}

	}

	
}
