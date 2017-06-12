package prog2.tp2_2017a.test;

import static org.junit.Assert.*;

import org.junit.Test;

import prog2.tp2_2017a.Digitos;
import prog2.tp2_2017a.TrieChar;

public class EqualsTest {

	@Test
	public void triesIguales()
	{
		TrieChar<String> libros = new TrieChar<String>(new Digitos());
		libros.agregar("34325235242", "Harry Potter");
		libros.agregar("54542355322", "El señor de los anillos");
		libros.agregar("74584723785", "Narnia");
		libros.agregar("49745843837", "La saga de los confines");
		
		TrieChar<String> libros2 = new TrieChar<String>(new Digitos());
		libros2.agregar("34325235242", "Harry Potter");
		libros2.agregar("54542355322", "El señor de los anillos");
		libros2.agregar("74584723785", "Narnia");
		libros2.agregar("49745843837", "La saga de los confines");
		
		assertTrue(libros.equals(libros2));
	}
	
	@Test
	public void triesDiferentesPorClaves()
	{
		TrieChar<String> libros = new TrieChar<String>(new Digitos());
		libros.agregar("34325235242", "Harry Potter");
		libros.agregar("54542355322", "El señor de los anillos");
		libros.agregar("74584723785", "Narnia");
		libros.agregar("49745843837", "La saga de los confines");
		
		TrieChar<String> libros2 = new TrieChar<String>(new Digitos());
		libros2.agregar("34325235542", "Harry Potter");
		libros2.agregar("54542455322", "El señor de los anillos");
		libros2.agregar("74581723785", "Narnia");
		libros2.agregar("49743843837", "La saga de los confines");
		
		assertFalse(libros.equals(libros2));
	}
	
	@Test
	public void triesDiferentesPorValor()
	{
		TrieChar<String> libros = new TrieChar<String>(new Digitos());
		libros.agregar("34325235242", "Harry Potter");
		libros.agregar("54542355322", "El señor de los anillos");
		libros.agregar("74584723785", "Narnia");
		libros.agregar("49745843837", "La saga de los confines");
		
		
		TrieChar<String> libros2 = new TrieChar<String>(new Digitos());
		libros2.agregar("34325235242", "Don quijote");
		libros2.agregar("54542355322", "El señor de los anillos");
		libros2.agregar("74584723785", "Narnia");
		libros2.agregar("49745843837", "Romeo y Julieta");
		
		assertFalse(libros.equals(libros2));
	}
	
	@Test
	public void triesDiferentes()
	{
		TrieChar<String> libros = new TrieChar<String>(new Digitos());
		libros.agregar("34325235242", "Harry Potter");
		libros.agregar("54542355322", "El señor de los anillos");
		libros.agregar("74584723785", "Narnia");
		libros.agregar("49745843837", "La saga de los confines");
		
		TrieChar<String> libros2 = new TrieChar<String>(new Digitos());
		libros2.agregar("32325235242", "El informe pelicano");
		libros2.agregar("56542355322", "Detectives en Bariloche");
		libros2.agregar("74588723785", "Detectives en Recoleta");
		libros2.agregar("49745843037", "Los arboles mueren de pie");
		
		assertFalse(libros.equals(libros2));
	}
}
