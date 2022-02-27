package studies;

import java.util.Scanner;

public class start {

	public static void main(String[] args)
	{
		System.out.println("Por favor, digite seu peso atual (em Kg): ");
		Scanner keyboard = new Scanner(System.in);
		
		float mass = keyboard.nextFloat();
		
		System.out.println("Ótimo, agora digite sua altura (em metros):");
		
		float stature = keyboard.nextFloat();
		
		float bmi = mass / (stature * stature);
		
		System.out.printf("Seu IMC é: %.2f", + bmi);
		System.out.println("");
		
		if (bmi < 18.5)
			System.out.println("De acordo com a OMS seu IMC indica magreza");
		
		if (bmi >= 18.5 && bmi < 24.9)
			System.out.println("De acordo com a OMS seu IMC é normal");
		
		if (bmi >= 24.9 && bmi <= 30)
			System.out.println("De acordo com a OMS seu IMC indica sobrepeso");
		
		if (bmi > 30)
			System.out.println("De acordo com a OMS seu IMC indica obesidade");
		
	}

}
