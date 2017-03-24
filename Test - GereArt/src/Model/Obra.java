package Model;

public class Obra {
private String Artista;
private String Titulo;
private String Categoria;
private String Tipo;
private String Data;
private int id;

public Obra(String artista,String titulo,String categoria,String tipo,String data){
super();
Artista = artista;
Titulo = titulo;
Categoria = categoria;
Tipo = tipo;
Data = data;
}

public String getArtista() {
	return Artista;
}

public void setArtista(String artista) {
	Artista = artista;
}

public String getTitulo() {
	return Titulo;
}

public void setTitulo(String titulo) {
	Titulo = titulo;
}

public String getCategoria() {
	return Categoria;
}

public void setCategoria(String categoria) {
	Categoria = categoria;
}

public String getTipo() {
	return Tipo;
}

public void setTipo(String tipo) {
	Tipo = tipo;
}

public String getData() {
	return Data;
}

public void setData(String data) {
	Data = data;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}



}

