
public class TestaEncaps {

	public static void main(String[] args) {
		
		Conta conta = new Conta(10,22);
		
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumeroConta());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo Soares");
		
		Cliente paulo2 = new Cliente();
		
		paulo.setNome("Paulo Soares2");
		
		
		Conta conta2 = new Conta(120,2222);
		
		
		
		System.out.println(Conta.getTotal());
		
		conta.setTitular(paulo);
		
		
		conta.getTitular().setProfissao("programador");
		 
		
		
		
		
		
		
	}		
	
	
	
}
