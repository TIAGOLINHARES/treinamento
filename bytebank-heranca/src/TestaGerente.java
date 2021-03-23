
public class TestaGerente {

	public static void main(String[] args) {
		
		
		Gerente g1 = new Gerente();
		g1.setSalario(2500);
				
		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		
		Diretor d1 = new Diretor();
		d1.setSalario(7000);
		
		ControlaBonificacao controle = new ControlaBonificacao();
		
		//controle.registra(g1);
		controle.registra(f1);
		controle.registra(d1);
		
		
		
		System.out.println(controle.getSoma());
		
		
		
		
		
		

	}

}
