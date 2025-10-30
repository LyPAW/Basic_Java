import java.util.Scanner;

public class calc{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido a la calculadora basica");
		System.out.println("Dame los valores para posteriorente hacer las operaciones");
		int valor;
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if ( a <= 10 && b <= 10){
			
			do{
				
			System.out.println("1.Sumar los valores\n2.Restar los valores\n3.Multiplicar los valores\n4.Dividir los valores\n5.Salir");
				
			valor = sc.nextInt();	
				
				
				
				switch (valor){
					case 1:
					System.out.println("La suma es de " + (a + b));
					break;
					case 2:
					System.out.println("La resta es de " + (a - b));
					break;
					case 3:
					System.out.println("La multlicacion es " + (a * b));
					break;
					case 4:
					System.out.println("La division es de " + (a / b));
					break;
					default:
					System.out.println("Dame otro valor");
					break;
				}
			} while (valor != 5);
			
			
			System.out.println("El programa ha terminado");
			
			
			
		} else{
			System.out.println("No me has dado valores de 1 a 10");
		}
		
		
		
	}
}