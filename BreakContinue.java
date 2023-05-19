public class BreakContinue{
	public static void main(String[] args){

		for(int i=0;i<10;i++){
	
			if(i==4){
				break;
			}
			System.out.println(i);
		}
		//Cuando i llegue a 4 no se imprimiran mas numeros gracias al break
		for(int i=0;i<10;i++){
			if(i==4){
				continue;
			}
			System.out.println(i);
		}
		//Cuando i llegue a 4 solo pasará de largo ese numero
	}
}
