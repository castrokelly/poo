package study;

public class main {
	
	public static void main(String[] args)
	{
		Evaluation kelly = new Evaluation(7,4,10);
		
		System.out.println("Média Aritmética da Kelly: " + kelly.averageArithmetic());
		System.out.println("Média Ponderada da Kelly: " + kelly.averageWeighted());
	}

}
