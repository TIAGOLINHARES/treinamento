
public class TestaContaVazia {

	public static void main(String[] args) {
		
		Conta contadaMarcela = new Conta();
		
		contadaMarcela.titular =  new Cliente();
		
		contadaMarcela.depositaValor(1000); 
		
		System.out.println(contadaMarcela.pegaSaldo());
		System.out.println(contadaMarcela.titular.nome);
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
