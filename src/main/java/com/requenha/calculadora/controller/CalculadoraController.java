package com.requenha.calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.requenha.calculadora.dto.CalculadoraRequisicao;
import com.requenha.calculadora.dto.CalculadoraResposta;
import com.requenha.calculadora.service.CalculadoraService;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	@Autowired
	private CalculadoraService calculadoraService;
	
	
	@PostMapping("/somar")
	public CalculadoraResposta somar (@RequestBody CalculadoraRequisicao requisicao) {
		return calculadoraService.somar(requisicao);
	}
	
	@PostMapping("/subtrair")
	public CalculadoraResposta subtrair(@RequestBody CalculadoraRequisicao requisicao) {
		return calculadoraService.subtrair(requisicao);
	}
	
	@PostMapping("/multiplicar")
	public CalculadoraResposta multiplicar(@RequestBody CalculadoraRequisicao requisicao) {
		return calculadoraService.multiplicar(requisicao);
	}
	
	@PostMapping("/dividir")
	public CalculadoraResposta dividir(@RequestBody CalculadoraRequisicao requisicao) {
		return calculadoraService.dividir(requisicao);
	}
}
