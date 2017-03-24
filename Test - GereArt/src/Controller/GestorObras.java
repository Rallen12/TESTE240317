package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Obra;

public class GestorObras {

	Scanner sc = new Scanner(System.in);
	ArrayList <Obra> arObra ;

	public GestorObras(){
		
		
		arObra = new ArrayList<Obra>();
		int opc=0;
		do{
			System.out.printf("inserir Obra \n");
			System.out.printf("listar Obra \n");
			opc = sc.nextInt();
			
			switch(opc){
			case 1:
				addObra();
				break;
			case 2:
				ListarObra();
				break;
				
				default: System.out.printf("Exiting");
				break;
			}
			
			
		}while(opc==1 || opc==2);
	}

public void ListarObra(){
	
	for(int i=0;i<arObra.size();i++){
		
		
			
			System.out.printf("\n ID.....%d", arObra.get(i).getId());
			System.out.printf("\n Artista.....%s", arObra.get(i).getArtista());
			System.out.printf("\n Categoria.....%s", arObra.get(i).getCategoria());
			System.out.printf("\n Data.....%s", arObra.get(i).getData());
			System.out.printf("\n Tipo.....%s", arObra.get(i).getTipo());
			System.out.printf("\n Title.....%s \n", arObra.get(i).getTitulo());
		
		
	}
	
}

public void addObra(){
	 String artista;
	 String titulo;
	 String categoria;
	 String tipo;
	 String data;
	 int id;
	 
	 
	 
	 sc.nextLine();
	 System.out.printf("Introduza o nome do Artista : \n");
	 artista = sc.nextLine();
	 System.out.printf("Introduza o titulos da obra \n");
	 titulo = sc.nextLine();
	 System.out.printf(" Introduza a categoria\n");
	 categoria = sc.nextLine();
	 System.out.printf("Introduza o tipo\n");
	 tipo = sc.nextLine();
	 System.out.printf("Introduza a data de realizacao\n");
	 data = sc.nextLine();
	 Obra c = new Obra(artista,titulo,categoria,tipo,data);
	 id = arObra.size();
			 
	
	c.setId(id);
	arObra.add(c);
	
}
	
}
