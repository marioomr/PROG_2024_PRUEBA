package maquinaExpendedora;

import java.util.Scanner;


public class Start {

	public static void main(String[] args) {
		
	
		Scanner teclado = new Scanner(System.in);
	
		Maquina maquina = new Maquina();
		
		int opción = 1;
		
		while(opción!=0) {
			
			System.out.println("Dime que opción quieres hacer");
			System.out.println("");
			System.out.println("1- Establecer el producto 1");
			System.out.println("2- Establecer el producto 2");
			System.out.println("3- Establecer el producto 3");
			System.out.println("4- Consumir producto");
			System.out.println("10- Ver estado de la máquina");
			System.out.println("0- SALIR");
			System.out.println("");
			
			opción = teclado.nextInt();
			
			switch(opción) {
				
				case 1:
					System.out.println("Dime el nombre del producto");
					String nombre1 = teclado.next();
					System.out.println("Dime cuántos productos ponemos");
					int stock1 = teclado.nextInt();
					Producto producto1 = new Producto(nombre1,stock1);
					maquina.setProducto1(producto1.toString());
					break;
				
				case 2:
					System.out.println("Dime el nombre del producto");
					String nombre2 = teclado.next();
					System.out.println("Dime cuántos productos ponemos");
					int stock2 = teclado.nextInt();
					Producto producto2 = new Producto(nombre2,stock2);
					maquina.setProducto2(producto2.toString());
					break;
				
				case 3:
					System.out.println("Dime el nombre del producto");
					String nombre3 = teclado.next();
					System.out.println("Dime cuántos productos ponemos");
					int stock3 = teclado.nextInt();
					Producto producto3 = new Producto(nombre3,stock3);
					maquina.setProducto3(producto3.toString());
					break;
			
				case 4:
					
					int opcion2 = 1;
					
					while(opcion2 != 0) { 
						System.out.println("¿Qué producto deseas consumir?");
						System.out.println("1 - Producto 1");
						System.out.println("2 - Producto 2");
						System.out.println("3 - Producto 3");
						System.out.println("0 - SALIR");
						System.out.println("");
						
						opcion2 = teclado.nextInt();
						
						
							switch(opcion2) {
								case 1:
									System.out.println("¿Cuantas unidades quieres?");
									int consumo1 = teclado.nextInt();
									if (consumo1 < 5) {
										System.out.println("toma");
										System.out.println("");
										
									}
									break;
									
								case 2:
									System.out.println("¿Cuantas unidades quieres?");
									int consumo2 = teclado.nextInt();
									if (consumo2 < 5) {
										System.out.println("toma");
										System.out.println("");
											
									}
									break;	
									
								case 3:
									System.out.println("¿Cuantas unidades quieres?");
									int consumo3 = teclado.nextInt();
									if (consumo3 < 5) {
										System.out.println("toma");
										System.out.println("");
									}
									break;
									
								
									
						}
						
					}
					
					
					
				case 10:
					System.out.println(maquina.toString());
					System.out.println("");
					break;
		
			}
			
		}
		
		teclado.close();
		
		
		
		
	}

}
