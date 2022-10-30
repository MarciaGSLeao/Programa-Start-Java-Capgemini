package aplicacao;

import entidades.Vendedor;

public class Programa02 {
	
	public static void main(String[] args) {
		
		Vendedor v01 = new Vendedor();
		v01.setNome("Raul");
		v01.setSalario(2599.80);
		v01.setTotalItensVendidos(10);
		v01.setComissaoPorItem(55.50);
		
		System.out.println(v01.calcularSalario());
	}

}
