package entidades;

import java.util.Date;

public class Empregado {
	
	private String nome;
	private String cpf;
	private Date dataNascimento;
	private Double salarioBase;
	
	public Empregado() {
	}

	public Empregado(String nome, String cpf, Date dataNascimento, Double salarioBase) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date DataNascimento) {
		this.dataNascimento = DataNascimento;
	}

	public Double getSalario() {
		return salarioBase;
	}

	public void setSalario(Double salario) {
		this.salarioBase = salario;
	}
	
}
