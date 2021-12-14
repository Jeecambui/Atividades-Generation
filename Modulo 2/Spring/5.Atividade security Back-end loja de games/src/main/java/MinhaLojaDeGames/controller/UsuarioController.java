package MinhaLojaDeGames.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MinhaLojaDeGames.model.UsuarioLoginModel;
import MinhaLojaDeGames.model.UsuarioModel;
import MinhaLojaDeGames.repository.UsuarioRepository;
import MinhaLojaDeGames.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/all")
	public ResponseEntity <List<UsuarioModel>> getAll(){
		
		return ResponseEntity.ok(usuarioRepository.findAll());
		
	}
	
	@PostMapping("/logar")
	public ResponseEntity<UsuarioLoginModel> login(@RequestBody Optional<UsuarioLoginModel> user) 
	{
		return usuarioService.autenticarUsuario(user)
			.map(resposta -> ResponseEntity.ok(resposta))
			.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<UsuarioModel> postUsuario(@Valid @RequestBody UsuarioModel usuario) {

		return usuarioService.cadastrarUsuario(usuario)
			.map(resposta -> ResponseEntity.status(HttpStatus.CREATED).body(resposta))
			.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
	}

	@PutMapping("/atualizar")
	public ResponseEntity<UsuarioModel> putUsuario(@Valid @RequestBody UsuarioModel usuario) {
		return usuarioService.atualizarUsuario(usuario)
			.map(resposta -> ResponseEntity.status(HttpStatus.OK).body(resposta))
			.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}

}