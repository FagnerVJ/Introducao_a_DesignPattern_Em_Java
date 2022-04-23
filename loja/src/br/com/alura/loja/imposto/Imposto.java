package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);
}

//Esse padr�o de projeto Foi desenvolvido o padr�o de projeto Design Pattern Strategy

//Que no caso foi criado um interface que recebi calcular or�amento e � direcionado ara as outras classes
//de escolha