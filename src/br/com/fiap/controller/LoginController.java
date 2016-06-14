package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/partialViews/login")
	public String iniciar() {
		return "partialViews/login";
	}
}
