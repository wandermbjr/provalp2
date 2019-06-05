package entities;

public class caixaCircular extends caixaDecorativa {

	public caixaCircular(String descricao, String formato, String personalizacao, String dimensao) {
		super(descricao, formato, personalizacao, dimensao);

	}
	@Override
	public void setPersonalizacao(String novaPersonalizacao) {
		this.personalizacao = novaPersonalizacao;
	}

	public double getAreaTotal() {

		double raio = Double.parseDouble(dimensao);
		double area = Math.PI * (raio * raio);
		return area;
	}

	@Override
	public double getPreco() {
		double preco = 0.1 * getAreaTotal();
		return preco;
	}

	@Override
	public String toString() {
		return " Caixa com " + "< " + this.personalizacao + " >" + " custa R$ <" + this.getPreco() + ">. "
				+ " Formato <" + this.formato + ">.";
	}

}
