import java.util.Random;


public class Numeros{
	
	
	public static final String CYAN = "\u001B[36m";
	public static final String NEGRITA = "\u001B[1m";
	public static final String RESET = "\u001B[0m";
	
	public static void main  (String []args){
		Random s = new Random();
		
		
		// Primer Ejercicio
		//Muestra en consola los n´umeros del 1 al 10, usando un bucle do while
		
		int a = 1;
		
		System.out.println( CYAN + NEGRITA + "EL RESULTADO DEL EJERCICIO1:");
		do {
			System.out.print(a + ". " );
			a ++;
		
		} 
		while( a <= 10);
	

		
		
		// Segundo Ejercicio2
		//Muestra en consola la siguiente serie: 20 25 30 35 . . . 70 75 80, usando un bucle while
		int b = 20;
		
		System.out.println("\n\nEL RESULTADO DEL EJERCICIO2:");	
		while (b < 80){
		System.out.print(b + ". " );	
		b += 5;	//Cada vez va sumando 5 a i
			
		}
		
		//Ejercicio 3
		//Muestra en consola la siguiente serie: 100 98 96 94 . . . 56 54 52 50, usa un bucle for
		int c;
		System.out.println("\n\nEL RESULTADO DEL EJERCICIO3:");
		for ( c = 100; c >= 50; c -= 2){  //Resta 2 a x en cada turno hasta 50
			System.out.print( c + ". " );
		}
			
		
		
		//Ejercicio 4
		//Muestra la multiplicaci´on de los n´umeros enteros del 1 a N, siendo N un
		//n´umero entero generado aleatoriamente y comprendido 10, utiliza un bucle
		//do while. Ejemplo, si N vale 3, mostrar´ıa el resultado de multiplicar 1 x 2
		//x 3, es decir 6
		int aleatorio;
		aleatorio = s.nextInt(10);
		int d = 1;
		int bucle = 1;
		
		System.out.println("\n\nEL RESULTADO DEL EJERCICIO4:");
		do{
		d = d * bucle;
		bucle ++;
		}	
		while ( bucle <= aleatorio);
		
		System.out.print(d + ". \n");
	
		//Ejercicio 5
		//Muestra la suma de los cuadrados de los N primeros n´umeros naturales,
		//siendo N el n´umero obtenido antes de forma aleatoria, usa un bucle while.
		//Ejemplo, si N vale 3, mostrar´ıa el resultado de multiplicar 12 + 22 + 32
		//,es decir 14
		int e = 0;
		int f = 1;
		
		System.out.println("\nEL RESULTADO DEL EJERCICIO5:");
		while ( f <= aleatorio){
		e = e + (f * f);
		f ++;
		}
		System.out.println(e + ". \n");
	
	
	
		//Ejercicio 6
		//Muestra en consola independientemente la suma de los pares e impares
		//comprendidos entre 1 y N (N el nº aleatorio obtenido anteriormente). La
		//salida puede ser:
		//La suma de los n´umeros pares desde 0 a 8 vale 20
		//La suma de los n´umeros impares desde 0 a 8 vale 16
		//(Usa un bucle for )
		aleatorio = s.nextInt(10);
		int g = 0;
		int h = 0;
		int i = 0;
		
		
		for (g = 0 ; g <= aleatorio; g++){	
			if ( g %2 == 0){
				h = h + g;
				
			} 
			
			else{
				i = i + g;
				
			}		
		}
		System.out.println("EL RESULTADO DEL EJERCICIO6:");
		System.out.println("LA SUMA DE LOS PARES :" + h + ".");
		System.out.println("LA SUMA DE LOS IMPARES :" + i + "." + RESET);
		
		}
		
	}



