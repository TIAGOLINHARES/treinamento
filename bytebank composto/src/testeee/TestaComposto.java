package testeee;

public class TestaComposto {
	
	public static void main(String[] args) {
	
		Conta contaDoFelipe = new Conta();
		contaDoFelipe.deposito(100);
		System.out.println(contaDoFelipe.saldo);
		
		Conta contaDaMaria = new Conta();
		
		contaDoFelipe.transfere(100, contaDaMaria);
		
		System.out.println(contaDoFelipe.saldo);
		System.out.println(contaDaMaria.saldo);
		
		
	}
	
	
}
 