
public class TestaBanco {

	
	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Soares";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "Programador";
		
		Conta contadoPaulo = new Conta();
		contadoPaulo.depositaValor(100);
		
		
		System.out.println(contadoPaulo.saldo);
		
		contadoPaulo.titular = paulo; 
		
		System.out.println(contadoPaulo.titular.nome);
		
		
	}
	
	
	
}
