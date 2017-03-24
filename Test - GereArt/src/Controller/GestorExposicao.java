package Controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import Model.Exposicao;
import Model.Obra;
import Controller.*;

public class GestorExposicao {
	int[][] match = new int[100][100];
	Scanner sc = new Scanner(System.in);
	ArrayList <Exposicao> arExposicao;
	
	public GestorExposicao(){
		arExposicao = new ArrayList<Exposicao>();
		int opc = 0;
		do{
			
			System.out.printf("Opcoes\n");
			System.out.printf("1 - Inserir nova Exposicao\n");
			System.out.printf("2 - Listar Exposicoes\n");
			opc = sc.nextInt();
			switch(opc)
			{
				case 1:
					addExposicao();
					break;
				case 2:
					ListarExposicao();
					break;
				
				default:
					System.out.printf("Saindo...");
					break;
			}		
		}while(opc==1 || opc==2);
	
		
		
	}
	
	
	public void ListarExposicao(){
		
		for(int i=0;i<arExposicao.size();i++){
			
			
			
			System.out.printf("\n ID.....\n"+ arExposicao.get(i).getId());
			System.out.printf("\n NOME.....\n"+ arExposicao.get(i).getNome());
			System.out.printf("\n INI.....\n"+ arExposicao.get(i).getData_ini());
			System.out.printf("\n FIN.....\n"+ arExposicao.get(i).getData_fin());
			System.out.printf("\n Preco.....\n"+ arExposicao.get(i).getPreco());
			System.out.printf("\n Visitantes.....\n"+ arExposicao.get(i).getVisitantes());
				
			
				
				
			}
			
			
		}
		
	public void addExposicao(){
		
		String nome;
		String data_ini;
		String data_fin;
		Double preco;
		int visitantes;
		int id;
		
		sc.nextLine();
		System.out.printf("Insira o nome:");
		nome = sc.nextLine();
		System.out.printf("Insira a Data de inicio");
		data_ini = sc.nextLine();
		System.out.printf("Insira a Data de fim");
		data_fin = sc.nextLine();
		System.out.printf("Insira a Data de preco");
		preco = sc.nextDouble();
		System.out.printf("insira o numero de visitantes");
		visitantes = sc.nextInt();
		
		
id = arExposicao.size();
		
	Exposicao r = new Exposicao(nome,data_ini,data_fin,visitantes,preco);
		r.setId(id);
		arExposicao.add(r);
	}
	

	}
	

