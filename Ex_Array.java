package br.com.generation.array;

import java.util.ArrayList;

public class Ex_Array {

	public static void main(String[] args) {

		String dado1 = "Caneta";
		String dado2 = "Lápis";
		String dado3 = "Caderno";
		String dado4 = "Estojo";
		
		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(dado1);
		estoque.add(dado2);
		estoque.add(dado3);
		estoque.add(dado4);
		
		System.out.println("Dados do array:" + estoque);
		
		estoque.remove(1);
		System.out.println("Removendo 'Lápis' do array: " + estoque);

		estoque.add(1, "Apontador");
		System.out.println("Adicionando 'Apontador' no índice 1: " + estoque);
	}

}
