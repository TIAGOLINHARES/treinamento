package br.com.dev;

public class Funcionario {

	private String Nome;
	private String Cpf;
	private double Salario;
	
	
	
	public double getBonificacao() {
		
		System.out.println("Bonus funcionario");
		return this.Salario + this.Salario * 0.1;
		
		
			
		
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	
	
	 
	
	
	
	
	
	
}
