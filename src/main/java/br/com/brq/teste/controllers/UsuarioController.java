package br.com.brq.teste.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brq.teste.enteties.Usuario;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	@GetMapping
	public ResponseEntity<Usuario> teste(){
		
		Usuario u1 = new Usuario("Pedro Leal", 19, "pedroleal@brq.com");
		return ResponseEntity.ok().body(u1);
		
		
	}
	
	

}
