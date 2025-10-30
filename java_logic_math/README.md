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

## 📌 Exercise 7:  

**Description:** This Java program takes a first name and last name as command-line arguments and prints a greeting message including double quotes. 

**Example output:**
java args.java John Doe

	public class doble{
		public static void main(String []args){
			int x;
		
			for (x = 0; x<args.length; x ++){
			System.out.println(args[x]);
			
			}
		
		
		}
	}
