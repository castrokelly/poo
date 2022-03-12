package study;

public class Count {
	int number;
	String holder;
	double balance;
	double limit;
	
	public Count(int number, String holder, double balance, double limit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.limit = limit;
	}

	boolean withdrawal(double value)
	{
		if(value > limit || value > balance || value <= 0)
		{
			return false;
		}
		
		balance -= value; //balance = balance - value;
		return true;
	}
	
	boolean deposit(double value)
	{
		if(value <= 0)
		{
			return false;
		}
		
		balance += value;
		return true;
	}
		
	void info()
	{
		System.out.println("Nome: " + holder);
		System.out.println("Número da conta: " + number);
		System.out.println("Saldo: " + balance);
		System.out.println("Limite: " + limit);
	}

}
