package Baralho;

import Casa.Carta;
import Jogador.Jogador;
import Repositorios.RepositorioJogador;
import View.DesenhaComponenteGrafico;

public class Recebe50deTodos extends Carta{

	public Recebe50deTodos(int id, String nome, float efeito) {
		super(id, nome, efeito);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void ativarEfeito(Jogador jogador) {
		// TODO Auto-generated method stub
		DesenhaComponenteGrafico componenteGrafico = new DesenhaComponenteGrafico();
		for (Jogador player : RepositorioJogador.getInstance().getJogadoresJogando()) {
			if (player != jogador) {
				player.getConta().sacar(50);
				jogador.getConta().depositar(50);
				componenteGrafico.mensagemSorteRecebe50DeTodos();
			}
		}
	}
}
