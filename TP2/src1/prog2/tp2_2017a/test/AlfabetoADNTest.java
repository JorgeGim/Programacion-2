package prog2.tp2_2017a.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import prog2.tp2_2017a.AlfabetoADN;
import prog2.tp2_2017a.TrieChar;

public class AlfabetoADNTest 
{
	@Test
	public void obtenerADNtest()
	{
		AlfabetoADN alfabeto = new AlfabetoADN();
		TrieChar<String> diccionario = new TrieChar<String>(alfabeto);
		diccionario.agregar("ACG", "cromosoma");
		diccionario.agregar("AGT", "cromosoma2");
		assertEquals(diccionario.obtener("ACG"), "cromosoma");
	}
	
	@Test
	public void busquedaADNTest()
	{
		AlfabetoADN alfabeto = new AlfabetoADN();
		TrieChar<String> diccionario = new TrieChar<String>(alfabeto);
		
		diccionario.agregar("ACG", "cromosoma");
		diccionario.agregar("AGT", "cromosoma2");
		
		List<String> lista = new ArrayList<String>();
		lista = diccionario.busqueda("A");
		
		assertEquals(lista.get(0), "cromosoma");
		assertEquals(lista.get(1), "cromosoma2");
	}
}
