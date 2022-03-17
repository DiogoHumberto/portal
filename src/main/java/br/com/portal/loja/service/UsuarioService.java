package br.com.portal.loja.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.com.portal.loja.controller.dto.UsuarioRegistrationDto;
import br.com.portal.loja.entity.Usuario;

public interface UsuarioService extends UserDetailsService {
	
	Optional<Usuario> findById(Long id);
	
	List<Usuario> findAll();
	
	public Usuario save(UsuarioRegistrationDto registration);

}
