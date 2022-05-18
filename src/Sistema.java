import java.util.List;

import models.Lote;
import models.Produto;
import repositories.LoteRepository;
import repositories.ProdutoRepository;
import services.LoteService;
import services.ProdutoService;

public class Sistema {
	
	private static LoteRepository loteRep = new LoteRepository();
	private static ProdutoRepository prodRep = new ProdutoRepository();
	private static LoteService loteService = new LoteService(loteRep);
	private static ProdutoService prodService = new ProdutoService(loteRep, prodRep);
	 
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Leite", "Parmalat", 10.5);
		Produto p2 = new Produto("Leite integral", "Vale", 6.5);

		Lote l1 = new Lote(p1, 10L);
				
		// Adicionando produtos no cat�logo		
		prodService.addProduto(p1);
		prodService.addProduto(p2);
		
		// Adicionando lotes no cat�logo
		loteService.addLote(l1);
		
		// Consulta de produto "leite" no cat�logo de produto
		List<Produto> selection = prodService.listarProdByName("leite");
		System.out.println(selection);
		
		// Consulta de produto "leite" no cat�logo de produto com lotes no sistema
		List<Produto> selectionWithLote = prodService.listarProdsLoteByName("leite");
		System.out.println(selectionWithLote);
	}
}
