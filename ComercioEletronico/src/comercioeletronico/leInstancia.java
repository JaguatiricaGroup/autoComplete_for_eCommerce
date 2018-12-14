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
package comercioeletronico;


import Trie.ArvoreTrie;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author venus
 */
public class leInstancia {
    private File arquivo;
    private Scanner leArquivo;
    
    public leInstancia(String nomeArquivo, Trie.ArvoreTrie trie){
        arquivo = new File(nomeArquivo);
        try {
            leArquivo = new Scanner(arquivo);
        } catch (FileNotFoundException ex) {
            System.err.println("arquivo nao existe");
            return ;
        }
        while (leArquivo.hasNextLine()) {             
            String linhaAux = leArquivo.nextLine();
            guardaProdutos(linhaAux,trie);
//            System.out.println(linhaAux);
        }
        
        
    }
    public List<Produto> guardaProdutos(String linha, ArvoreTrie trie){
        String l[]= linha.split(",");
//        l[1]=l[1].trim();
        l[1] = l[1].replaceAll(" ", "");
        l[1]=l[1].toLowerCase();
        
        Produto aux = new Produto(l[0], l[1], l[2], Float.valueOf(l[3]));
//        System.out.println(aux);
        trie.insereProduto(aux);
        return null;
    }    
    
}
