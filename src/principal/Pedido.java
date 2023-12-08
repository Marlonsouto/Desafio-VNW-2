package principal;

public class Pedido {
	String nomeProduto;
	int quantidade;
	double preco;
	
	public Pedido() {
		
	}
	
	

	public Pedido(String nomeProduto, int quantidade, double preco) {
		
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	
	public Double ValorPedido() {
		return quantidade * preco;
	}



	@Override
	public String toString() {
		return "Pedido:\nNome do Produto = " + nomeProduto + "\nQuantidade : " + quantidade + "\nPreco : " + preco + "\ntotal = : " 
	+ String.format("%.2f", ValorPedido());
	}

	
}
