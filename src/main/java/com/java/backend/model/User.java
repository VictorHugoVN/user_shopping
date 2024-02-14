package com.java.backend.model;

import java.util.Date;

import com.java.backend.dto.UserDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private String telefone;
	private Date dataCadastro;
	
	public User() {
	}
	
	public User(String nome, String cpf, String endereco, String email, String telefone, Date dataCadastro) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setEmail(email);
		this.setTelefone(telefone);
		this.setDataCadastro(dataCadastro);
	}
	
	public long getId() {
		return this.id;
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
	
	public static User convert(UserDto userDto) {
		User user = new User();
		user.setNome(userDto.getNome());
		user.setCpf(userDto.getCpf());
		user.setEndereco(userDto.getEndereco());
		user.setEmail(userDto.getEmail());
		user.setTelefone(userDto.getTelefone());
		user.setDataCadastro(userDto.getDataCadastro());
		return user;
	}
	
	
	
}
