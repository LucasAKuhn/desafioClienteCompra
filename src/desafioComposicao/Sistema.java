package desafioComposicao;

public class Sistema {

	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 10, 100);
		compra1.adicionarItem(new Produto("Notebook", 2000.00), 2);
		
		Compra compra2 = new Compra();
		compra1.adicionarItem("Caderno", 10, 10);
		compra1.adicionarItem(new Produto("Impressora", 1000.00), 1);

		Cliente cliente = new Cliente("lucas Alan Kuhn");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}
}
