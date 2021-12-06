package br.org.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Atividade 2 - Minha segunda aplicação Spring

@RestController
@RequestMapping("/hello") 
public class HelloController {
    
	@GetMapping
    public String helloWord() {

        return "Hello Word";
    }
}
