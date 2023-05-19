public class Sobrecarga{
	public static void main (String[] args){
		
		System.out.println(sumarElementos(11,26));
		System.out.println(sumarElementos("Palabra","Concatenada"));
	}
	public static int sumarElementos(int elemento1, int elemento2){ 
		
		return elemento1+elemento2;
	}
	public static String sumarElementos(String elemento1, String elemento2){

		return elemento1+" "+elemento2;
	}

	//Ambos metodos tienen el mismo nombre, pero usan diferente tipo de argumentos, y sus funcionen se acoplan al tipo de dato.
}
