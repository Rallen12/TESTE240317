package Model;

import java.util.ArrayList;



public class Exposicao {
private String Nome;
private String Data_ini;
private String Data_fin;
private String Obras;
	private int id;
	private int Visitantes;
	private double Preco;
	 ArrayList<Obra> arObra = new ArrayList<Obra>();
	private double Total;


	public Exposicao(String nome,String data_ini,String data_fin,int visitantes,double preco){
super();
Nome = nome;
Data_ini = data_ini;
Data_fin = data_fin;
Visitantes = visitantes;
Preco = preco;
}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getData_ini() {
		return Data_ini;
	}


	public void setData_ini(String data_ini) {
		Data_ini = data_ini;
	}


	public String getData_fin() {
		return Data_fin;
	}


	public void setData_fin(String data_fin) {
		Data_fin = data_fin;
	}


	public String getObras() {
		return Obras;
	}


	public void setObras(String obras) {
		Obras = obras;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getVisitantes() {
		return Visitantes;
	}


	public void setVisitantes(int visitantes) {
		Visitantes = visitantes;
	}


	public double getPreco() {
		return Preco;
	}


	public void setPreco(double preco) {
		Preco = preco;
	}


	public ArrayList<Obra> getArObra() {
		return arObra;
	}


	public void setArObra(ArrayList<Obra> arObra) {
		this.arObra = arObra;
	}


	public double getTotal() {
		return Total;
	}


	public void setTotal(double total) {
		
		this.Total = this.Visitantes * this.Preco;
	}


}