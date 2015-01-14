package classes;


public class LookAndSay {

	public static StringBuilder say(String sequencia){
		
		char[] array;
		int i, j, k = 0, cont = 0;
		StringBuilder strBuilder = new StringBuilder();
		
		array = sequencia.toCharArray();
		
		for(i = 0; i < array.length; i++){
			for(j = k; j < array.length; j++){
				if(array[i] == array[j] && j == array.length-1 ){
					cont++;
					traduzNumero(cont,Integer.parseInt(Character.toString(array[i])), strBuilder);
					i = i + (cont - 1);
					k = k + cont;
					cont = 0;					
				}else if(array[i] == array[j] && j != array.length-1){
					cont++;
				}else{
					traduzNumero(cont,Integer.parseInt(Character.toString(array[i])), strBuilder);
					i = i + (cont - 1);
					k = k + cont;
					cont = 0;
					break;
				}
			}	
		}
		
		return strBuilder;
		
	}
	
	private static void traduzNumero(Integer quantidade, Integer numero, StringBuilder descricao){
		descricao.append("[");
		descricao.append(quantidade);
		descricao.append(numero);
		descricao.append("]");
	}
		
}
