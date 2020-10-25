import java.util.Scanner;

public class Triangulo {
	
	public float A;
	public float B;
	public float C;
	public Scanner Leitura = new Scanner(System.in);
	
	
	
	public Triangulo(){
		Coletandodados();	
		Resolvendolados();	}
	
	
	
	public void Coletandodados() {
		
		System.out.println("Vamos descobrir se os lados informados foram um triangulo.");	
		
		System.out.println("Digite o primeiro valor:");
			A = Leitura.nextFloat();
			
		System.out.println("Digite o segundo valor:");
			B = Leitura.nextFloat();
			
		System.out.println("Digite o terceiro valor:");
			C = Leitura.nextFloat();
	}
		
		public void Resolvendolados() {
			
			if ((A+B) > C) {
				
				System.out.println("É um triangulo!");
			}	
			else
				System.out.println("Não é um triangulo!");
			
		}
	
		
	
}
