package study;

public class main {

	public static void main(String[] args)
	{
		Count c1 = new Count(999, "Kelly", 2000, 500);
		
		c1.info();
		
		if(!c1.withdrawal(5000)) {
			System.out.println("Saldo indisponível.");
		}
		c1.deposit(500);
		System.out.println();
		c1.info();
		

	}

}
