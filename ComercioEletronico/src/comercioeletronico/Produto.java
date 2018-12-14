/*
 * Universidade Federal de Juiz de Fora  - UFJF
 * Departamento de Ciência da Computação - DCC
 * Estrutura de Dados 2 - Prof. Vania Neves
 * Acadêmicos:
 *  Amanda Franck
 *  Leticia Pires
 *  Ludmila Yung
 *  Sergio Luiz Campos
 *  
 */
package comercioeletronico;

import java.io.Serializable;
import javax.print.DocFlavor;

/**
 *
 * @author ludmila
 */
public class Produto implements Serializable {
    private String nome;
    private String categoria;
    private String descricao;
    private float preco;

    public Produto(String nome, String categoria, String descricao, float preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public String toString(){
        String produtoAux;
        produtoAux = "Produto:"  +" "+ this.nome 
                + "\n" + "Categoria:"+" "+ this.categoria 
                + "\n" +"Descriçao:" +" "+ this.descricao
                + "\n" + "Preço:"+" "+ this.preco;                    
        return produtoAux;
    }

    
}

 