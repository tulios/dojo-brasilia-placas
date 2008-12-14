package br.dojo.placas;

public class Placa {

	public static int comparar(String placa1, String placa2) {
						
		if(placa1.equals(placa2)){
			return 0;
		}else{
			String[] s1 = placa1.split("-");
			String[] s2 = placa2.split("-");

			int num1 = Integer.parseInt(s1[1]+s1[2]);
			int num2 = Integer.parseInt(s2[1]+s2[2]);
									
			return Math.abs(num2 - num1);
		}
		
	}

	public static String incrementaLetra(String letra) {
		// TODO vai cícero!
		char palavra[] = letra.toCharArray();
		return String.valueOf(palavra[0])+String.valueOf(++palavra[1]);
		
		
		/*if(palavra[1]=='A')
			return "AB";
		else if(palavra[1]=='B')
			return "AC";
		else if(palavra[1]=='C')
			return "AD";
		
		return "";*/
			
	}

}
