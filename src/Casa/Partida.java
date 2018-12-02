package Casa;

import Casa.TerrenoEspecial.TerrenoEspecial;
import Jogador.Jogador;

public class Partida extends TerrenoEspecial {

	public Partida(String nome, int posicao, int id, int x, int y) {
		super(nome, posicao, id, x, y);
		// TODO Auto-generated constructor stub
	}

	public void ativarEfeito(Jogador jogador) {
		jogador.getConta().depositar(200);
	}
}
