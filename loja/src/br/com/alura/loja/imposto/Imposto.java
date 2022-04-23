package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);
}

//Esse padrão de projeto Foi desenvolvido o padrão de projeto Design Pattern Strategy

//Que no caso foi criado um interface que recebi calcular orçamento e é direcionado ara as outras classes
//de escolha