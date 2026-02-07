package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Entre com os dados do produto: ");
		System.out.printf("Nome: ");
		String name = sc.next();
		System.out.printf("Preço: R$ ");
		Double price = sc.nextDouble();
		System.out.printf("Quantidade em estoque: ");
		int quant = sc.nextInt();
		
		
		Product product = new Product(name, price, quant);
		System.out.println("Dados do produto: "+product);
		System.out.println("Entre com o numero de produtos para ser adcionado ao estoque: ");
		quant = sc.nextInt();
		product.addProduct(quant);
		
		product.setNome("Computador");
		
		System.out.println("Dados do produto: "+product);
		System.out.println("Entre com o numero de produtos para ser removido do estoque: ");
		quant = sc.nextInt();
		product.removeProduct(quant);
		System.out.println("Dados do produto: "+product);
		
		

		
		sc.close();
	}

}
