package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class WebControllerD4 {

	@GetMapping("/codificacion")
	public String showForm() {
		return "codificacion";
	}

	@PostMapping("/result")
	public String recibirPost(@RequestParam(name = "texto", required = false) String texto, HttpServletRequest request,
			Model model) {

		if (texto == null)
			texto = "(no se recibió nada)";

		model.addAttribute("texto", texto);

		return "result";
	}
}
