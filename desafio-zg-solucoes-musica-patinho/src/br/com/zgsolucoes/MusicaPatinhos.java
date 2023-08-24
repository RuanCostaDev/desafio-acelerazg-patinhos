package br.com.zgsolucoes;

public class MusicaPatinhos {

	public MusicaPatinhos() {
		System.out.println("Para iniciar a música, insira quantos patinho haverão na música!");

	}
	//método que inicia a musica.
	public void iniciar(int quantidadeDePatos) throws InterruptedException {

		
		int contador = quantidadeDePatos;
		String[] refraoMusicaDosPatinhos = { "X patinhos", "foram passear", "Além das montanhas", "Para brincar",
				"A mamãe gritou", "Quá, quá, quá, quá", "Mas só X-1 patinhos", "voltaram de lá." };
		String[] refraoMusicaDosPatinhosFinal = { "1 patinho", "foi passear", "Além das montanhas", "Para brincar",
				"A mamãe gritou", "Quá, quá, quá, quá", "Mas nenhum patinho", "voltou de lá." };
		String[] finalMusicaDosPatinhos = { "A mamãe patinha foi procurar", "Além das montanhas", "Na beira do mar",
				"A mamãe gritou", "Quá, quá, quá, quá", "E os X patinhos", "Voltaram de lá" };
		
		//primeira parte da musica
		while (contador > 0) {

			for (int i = 0; i < refraoMusicaDosPatinhos.length; i++) {
				Thread.sleep(1000);
				if (i == 0 && contador > 1) {
					imprimePato(contador);

					System.out.println(refraoMusicaDosPatinhos[i].replace("X", Integer.toString(contador)));
				} else if (i == 6 && contador > 1) {
					System.out.println(refraoMusicaDosPatinhos[i].replace("X-1", Integer.toString(contador - 1)));

				} else if (contador > 1) {
					System.out.println(refraoMusicaDosPatinhos[i]);
				} else if (contador == 1 && i == 0) {
					imprimePato(contador);

					System.out.println(refraoMusicaDosPatinhosFinal[i]);
				} else {
					System.out.println(refraoMusicaDosPatinhosFinal[i]);

				}
			}
			System.out.println();
			contador--;
		}
		//segunda parte da musica
		for (int i = 0; i < finalMusicaDosPatinhos.length; i++) {
			Thread.sleep(1000);
			if (i == 5) {
				System.out.println(finalMusicaDosPatinhos[i].replace("X", Integer.toString(quantidadeDePatos)));
			} else {
				System.out.println(finalMusicaDosPatinhos[i]);
			}

		}
		imprimePato(quantidadeDePatos);

	}

	//método para imprimir na tela os patinhos
	public void imprimePato(int quantidade) throws InterruptedException {

		for (int i = 0; i < quantidade; i++) {
			System.out.print(">o) ");
		}
		System.out.print("\n");
		for (int i = 0; i < quantidade; i++) {
			System.out.print("(_> ");
		}

		System.out.println();
	}
}
