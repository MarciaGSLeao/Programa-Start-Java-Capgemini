package exercises_lesson04.entities;

import java.util.Date;

public class Employee {
	
	private String name;
	private String cpf;
	private Date birthDate;
	private Double salary;
	
	public Employee() {
	}

	public Employee(String name, String cpf, Date birthDate, Double salary) {
		this.name = name;
		this.cpf = cpf;
		this.birthDate = birthDate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
