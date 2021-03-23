package bytebank;

public class CriarConta {
		public static void main(String[] args) {
			
			Conta primeiraConta = new Conta();
			
			primeiraConta.saldo = 200;
			
			System.out.println("Saldo da conta é " + primeiraConta.saldo);
			
			primeiraConta.saldo +=  100;
			
			System.out.println("Saldo atual da conta é " + primeiraConta.saldo);
			
						
			
			Conta segundaConta = primeiraConta;
			
			if(primeiraConta == segundaConta) {
				
				System.out.println("Contas iguais");
			}else {
				System.out.println("Contas diferentes");
			}
			
			
		}
}
