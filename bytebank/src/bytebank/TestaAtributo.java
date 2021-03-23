package bytebank;

public class TestaAtributo {

	public static void main(String[] args) {
		
		
		Conta contaTiago = new Conta();
		contaTiago.saldo = 1000;
		contaTiago.depositaValor(50);		
		System.out.println(contaTiago.saldo);
		
		boolean conseguiuSacar = contaTiago.saca(30);
		System.out.println(contaTiago.saldo);
		System.out.println(conseguiuSacar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.depositaValor(100);
		System.out.println(contaMarcela.saldo);
		
		boolean confirmaTranferencia = contaTiago.transfere(10000, contaMarcela);
		System.out.println(contaTiago.saldo);
		System.out.println(contaMarcela.saldo);
		System.out.println(confirmaTranferencia);
		
		
	}
	
	
}
