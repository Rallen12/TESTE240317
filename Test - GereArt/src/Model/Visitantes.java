package Model;

public class Visitantes {
private int idObra;
private int idExposicao;
private int Visitantes;
public  double total,preco;

public Visitantes(int idObra,int idExposicao){
	super();
	this.idObra = idObra;
	this.idExposicao = idExposicao;
	

	
}
public Visitantes(int Visitantes,double preco){
	super();
	this.Visitantes = Visitantes;
	this.preco = preco;
	this.total = Visitantes * preco;
	

	
}
}
