package com.java.backend.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.backend.dto.UserDto;

import jakarta.annotation.PostConstruct;

@RestController
public class UserController {
	
	public static List<UserDto> usuarios = new ArrayList<UserDto>();
	
	@GetMapping("/")
	public String getMensagem() {
		return "Spring boot is working!";
	}
	
	@GetMapping("/users")
	public List<UserDto> getUsers(){
		return usuarios;
	}
	
	@GetMapping("users/{cpf}")
	public UserDto getUsersFiltro(@PathVariable String cpf) {
		for(UserDto userFilter: usuarios) {
			if(userFilter.getCpf().equals(cpf)) {
				return userFilter;
			}
		}
		return null;
	}
	
	@PostMapping("/newUser")
	public UserDto inserir(@RequestBody UserDto userDto) {
		userDto.setDataCadastro(new Date());
		usuarios.add(userDto);
		return userDto;
	}
	
	@DeleteMapping("/user/{cpf}")
	public boolean remover(@PathVariable String cpf) {
		for(UserDto user: usuarios) {
			if(user.getCpf().equals(cpf)) {
				usuarios.remove(user);
				return true;
			}
		}
		return false;
	}
	
	
	
	@PostConstruct
	//faz com que o método seja executado logo depois que o contêiner inicializa a classe UserController.
	public void initiateList() {
		UserDto userDto = new UserDto();
		userDto.setNome("Eduardo");
		userDto.setCpf("123");
		userDto.setEndereco("Rua a");
		userDto.setEmail("eduardo@email.com");
		userDto.setTelefone("1234-3454");
		userDto.setDataCadastro(new Date());
		
		UserDto userDto2 = new UserDto();
		userDto2.setNome("Luiz");
		userDto2.setCpf("456");
		userDto2.setEndereco("Rua b");
		userDto2.setEmail("luiz@email.com");
		userDto2.setTelefone("1234-3454");
		userDto2.setDataCadastro(new Date());
		
		UserDto userDto3 = new UserDto();
		userDto3.setNome("Bruna");
		userDto3.setCpf("678");
		userDto3.setEndereco("Rua c");
		userDto3.setEmail("bruna@email.com");
		userDto3.setTelefone("1234-3454");
		userDto3.setDataCadastro(new Date());
		
		usuarios.add(userDto);
		usuarios.add(userDto2);
		usuarios.add(userDto3);
				
	}
	
}
