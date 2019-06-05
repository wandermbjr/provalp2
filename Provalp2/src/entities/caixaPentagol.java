package entities;

public class caixaPentagol extends caixaDecorativa {


	public caixaPentagol(String descricao, String formato, String personalizacao, String dimensao) {
		super(descricao, formato, personalizacao, dimensao);
	
	}

	public double getAreaTotal() {

		double lado = Double.parseDouble(dimensao);
		double altura = (lado / 2 * Math.sqrt(5 + 2) * Math.sqrt(5)) / 2;
		double areatotal = 5.0 * (lado * altura) / 2;
		return areatotal;
	}

	@Override
	public double getPreco() {
		double preco = 0.1 * getAreaTotal();
		return preco;
	}

	@Override
	public void setPersonalizacao(String novaPersonalizacao) {
		this.personalizacao = novaPersonalizacao;
	}

	@Override
	public String toString() {
		return " Caixa com " + "< " + this.personalizacao + " >" + " custa R$ <" + this.getPreco() + ">. "
				+ " Formato <" + this.formato + ">.";
	}

}
