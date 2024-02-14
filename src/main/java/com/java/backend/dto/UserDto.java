package com.java.backend.dto;

import java.util.Date;

import com.java.backend.model.User;

public class UserDto {

	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private String telefone;
	private Date dataCadastro;
	
	public UserDto() {
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public Date getDataCadastro() {
		return this.dataCadastro;
	}
	
	public static UserDto convert(User user) {
		UserDto userDto = new UserDto();
		userDto.setNome(user.getNome());
		userDto.setCpf(user.getCpf());
		userDto.setEndereco(user.getEndereco());
		userDto.setEmail(user.getEmail());
		userDto.setTelefone(user.getTelefone());
		userDto.setDataCadastro(user.getDataCadastro());
		return userDto;
	}
	
	
	
}
