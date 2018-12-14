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

import comercioeletronico.Produto;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author user
 */
public class Categoria implements Serializable {
    private List<Produto> categoria;
    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
        this.categoria = new LinkedList<>();
    }
    
    public void insereProduto(Produto p){
        categoria.add(p);
    }      
    
    public void deleteProduto(Produto p){
        categoria.remove(p);
            
    }      

    public List<Produto> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Produto> categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
