package entities;

import java.util.HashMap;

public class caixaControler {

	HashMap<String, caixaDecorativa> caixa = new HashMap<>();

	public caixaControler() {

	}

	public void cadastraCaixa(String descricao, String personalizacao, String formato, String dimensao) {
		if (formato.equals("pentagonal")) {
			caixaPentagol nova = new caixaPentagol(descricao, formato, personalizacao, dimensao);
			caixa.put(descricao, nova);
		}

		if (formato.equals("circular")) {
			caixaCircular nova = new caixaCircular(descricao, formato, personalizacao, dimensao);
			caixa.put(descricao, nova);
		}

		if (formato.equals("retangular")) {
			caixaRetangular nova = new caixaRetangular(descricao, formato, personalizacao, dimensao);
			caixa.put(descricao, nova);
		}

	}

	public void modificaPersonalizacao(String descricao,String novaPersonalizacao) {
		if (caixa.containsKey(descricao)){
			this.caixa.get(descricao).setPersonalizacao(novaPersonalizacao);
		}
	}

	public boolean removeCaixa(String descricao) {
		if (this.caixa.containsKey(descricao)) {
			this.caixa.remove(descricao);
			return true;
		}
		return false;

	}
	
	public int retornaNumeroCaixas() {
		int valor = this.caixa.size();
		return valor;
	}
	
	public 

}
