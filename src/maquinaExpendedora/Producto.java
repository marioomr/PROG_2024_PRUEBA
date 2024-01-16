package maquinaExpendedora;

public class Producto {

	private String nombre;
	private int stock;
	private int consumo;
	
	public String toString() {
		return "[ "+nombre+" -> "+stock+" ]";
	}
	
	
	
	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	public Producto (String newNombre, int newStock) {
		this.nombre = newNombre;
		this.stock = newStock;
	}
	
	
	
}
