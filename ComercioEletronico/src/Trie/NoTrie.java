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

import java.io.Serializable;

/**
 *
 * @author venus
 */
public abstract class NoTrie implements Serializable{
    NoTrie [] Filhos;   

    public NoTrie() {
    }
    
    
    
    public NoTrie(int alfabeto) {
        this.Filhos = new NoTrie[alfabeto];
    }

    public NoTrie[] getFilhos() {
        return Filhos;
    }

    public void setFilhos(NoTrie[] Filhos) {
        this.Filhos = Filhos;
    }       
    
//    public String toString(){
//        return "No de uma trie";
//    }
}
