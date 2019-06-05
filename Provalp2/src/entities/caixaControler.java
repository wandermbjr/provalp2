package entities;

import java.util.ArrayList;
import java.util.Collections;
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

	public void modificaPersonalizacao(String descricao, String novaPersonalizacao) {
		if (caixa.containsKey(descricao)) {
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

	public String retornarCaixasPersonalizadas(String personalizacao) {
		ArrayList<String> ordenavel = new ArrayList<>();
		String retorno = "";
		for (caixaDecorativa x : this.caixa.values()) {
			if (x.getPersonalizacao().equals(personalizacao)) {
				ordenavel.add(x.getDescricao());
			}
		}
		Collections.sort(ordenavel);
		for (String x : ordenavel) {
			retorno += x;
		}
		return retorno;

	}

	public String retornarCaixasFormato(String formato) {
		ArrayList<String> ordenavel = new ArrayList<>();
		String retorno = "";
		for (caixaDecorativa x : this.caixa.values()) {
			if (x.getFormato().equals(formato)) {
				ordenavel.add(x.getDescricao());
			}
		}
		Collections.sort(ordenavel);
		for (String x : ordenavel) {
			retorno += x;
		}
		return retorno;

	}

	public double calculaTotalRedimento() {
		double precoTotal = 0;
		for (caixaDecorativa x : this.caixa.values()) {
			precoTotal = x.getPreco();
		}

		return precoTotal;

	}

}
