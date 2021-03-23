
public class Diretor extends Funcionario {
	
	

	
	public double getBonificacao() {
		System.out.println("Bonus Diretor");
		return super.getSalario() * 13;
		

	

 }
}