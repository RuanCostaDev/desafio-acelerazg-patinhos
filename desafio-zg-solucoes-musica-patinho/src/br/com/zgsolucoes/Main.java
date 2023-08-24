package br.com.zgsolucoes;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		//instância da classe
		MusicaPatinhos inicializador = new MusicaPatinhos();

		//método para iniciar a musica, passando o validador como argumento
	    inicializador.iniciar(Validador.validaEntrada());	    

	}

}
