package studies;

import java.util.Scanner;

public class start 
{

	public static void main(String[] args) 
	{
		Scanner keyboard =  new Scanner(System.in);
		System.out.println("Quantos soldados os 300 espartanos do ex�rcito de Leonidas ir�o enfrentar?");
		System.out.println("Digite seu palpite:");
		
		int guess = keyboard.nextInt();
		
		while(guess != 10000)
		{
			if (guess < 10000)
			{
				System.out.println("Um pouco mais...");
			}
			else
			{
				System.out.println("Um pouco menos");
			}
			
			System.out.println("Digite seu pr�ximo palpite:");
			guess = keyboard.nextInt();
		}
	
		System.out.println("Voc� acertou!");
	}
}
