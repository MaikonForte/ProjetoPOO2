package application;

import java.util.Scanner;

import entities.produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		produto produto = new produto();
		
		System.out.println("Inserir dados do produto:");
		
		System.out.print("Nome:");
		produto.nome = input.nextLine();
		
		System.out.print("Preço:");
		produto.preço = input.nextDouble();
		
		System.out.println("Quantidade em estoque:");
		produto.quantidade = input.nextInt();
		
		System.out.println("Informações do produto: " + produto);
		
		System.out.println();
		System.out.println("Numeros de produtos adicionados ao estoque: ");
		int quantidade = input.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualizando informações:" + produto);
		
		System.out.println();
		System.out.println("Numero de produtos removidos do estoque:");
		quantidade = input.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("Atualizando informações: " + produto);
		
		input.close();
		
		
	}

}
