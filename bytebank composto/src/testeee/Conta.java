package testeee;



public class Conta {

	double saldo;
	int agencia;
	int numeroConta;
	String titular;
	
	
	
	void deposito(double valor) {
		
		this.saldo += valor;
		
	}
	
	boolean saque (double valor) {
		
		if(this.saldo >= valor) {
		
		this.saldo -= valor;
		return true;
	} else {
		
		return false;
		
	}
			}
	
	
	
	boolean transfere (double valor, Conta destino) {
		
		if(this.saldo >= valor){
			
			this.saldo -= valor;
			
			destino.deposito(valor);
			return true;
		} else {
			
			return false;
		}
		
		
	}
	
}
