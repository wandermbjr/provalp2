package entities;

public abstract class caixaDecorativa  {
	
protected String descricao;
protected String personalizacao;
protected String dimensao;
protected String formato;


public caixaDecorativa(String descricao,String formato, String personalizacao, String dimensao) {
	this.formato = formato;
	this.descricao = descricao;
	this.personalizacao = personalizacao;
	this.dimensao = dimensao;
}


public void setPersonalizacao(String personalizacao) {
	this.personalizacao = personalizacao;
}

public String getPersonalizacao() {
	return this.personalizacao;
}

public String getDescricao() {
	return this.descricao;
}

public String getFormato() {
	return this.formato;
}

public double getPreco() {
	return 0.0;
}





}
