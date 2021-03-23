

public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numeroConta;
	private Cliente titular;
	private static int total;
	
	 
	
	public Conta(int agencia, int numeroConta) {
		Conta.total ++;
		if(agencia <=0) {
			System.out.println("Numero de agencia invalido");
		}else {
			this.agencia = agencia;
		}
			
		
		if(numeroConta <=0) {
			System.out.println("Numero de conta invalido"); 
		}else {
			this.numeroConta = numeroConta;
		}
		
		
	}
	
	
	
	public static int getTotal() {
		return Conta.total;
	}



	abstract void depositaValor(double valor);
	
	public boolean saca(double valor) {
		
		if(this.saldo >= valor) {
			
			this.saldo = this.saldo - valor;
			return true;
		} else {
			
			return false;
		}
		
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if (this.saca(valor)) {
			destino.depositaValor(valor);
			return true;
			
		} else {
			
			return false;	
			
			
		}
		
		
	}
	public int getAgencia(){
		return this.agencia;
		
		
	}
	
	
 	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	

	public double getSaldo() {
		return saldo;
	}






	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
}



