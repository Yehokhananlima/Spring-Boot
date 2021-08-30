package com.gen.Hello;
/*
 * Atividade 1 Spring-boot (minha primeira aplicação):
Crie uma aplicação spring de hello world.
A aplicação deverá conter um end-point que retorna
uma string com as habilidades e mentalidades que você
utilizou para realizar essa atividade.

Atividade 2 Spring-boot (minha segunda aplicação):
Crie uma aplicação spring de hello world.

A aplicação deverá conter um end-point que retorna
uma string com os seus objetivos de aprendizagem para
essa semana.
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class Bsms {
	
	@GetMapping("/Atividade1")
	public String Bsms() {
		return "Habilidades utilizadas nessa atividade: Proatividade, Atenção aos detalhes \n E as mentalidades: Orientação ao futuro";
	}
	
	@GetMapping("/Atividade2")
	public String objetivo() {
		return "Meus objetivos de aprendizagem para essa atividade foram rever minhas habilidades de orientação ao detalhe";
	}

}
