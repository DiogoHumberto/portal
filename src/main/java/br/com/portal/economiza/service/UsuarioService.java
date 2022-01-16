package br.com.portal.economiza.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.com.portal.economiza.controller.dto.UsuarioRegistrationDto;
import br.com.portal.economiza.entity.Usuario;

public interface UsuarioService extends UserDetailsService {
	
	Optional<Usuario> findById(Long id);
	
	List<Usuario> findAll();
	
	public Usuario save(UsuarioRegistrationDto registration);

}
