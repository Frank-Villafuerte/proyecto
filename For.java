public class For{
	public static void main(String[] args){
		int[] numeros={1,2,3,4,5,6,7,8,9,10};

		for(int i=0;i<10;i++){ //En este caso la variable solo afecta dentro de la estructura, la condicion y el aumento se declaran en la misma linea.
			System.out.println("Aqui el valor del elemento "+(i+1)+ " es :" +numeros[i]);
		}
		for(int i:numeros){
			System.out.println(i);
		}
		//Ambas estructuras pasan por el contenido del array. La de abajo es llamada for-each e imprime todo el contenido de un array sin tener en cuenta su posicion.
	}
}


