package br.dojo.placas;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestePlacas {
	
	@Test
	public void comparandoPlacasIguais() {
		String placa1 = "AA-00-00";
		String placa2 = "AA-00-00";

		assertEquals(0, Placa.comparar(placa1,placa2));
	}
	
	@Test
	public void comparandoPlacasDiferenca1Numero() {
		
		String placa1 = "AA-00-00";		
		String placa2 = "AA-00-01";
		int valor = Placa.comparar(placa1,placa2);
		assertEquals(1, valor);
	}
	
	@Test
	public void comparandoPlacasDiferenca2Numero() {
		
		String placa1 = "AA-00-00";		
		String placa2 = "AA-00-02";
		int valor = Placa.comparar(placa1,placa2);
		assertEquals(2, valor);
	}
	
	@Test
	public void comparandoPlacasDiferencaNNumero() {
		String placa1 = "AA-00-00";		
		String placa2 = "AA-00-";
		
		for(int aux=0;aux<99;aux++){
			String novo = "";
			if(aux<10){
				novo=placa2+"0"+aux;
			} else {
				novo=placa2+aux;
			}
			int valor = Placa.comparar(placa1,novo);
			assertEquals(placa2+"-"+placa1,aux, valor);
		}
	}
	
	
	@Test
	public void comparandoPlacasDiferencaNNumeroInvertido() {
		String placa1 = "AA-00-00";		
		String placa2 = "AA-00-";
		
		for(int aux=0;aux<99;aux++){
			String novo = "";
			if(aux<10){
				novo=placa2+"0"+aux;
			} else {
				novo=placa2+aux;
			}
			int valor = Placa.comparar(novo,placa1);
			assertEquals(novo+" : "+placa1,aux, valor);
		}
	}
	
	@Test
	public void comparandoPlacasIguaisSegundaCasa() {
		String placa1 = "AA-00-99";
		String placa2 = "AA-00-99";

		assertEquals(0, Placa.comparar(placa1,placa2));
	}
	
	@Test
	public void comparandoPlacasDiferenca1NumeroSegundaCasa() {
		
		String placa1 = "AA-00-99";		
		String placa2 = "AA-01-00";
		int valor = Placa.comparar(placa1,placa2);
		assertEquals(1, valor);
	}

	@Test
	public void comparandoPlacasDiferenca2NumeroSegundaCasa() {
		
		String placa1 = "AA-00-99";		
		String placa2 = "AA-02-00"; //o meio anda de 100 em 100
		
		int valor = Placa.comparar(placa1,placa2);
		assertEquals(101, valor);
	}
	
	@Test
	public void comparandoPlacasDiferencaDaParteCentral() {
		String placa1 = "AA-00-00";		
		String placa2 = "AA-";
		
		for(int aux=0;aux<99;aux++){
			String novo = "";
			if(aux<10){
				novo=placa2+"0"+aux + "-00";
			} else {
				novo=placa2+aux + "-00";
			}
			int valor = Placa.comparar(novo,placa1);
			assertEquals(novo+" : "+placa1,100*aux, valor);
		}
	}
	
	@Test
	public void comparandoPlacasDiferencaDe0Ate9999() {
		String placa1 = "AA-00-00";		
		String placa2 = "AA-";
		
		for(int aux=0;aux<10000;aux++){
			String novo = "";
			if(aux<10){
				novo=placa2+"00-0"+aux;
			} else if(aux<100){
				novo=placa2+"00-"+aux;
			} else if(aux<1000){
				String strAux = String.valueOf(aux);
				novo=placa2+"0"+strAux.charAt(0)+"-"+strAux.substring(1,3);
			}else {
				String strAux = String.valueOf(aux);
				novo=placa2+strAux.substring(0,2)+"-"+strAux.substring(2,4);	
			}
			int valor = Placa.comparar(novo,placa1);
			assertEquals(novo+" : "+placa1,aux, valor);
		}
	}
	
	@Test
	public void incrementaLetrasDeAA_AteAB(){
		String letra1 = "AA";
		String letra2 = "AB";
		
		assertEquals(letra2, Placa.incrementaLetra(letra1));
	}
	
	@Test
	public void incrementaLetrasDeAB_AteAC(){
		String letra1 = "AB";
		String letra2 = "AC";
		
		assertEquals(letra2, Placa.incrementaLetra(letra1));
	}

	@Test
	public void incrementaLetrasDeAC_AteAD(){
		String letra1 = "AC";
		String letra2 = "AD";
		
		assertEquals(letra2, Placa.incrementaLetra(letra1));
	}
	
	@Test
	public void percorreAA_AteAZ(){
		String letra1 = "AA";
		String letra2 = "AZ";
		
		assertEquals(letra2, Placa.incrementaLetra(letra1));
	}
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
}
