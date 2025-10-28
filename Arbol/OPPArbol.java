import java.util.Scanner;


public class OPPArbol{
	
	//COLORES
	public static final String VERDE = "\u001B[42m"; //COLOR FONDO
	public static final String AMARILLOC = "\u001B[43m"; 
	public static final String VERDEC = "\u001B[32m"; //COLOR LETRA
	public static final String CYAN = "\u001B[36m";
	public static final String AMARILLO = "\u001B[33m";
	public static final String MORADO = "\u001B[35m";
	public static final String NEGRITA = "\u001B[1m";
	public static final String BLANCO = "\u001B[37m";
	public static final String RESET = "\u001B[0m";
	public static final String ROJO = "\u001B[31m";
	
	
	public static void main (String[] args)throws InterruptedException {
		
		//VARIABLES
		int linea = 0;
		int espacio = 0;
		int asterisco = 0;
		int fila = 0;
		int tronco = 0;
		int base = 0;
		boolean bucle = true;
		
		
		//SCANNER Y CLS
		Scanner sc = new Scanner(System.in);
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
			System.out.println("Hay un error");
		}
		
		//INTRODUCCION DE VALOR EN VARIABLE CON SCANNER
		System.out.print(CYAN + NEGRITA + "VAMOS A PINTAR UN ARBOL EN OPP\n" + RESET);
		Thread.sleep(1500);
			System.out.println(MORADO + NEGRITA + "DIME LA ALTURA DE LAS HOJAS" + RESET);
			int altura = sc.nextInt();
			System.out.println(MORADO + NEGRITA + "DIME EL GROSOR DEL TRONCO" + RESET);
			int grosor = sc.nextInt();
			System.out.println(MORADO + NEGRITA + "DIME EL LARGO DEL TRONCO" + RESET);
			int largoTronco = sc.nextInt();
			
		//LLAMADA A METODO RESULTADO PARA IMPRIMIR ARBOL
			arbol resultado = new arbol(altura,linea,espacio,asterisco,fila,tronco,base,1,grosor,largoTronco,bucle);
			arbol resultado2 = new arbol(altura,linea,espacio,asterisco,fila,tronco,base,3,grosor,largoTronco,bucle);
		
		//CLS DESPUES DE CADA ARBOL
		while (true){
		
			try{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			resultado.pintar();
			Thread.sleep(1500);
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			resultado2.pintar();
			Thread.sleep(1500);
			} catch (Exception e){
			System.out.println("Nada");
				}
			}
		}
}

class arbol{
	
	//COLORES
	public static final String VERDE = "\u001B[42m"; //COLOR FONDO
	public static final String AMARILLOC = "\u001B[43m"; 
	public static final String VERDEC = "\u001B[32m"; //COLOR LETRA
	public static final String CYAN = "\u001B[36m";
	public static final String AMARILLO = "\u001B[33m";
	public static final String MORADO = "\u001B[35m";
	public static final String NEGRITA = "\u001B[1m";
	public static final String BLANCO = "\u001B[37m";
	public static final String RESET = "\u001B[0m";
	public static final String ROJO = "\u001B[31m";
	
	//VARIABLES
	public int altura;
	public int linea;
	public int espacio;
	public int asterisco;
	public int fila;
	public int tronco;
	public int base;
	public int color;
	public int grosor;
	public int largoTronco;
	boolean bucle;
	
	//CLASE
	public arbol(int altura, int linea, int espacio, int asterisco, int fila, int tronco, int base, int color, int grosor, int largoTronco, boolean bucle){
		this.altura = altura;
		this.linea = linea;
		this.espacio = espacio;
		this.asterisco = asterisco;
		this.fila = fila;
		this.tronco = tronco;
		this.base = base;
		this.color = color;
		this.grosor = grosor;
		this.largoTronco = largoTronco;
		this.bucle = bucle;
	}

	//METODO PINTAR
public void pintar (){
            
			try {
                //HOJAS
                for (fila = 0; fila < altura; fila++) {

                    //ESPACIOS_HOJAS
                    for (espacio = 0; espacio < (altura - fila - 1); espacio++) {
                    System.out.print(" ");
                   }




                    //ASTERISCOS
                    for (asterisco = 0; asterisco < (fila * 2) + 1; asterisco++) {
                        if (fila == 0) {
                            System.out.print(" "); //PRIMERA HOJA DEL ARBOL
                        } else {
                            if (fila == 1) {
                                System.out.print(VERDEC + "▄" + RESET); //SEGUNDA HOJA DEL ARBOL
                            } else {
								if (fila == 2 || fila == 4 || fila == 6 || fila == 8) {
									System.out.print(VERDEC + "█" + RESET);
								} else {
									System.out.print(BLANCO + "█" + RESET);
								}
									
                            }

                        }
                    }




                    //SALTO DE LINEA
                    System.out.println("");

                }




                //TRONCO
                for (base = 0; base < largoTronco; base++) {

                    //ESPACIOS EN BLANCO_TRONCO
                    for (espacio = 0; espacio < ((altura * 2 - 1) / 2 - (grosor / 2)); espacio++) { //espacio0 altura-2
                        System.out.print(" ");
                    }



                    //BLOQUES TRONCO
                    for (tronco = 0; tronco < grosor; tronco++) {
					
						
						
						 //COLOR DEL TRONCO 1-2-3-4
                        switch (color) {
                            case 1:
                                System.out.print(AMARILLOC + ROJO + "|" + RESET);
                                break;

                            case 2:
                                System.out.print(AMARILLOC + AMARILLO + "|" + RESET);
                                break;

                            case 3:
                                System.out.print(AMARILLOC + CYAN + "|" + RESET);
                                break;

                            case 4:
                                System.out.print(AMARILLOC + MORADO + "|" + RESET);
                                break;
							default:
								System.out.print(AMARILLOC + AMARILLO + "|" + RESET);
								break;
                        }
                     
                    }

                    System.out.println("");		
					
	               }
				   
				   
            } catch (Exception e) {
				System.out.println("Error");
            }
			          	
}	
}
