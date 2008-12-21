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
			
			int diferencaNumerica = Math.abs(num2 - num1);
			
			if (!s1[0].equals(s2[0])) {				
				return diferencaLetras(s2[0], s1[0])*10000 -
					   diferencaNumerica;
			}
									
			return diferencaNumerica;
		}
		
	}

	public static int diferencaLetras(String letra2, String letra1) {
		char a[] = letra1.toCharArray();
		int numLetra1 = (a[0]-'A'+1)*26+(a[1]-'A'+1);
		char b[] = letra2.toCharArray();
		int numLetra2 = (b[0]-'A'+1)*26+(b[1]-'A'+1);
		
		return numLetra2-numLetra1;
	}

	

}
