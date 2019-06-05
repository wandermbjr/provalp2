package entities;

public class Facade {

	caixaControler cxc = new caixaControler();

	public void cadastraCaixaDecorativa(String descricao, String personalizacao, String formato, String dimensao) {
		cxc.cadastraCaixa(descricao, personalizacao, formato, dimensao);
	}

}
