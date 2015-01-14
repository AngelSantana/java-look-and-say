package main;

import java.util.Scanner;

import classes.LookAndSay;

public class Main {

	public static void main(String[] args) {
		String sequencia;
		Scanner leitor = new Scanner(System.in);
		try{
			System.out.println("Digite a sequência:");
			sequencia = leitor.next();			
			System.out.println(LookAndSay.say(sequencia));
		}catch(Exception ex){
			System.out.println(String.format("Ocorreu o erro: %s", ex.getMessage()));
		}finally{
			leitor.close();
		}
	}

}
