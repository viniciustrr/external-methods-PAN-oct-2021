package br.com.pacote;

import java.lang.reflect.Method;

public class Programa {
	public static void main(String[] args) {
		try 
		{
			Object objetinho = Class.forName("br.com.pacote.Pessoa").newInstance();
			Method metodinho = objetinho.getClass().getDeclaredMethod("pegarNome", String.class);
			metodinho.setAccessible(true);
			String nome = (String) metodinho.invoke(objetinho,"");
			System.out.println(nome);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
