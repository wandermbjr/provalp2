package entities;

public class caixaRetangular extends caixaDecorativa{

	public caixaRetangular(String descricao, String formato, String personalizacao, String dimensao) {
		super(descricao, formato, personalizacao, dimensao);
		
	}
	
	public void setPersonalizacao(String novaPersonalizacao) {
		this.personalizacao = novaPersonalizacao;
	}
	
public double getAreaTotal() {
		
		double lado1 = Double.parseDouble(dimensao.split(",")[0]);
		double lado2 = Double.parseDouble(dimensao.split(",")[1]);
		return (lado1 * lado2);
		
	}
	
	
	
	public double getPreco() {
		double preco = 0.1 * getAreaTotal();
		return preco;
	}

	@Override
	public String toString() {
		return " Caixa com "+ "< "+this.personalizacao+" >" + " custa R$ <"+ this.getPreco()+">. " +" Formato <"+ this.formato+ ">.";  
	}

}
