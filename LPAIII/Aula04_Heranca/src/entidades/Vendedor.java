package entidades;

public class Vendedor extends Empregado{
	
	private int totalItensVendidos;
	private double comissaoPorItem;
	
	public Vendedor() {
		super();
	}

	public Vendedor(int totalItensVendidos, double comissaoPorItem) {
		super();
		this.totalItensVendidos = totalItensVendidos;
		this.comissaoPorItem = comissaoPorItem;
	}

	public int getTotalItensVendidos() {
		return totalItensVendidos;
	}

	public void setTotalItensVendidos(int totalItensVendidos) {
		this.totalItensVendidos = totalItensVendidos;
	}

	public double getComissaoPorItem() {
		return comissaoPorItem;
	}

	public void setComissaoPorItem(double comissaoPorItem) {
		this.comissaoPorItem = comissaoPorItem;
	}

	public double calcularSalario() {
		return super.getSalario() + (this.comissaoPorItem * this.totalItensVendidos);
	}
	
}
