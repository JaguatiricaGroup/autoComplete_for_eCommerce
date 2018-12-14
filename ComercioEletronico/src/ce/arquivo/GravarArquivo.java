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
package ce.arquivo;

import Trie.Categoria;
import comercioeletronico.Produto;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author Amanda
 */
public class GravarArquivo {

    public GravarArquivo() {
        
    }
    
    public void gravarArquivoProduto(List lista, String NomePasta) throws IOException{
        int i;
        //File file = new File("Resultados\\"+NomePasta);
        File file = new File("Resultados//"+NomePasta);
        file.mkdir();
        //try (FileWriter arq = new FileWriter("Resultados\\"+NomePasta+"\\Arquivo"+numero+".txt", true)){
        try (FileWriter arq = new FileWriter(NomePasta+".txt", true)){
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf("-------------------------------%n");
            for(i=0; i<lista.size(); i++){
                gravarArq.printf(((Produto)lista.get(i)).getNome() + " %n");
            }            
            gravarArq.printf("-------------------------------%n");
        }
       // System.out.printf("\nArquivo "+ numero +" do "+ NomePasta +" gravado com sucesso!\n");
    }
       public void gravarArquivoCat(List lista, String NomePasta) throws IOException{
        int i, j;
        //File file = new File("Resultados\\"+NomePasta);
        File file = new File("Resultados//"+NomePasta);
        file.mkdir();
        //try (FileWriter arq = new FileWriter("Resultados\\"+NomePasta+"\\Arquivo"+numero+".txt", true)){
        try (FileWriter arq = new FileWriter(NomePasta+".txt", true)){
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf("-------------------------------%n");
            for(i=0; i<lista.size(); i++){
                for(j=0; j< ((Categoria) lista.get(i)).getCategoria().size(); j++){
                    gravarArq.printf(((Categoria)lista.get(i) ).getCategoria().get(j)+ " %n");
                }
                
            }            
            gravarArq.printf("-------------------------------%n");
        }
       // System.out.printf("\nArquivo "+ numero +" do "+ NomePasta +" gravado com sucesso!\n");
    }
       
       public void gravarArquivoPreco(List lista, String NomePasta) throws IOException{
        int i;
        //File file = new File("Resultados\\"+NomePasta);
        File file = new File("Resultados//"+NomePasta);
        file.mkdir();
        //try (FileWriter arq = new FileWriter("Resultados\\"+NomePasta+"\\Arquivo"+numero+".txt", true)){
        try (FileWriter arq = new FileWriter(NomePasta+".txt", true)){
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf("-------------------------------%n");
            for(i=0; i<lista.size(); i++){
                gravarArq.printf(((Produto)lista.get(i)).getPreco()+ " %n");
            }            
            gravarArq.printf("-------------------------------%n");
        }
       // System.out.printf("\nArquivo "+ numero +" do "+ NomePasta +" gravado com sucesso!\n");
    }
   
}
