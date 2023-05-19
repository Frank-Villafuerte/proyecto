public class Casteo{
	public static void main(String[] args){

		double decimal=5.213165;
		int entero=decimal;
		int entero2=4;
		double decimal2=entero;

		System.out.println(entero);//Devolverá 5, pues es el valor que puede representar el entero
		System.out.println(decimal2);//Nos dará 5, pero el tipo de dato sera double
	}
}
