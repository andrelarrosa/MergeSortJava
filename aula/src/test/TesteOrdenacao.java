package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import aula.OrdenaVetor;

public class TesteOrdenacao {
	
	@Rule
	public ExpectedException excecaoEsperada = ExpectedException.none();
	
	@Test()
	public void numeroDeElementosNegativo() {
		excecaoEsperada.expect(IndexOutOfBoundsException.class);
		excecaoEsperada.expectMessage("Tamanho inválido para um vetor");
		
		int n = -1;
		int elementos[] = {};
		OrdenaVetor.sort(n, elementos);
	}
	
	@Test()
	public void numeroDeElementosInformadoDiferenteDoVetor() {
		excecaoEsperada.expect(IndexOutOfBoundsException.class);
		excecaoEsperada.expectMessage("Número de elementos divergente do informado");
		
		int n = 10;
		int elementos[] = {};
		OrdenaVetor.sort(n, elementos);
	}
	
	@Test()
	public void elementosDoVetorOrdenados() {
		// Entrada esperada
		int n = 5;
		int elementos[] = {1,2,3,4,5};
		
		// Saída esperada		
		int saidaEsperada[] = {1,2,3,4,5};
		assertArrayEquals(elementos, OrdenaVetor.sort(n, elementos));
	}
	
	@Test()
	public void elementosDoVetorDesordenados() {
		// Entrada esperada
		int n = 5;
		int elementos[] = {1,5,3,4,2};
		
		// Saída esperada		
		int saidaEsperada[] = {1,2,3,4,5};
		assertArrayEquals(elementos, OrdenaVetor.sort(n, elementos));
	}
	
	@Test()
	public void elementosDoVetorDecrescente() {
		// Entrada esperada
		int n = 5;
		int elementos[] = {5,4,3,2,1};
		
		// Saída esperada		
		int saidaEsperada[] = {1,2,3,4,5};
		assertArrayEquals(elementos, OrdenaVetor.sort(n, elementos));
	}
}
