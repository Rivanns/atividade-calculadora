package com.requenha.calculadora.service;

import org.springframework.stereotype.Service;

import com.requenha.calculadora.dto.CalculadoraRequisicao;
import com.requenha.calculadora.dto.CalculadoraResposta;

@Service
public class CalculadoraService {
	
	public CalculadoraResposta somar(CalculadoraRequisicao requisicao) {
		double resultado = requisicao.getNumero1() + requisicao.getNumero2();
		return new CalculadoraResposta(requisicao.getNumero1(), requisicao.getNumero2(), "Soma", resultado);
	}
	
	public CalculadoraResposta subtrair(CalculadoraRequisicao requisicao) {
		double resultado = requisicao.getNumero1() - requisicao.getNumero2();
		return new CalculadoraResposta(requisicao.getNumero1(), requisicao.getNumero2(), "Subtração", resultado);
	}
	
	public
}
