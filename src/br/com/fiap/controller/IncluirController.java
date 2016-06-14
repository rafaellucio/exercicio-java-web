package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IncluirController {

	@RequestMapping("/partialViews/incluir")
	public String iniciar() {
		return "partialViews/incluir";
	}
	
//	@RequestMapping(value = "/caduser", method = RequestMethod.POST)
//	public String incluir() {
//		
//	}
}
