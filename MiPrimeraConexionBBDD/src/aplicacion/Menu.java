
/**
 * @author Mario
 * @version 1
 */

package aplicacion;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);
	String opciones;
	int opcionMenu;
	
	public int mostrarOpciones(String opciones) {
		String opcionesArray[]=opciones.split(",");
		boolean salir=true;
		do {
			for(int i=0;i<opcionesArray.length;i++) {
				System.out.println((1+i)+") "+opcionesArray[i]);
			}
			System.out.println((opcionesArray.length+1)+") Salir");
			opcionMenu = sc.nextInt();
			if(opcionMenu>opcionesArray.length+1) {
				System.out.println("Valor no válido");
			}else if (opcionMenu<=opcionesArray.length+1) {
				salir=false;
			}
		}while(salir);
		return opcionMenu;
	}
	
	
}
