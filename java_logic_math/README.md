# Logic and Math Exercises in Java

This folder contains **Java exercises** focused on **loops (`for`, `while`, `do-while`)** and basic operations with integers.  
These exercises are ideal for practicing logic, control flow, and arithmetic in Java.

---

## 📌 Exercise 1: Numbers from 1 to 10 (`do-while` loop)

**Description:** Print numbers from 1 to 10 in the console using a `do-while` loop.  

**Example output:**
1.
2.
3.
4.
5.
6.
7.
8.
9.
10.

    	int a = 1;
		
		System.out.println("RESULT1:");
		do {
			System.out.print(a + ". " );
			a ++;
		} 
		while( a <= 10);




## 📌 Exercise 2: Series 20, 25, 30 … 80 (`while loop`)

**Description:** Print the following series in the console using a while loop.

**Example output:**
20.
25.
30.
35.
...
80.

    	int b = 20;
		
		System.out.println("RESULT2:");	
		while (b < 80){
		System.out.print(b + ". " );	
		b += 5;		
		}

## 📌 Exercise 3: Series 100, 98, 96 … 50 (`for loop`)

**Description:** Print the decreasing series from 100 to 50, decrementing by 2, using a for loop.

**Example output:**
100.
98.
96.
94.
...
50.

    	int c;

		System.out.println("RESULT3:");
		for ( c = 100; c >= 50; c -= 2){
			System.out.print( c + ". " );
		}

## 📌 Exercise 4: Multiplication from 1 to N (`do-while loop`)

**Description:** Generate a random integer N between 1 and 10, and calculate the product of all integers from 1 to N.

**Example output:**
1 x 2 x 3 = 6

    	int aleatorio;
		aleatorio = s.nextInt(10);
		int d = 1;
		int bucle = 1;
		
		System.out.println("RESULT4:");
		do{
		d = d * bucle;
		bucle ++;
		}	
		while ( bucle <= aleatorio);
		
		System.out.print(d + ". \n");

## 📌 Exercise 5: Sum of squares of first N natural numbers (`while loop`)

**Description:** Using the same N from the previous exercise, calculate the sum of squares from 1 to N.

**Example output:**
1^2 + 2^2 + 3^2 = 14

   		int e = 0;
		int f = 1;
		
		System.out.println("RESULT5:");
		while ( f <= aleatorio){
		e = e + (f * f);
		f ++;
		}
		System.out.println(e + ". \n");

## 📌 Exercise 6: Sum of even and odd numbers from 1 to N (`for loop`)

**Description:** Using the same N, calculate separately the sum of even and odd numbers from 1 to N.

**Example output:**

Sum of even numbers from 0 to N = X.

Sum of odd numbers from 0 to N = X.

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
		System.out.println("Sum of even numbers from 0 to N :" + h + ".");
		System.out.println("Sum of odd numbers from 0 to N :" + i + ".");

## 📌 Exercise 7: Command-Line Greeting Program in Java  

**Description:** This Java program takes a first name and last name as command-line arguments and prints a greeting message including double quotes. 

**Example output:**
java args.java John Doe
"John"
"Doe"


	public class doble{
		public static void main(String []args){
			int x;

			for (x = 0; x<args.length; x ++){
			System.out.println("\"" + args[x] + "\"");
			}
		}
	}


## 📌 Exercise 8: Integer Calculator with Menu Using Scanner in Java  

**Description:** Read the official Java documentation and learn how to read integer numbers from standard input using the Scanner class. Based on this, create a program that:

Prompts the user to enter two integer numbers between 1 and 10, inclusive.

If the numbers are outside this range, the program should terminate showing a message like this (example values):

The values 3 and 13 cannot be processed.


If the numbers are valid, the program should display the following menu using a do-while loop:

	1) Add the two values
	2) Subtract the two values
	3) Multiply the two values
	4) Divide the two values
	5) Exit
	Choose an option [1-5]:


Program requirements:

The menu should keep showing until the user selects option 5 to exit.

If the user enters a value outside 1-5, the menu should repeat.

Each operation (options 1-4) should display the result in the console. Example for addition:

5 + 3 = 8


All operations are performed with integer numbers.

When the user selects option 5, the program should display a message indicating that it has ended.

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


## 📌 Exercise 9: Number Grid Printer in Java  

**Description:** Create a Java program that asks the user for a number and the number of columns, then prints the numbers from 1 up to the entered number, formatted into the specified number of columns with right-aligned numbers.

	Enter number of columns:
	3
	Enter a number:
	15
	1   2   3
	4   5   6
	7   8   9
	10  11  12
	13  14  15

	Enter number of columns:
	7
	Enter a number:
	100
 	1   2   3   4   5   6   7
 	8   9  10  11  12  13  14
	15  16  17  18  19  20  21
	22  23  24  25  26  27  28
	29  30  31  32  33  34  35
	36  37  38  39  40  41  42
	43  44  45  46  47  48  49
	50  51  52  53  54  55  56
	57  58  59  60  61  62  63
	64  65  66  67  68  69  70
	71  72  73  74  75  76  77
	78  79  80  81  82  83  84
	85  86  87  88  89  90  91
	92  93  94  95  96  97  98
	99 100
Program requirements:

The program should take two inputs: the total number and the number of columns.

It should print all numbers from 1 to the entered number.

Numbers must be right-aligned in each column.

The output should properly wrap to the next line after reaching the specified number of columns.

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
