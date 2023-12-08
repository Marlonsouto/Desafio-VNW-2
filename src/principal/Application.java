package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Cliente> clientes = new ArrayList<>();
		
		System.out.print("quantos clientes dejesa cadastrar?: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			System.out.println("Nome do cliente: ");
			String nomeCliente = sc.nextLine();
			System.out.println("cpf do cliente: ");
			String cpf = sc.nextLine();
				
			System.out.println("\nPedido do cliente:");
				
			System.out.print("Nome do Produto: ");
			String nomeProduto = sc.nextLine();
			System.out.print("quantidade de Produtos: ");
			int quantidade = sc.nextInt();
			System.out.print("Valor do produto: ");
			double preco = sc.nextDouble();
			while(preco<=0) {
				System.err.println("informe um valor maior que 0");
				preco = sc.nextDouble();
			}
			sc.nextLine();
			System.out.println();
			Pedido pedido = new Pedido(nomeProduto,quantidade,preco);
			
			clientes.add(new Cliente(nomeCliente, cpf, pedido));
			System.out.println("===========================");
			
		}
			System.out.println("Lista de clientes: ");
			System.out.println();
		for(Cliente l: clientes) {
			System.out.println(l.nome + " " + l.pedido.toString() + " ");
			System.out.println();
		}
		sc.close();

	}

}
