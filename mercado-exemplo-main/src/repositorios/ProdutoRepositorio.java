package repositorios;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

import exemplo.Produto;

public class ProdutoRepositorio {
    Map<String, Produto> Produtos;
    
    public ProdutoRepositorio(){
        this.Produtos = new HashMap<String, Produto>();
    }

    public Collection<Produto> getAll(){
        return this.Produtos.values();
    }

    public Produto getProduto(String id){
        return this.Produtos.get(id);
    }


    public void delProdutos(String id){
        this.Produtos.remove(id);
    }

    public void editProduto(Produto produto){
        this.Produtos.replace(produto.getId(), produto);
    }

    public String addProduto(Produto produto){
        this.Produtos.put(produto.getId(), produto);
        return produto.getId();
    }


}
