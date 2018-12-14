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

import Trie.Categoria;
import java.util.List;

/**
 *
 * @author user
 */
public class NoCategoria extends NoFim{
    private Categoria categoria ;// aponta para a categoria respectiva na trie

    public NoCategoria(Categoria categoria,int alfabeto){
        super(alfabeto);
        this.categoria = categoria;
        
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public NoTrie[] getFilhos() {
        return Filhos;
    }

    public void setFilhos(NoTrie[] Filhos) {
        this.Filhos = Filhos;
    }

    
    
    
    
}
