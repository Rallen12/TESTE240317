package Application;

import java.util.Scanner;

import Controller.GestorExposicao;
import Controller.GestorObras;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
			// TODO Auto-generated method stub
			int opc=0;

			do
			{
				System.out.printf("\n Opcoes: \n");
				System.out.printf("1 - Gerir Obras \n");
				System.out.printf("2 - Gerir Exposicoes \n");
				System.out.printf("3 - Sair                 \n");
				opc = sc.nextInt();
				
				switch(opc)
				{
				case 1:
					new GestorObras();
					break;
				case 2:
					new GestorExposicao();
					break;
				default:
					break;
				}
			}while(opc!=3);
		}
		

	

}
