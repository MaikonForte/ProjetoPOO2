package entities;

public class produto {
	
	public String nome;
	public double pre�o;
	public int quantidade;
	
	public double valorTotalemEstoque(){
	return pre�o * quantidade;
	}
	public void addProdutos (int quantidade) {
		this.quantidade += quantidade;
		
	}
	
	public void removerProduto (int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome + ", R$" + String.format("%.2f", pre�o) + ", " + quantidade + " unidade, Total: R$ " +String.format("%.2f",valorTotalemEstoque());
	}

}
