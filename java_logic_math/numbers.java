import java.util.Scanner;


public class sei{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x;
	int z;
	int y = 0;

	
	System.out.println("Dime el numero de columnas");
	int ncolumna = sc.nextInt();
	System.out.println("Dime el numero total");
	int numeros = sc.nextInt();
	
	while (y < numeros){
	
	
		for (x = 0; x < ncolumna;x++){
	
			y++;
			System.out.print(y + " ");
	
			if (y == numeros) {
			break;
			}
		}
	
		System.out.println();	
	
	
	}
	
	}
}