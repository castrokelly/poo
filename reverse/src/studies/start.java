package studies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class start {

	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<String>();
		Scanner keyboard = new Scanner(System.in);
		Object msg = null;
		Object String = msg;
		System.out.println("Digite quantos nomes quer inserir:");
		int qtd = keyboard.nextInt();
		
		System.out.println("Digite os nomes que quer inserir:");
		for(int i = 0; i < qtd; i++)
		{
			msg = keyboard.next();
			names.add((java.lang.String) msg);
		}
		
		System.out.println("Nomes em ordem:");
		/*for(String name : names)
		{
			System.out.println(name);
		}*/
		System.out.println(names);
		
		System.out.println("Nomes em ordem reversa:");
		Collections.reverse(names);
		System.out.println(names);
		/*System.out.println("Nomes em ordem inversa:");
		for(int i = qtd-1; i >= 0; i--)
		{
			System.out.println(names.get(i));
		}*/
	}
}
