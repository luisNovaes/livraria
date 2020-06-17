package com.magsoltec.pesquisa.enumeration;

public enum BuscaOrdenacao {
	TITULO_A_Z(1, "Titulo de A a Z"),
	TITULO_Z_A(2, "Titulo de Z a A"),
	ESTOQUE(3, "Estoque"),
	MENOR_PRECO(4, "Menor preco");

	private final int value;
	private final String label;

	private BuscaOrdenacao(int value, String label) {
		this.value = value;
		this.label = label;
	}

	public int getValue() {
		return value;
	}
	
	public String getLabel() {
		return label;
	}

	@Override
	public String toString() {
		return label;
	}

}