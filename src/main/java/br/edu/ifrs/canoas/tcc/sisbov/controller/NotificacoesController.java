package br.edu.ifrs.canoas.tcc.sisbov.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class NotificacoesController {

	@RequestMapping("/notificacoes")
	public String notificacoes() {
		return "notificacoes";
	}
}
