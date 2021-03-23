
public class ContaPoupanca extends Conta {

	
	
	public ContaPoupanca(int agencia, int numeroConta) {
		super(agencia, numeroConta);
		

			
			
		}
		
		@Override
		void depositaValor(double valor) {
			super.saldo = super.saldo + valor;
			
		}
		
	}
	
	

