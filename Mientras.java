public class Mientras{
	public static void main(String[] args){

		int inicio=0;
		while (inicio<10){
			System.out.println("Esta es la pasada numero "+(inicio+1));
			inicio++;
		}

		do{
			System.out.println("Esta se ejecuta aunque la condicional no cumpla, porque la verificacion es despues de la impresion");
		}
		while(inicio<0);
	}
}

