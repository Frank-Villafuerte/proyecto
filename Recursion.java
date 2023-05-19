public class Recursion{
	public static void main(String[] args){
		
		int numero=6;

		System.out.println(factorial(numero));
	}
	public static int factorial(int numero){
		
		if(numero>1){
			return(numero*factorial(numero-1)); //mientras el numero no sea 1, se seguirá multiplicado por uno menor a el, completando el producto que representa el factorial.
		}
		else{
			return 1;
		}

	}
}
