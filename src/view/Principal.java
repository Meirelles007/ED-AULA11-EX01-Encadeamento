package view;

import javax.swing.JOptionPane;

import controller.ListaBuilder;


public class Principal {

	public static void main(String[] args) {

		ListaBuilder Builder = new ListaBuilder();
		int tamanholista = 0;
		int qtdnumeros = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros aleatorios ser�o gerados ? "));
		Builder.gerarlista(qtdnumeros);
		tamanholista = Builder.criar_unica_lista();
		Builder.Ordenar_crescente(tamanholista);
	}
}
