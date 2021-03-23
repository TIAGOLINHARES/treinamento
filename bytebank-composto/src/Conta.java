

public class Conta {
	
	private double saldo;
	int agencia;
	int numeroConta;
	Cliente titular;
	
	
	void depositaValor(double valor) {
		
		this.saldo +=  valor;
		
	}
	
	public boolean saca(double valor) {
		
		if(this.saldo >= valor) {
			
			this.saldo = this.saldo - valor;
			return true;
		} else {
			
			return false;
		}
		
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if (this.saldo >= valor) {
			
			this.saldo -= valor;
			destino.depositaValor(valor);
			return true;
			
		} else {
			
			return false;	
			
			
		}
		
		
	}
	
	double pegaSaldo() {
	
	return this.saldo;
	}
}
