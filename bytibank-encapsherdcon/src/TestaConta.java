
public class TestaConta {

	public static void main(String[] args) {
		
		
		ContaPoupanca cp = new ContaPoupanca(111, 111);
		cp.depositaValor(100);
		
		ContaCorrente cc = new ContaCorrente(222, 2222);
		cc.depositaValor(200);
		
		
		cc.transfere(0, cp);
		
		System.out.println("CP:" + cp.getSaldo());
		
		System.out.println("CC: " + cc.getSaldo());
		
		
		
		
		
		
		
		

	}

}
