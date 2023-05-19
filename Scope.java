public class Scope{
	public static void main (String[] args){
		//En este punto no se puede usar la variable "numero" porque aun no ha sido declarada
		int numero=8;
		//Aqui si se puede usar la variable
		System.out.println(numero);
		for(int i=0;i<10;i++){ //La variable "i" es exclusiva de la estructura for y no se puede usar fuera de las llaves.
			System.out.println(i);
		}
	}
	
}
