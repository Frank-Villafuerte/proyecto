public class Parametros{
	public static void main(String[] args){
		
		System.out.println(duplicar(4));//Agregando un parametro entregamos un dato al metodo, esta es la mejor manera de compartir datos.
		System.out.println(duplicar(2));
	}
	public static int duplicar(int numero){
		return numero*2;//la accion return permite entregar un dato despues de terminar el codigo, en este caso el numero ya duplicado.
	}
}
