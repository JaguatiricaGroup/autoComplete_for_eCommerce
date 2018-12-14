///*
// * Universidade Federal de Juiz de Fora  - UFJF
// * Departamento de Ciência da Computação - DCC
// * Estrutura de Dados 2 - Prof. Vania Neves
// * Acadêmicos:
// *  Amanda Franck
// *  Leticia Pires
// *  Ludmila Yung
// *  Sergio Luiz Campos
// *  
// */
package Trie;

import Trie.NoFim;
import comercioeletronico.Produto;

/**
 *
 * @author user
 */
public class NoProduto extends NoFim{
    private Produto produto;
    
    public NoProduto(Produto p, int alfabeto) {
        super(alfabeto);
        this.produto = p;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public NoTrie[] getFilhos() {
        return Filhos;
    }

    public void setFilhos(NoTrie[] Filhos) {
        this.Filhos = Filhos;
    }

    
    
    
    
}
