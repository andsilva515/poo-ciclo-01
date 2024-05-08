package unidade_1;

//declaracao da classe
public class Guitarra {
	
	private String numeroSerie, fabricante, modelo, tipo, madeira;
	private double preco;
	
	//Criação do construtor da classe Guitarra
	public Guitarra(
			String numeroSerie, String, fabricante,
			String modelo, String tipo,
			String madeira, double preco) {
	  this.numeroSerie = numeroSerie;
	  this.fabricante = fabricante;
	  this.modelo = modelo;
	  this.tipo = tipo;
	this.madeira = madeira;
	this.preco = preco;		
}
public String getNumeroSerie() {
	return numeroSerie;
}
public void setNumeroSerie(String numeroSerie) {
	this.numeroSerie = numeroSerie;
}

}
