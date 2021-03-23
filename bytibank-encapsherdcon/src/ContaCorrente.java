
public class ContaCorrente extends Conta {
	
	
	public ContaCorrente(int agencia, int numeroConta) {
		super(agencia, numeroConta);
	}
	
	
	@Override
	public boolean saca(double valor) {
		double valorSacar = valor + 0.20;	
		return super.saca(valorSacar);
	}
	
	@Override
	public void depositaValor(double valor) {

		super.saldo = super.saldo + valor;
		
		
	}
}
 