package br.com.aula.cm;

import br.com.aula.cm.modelo.Tabuleiro;
import br.com.aula.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}
}
