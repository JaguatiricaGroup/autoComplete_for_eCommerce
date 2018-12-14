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
 * @author venus
 */
public class ArvoreTrie implements Serializable {
    NoTrie raiz;
    static int alfabeto = 26;
    //estrutura para melhor o acesso aos produtos de uma determinada categoria
    private List<Categoria> categorias;    
    

    public ArvoreTrie() {                       
            raiz = new NoNormal(alfabeto);  
            categorias = new LinkedList<>();
    }
            
    /**
     *
     * @param produto
     * Insere um produto na trie e adciona na lista em sua respectiva categoria
     */
    public void insereProduto(Produto produto){        
        NoTrie no = this.raiz;        
        int proxChar;
        for(int i= 0; i < produto.getNome().length()-1; i++){            
            proxChar = (produto.getNome().charAt(i) - 'a');
            if(no.Filhos[proxChar] == null){
                no.Filhos[proxChar] = new NoNormal(ArvoreTrie.alfabeto);                                
            }            
            no = no.Filhos[proxChar];            
        }               
        proxChar = produto.getNome().charAt(produto.getNome().length()-1) - 'a';        
        if(no.Filhos[proxChar] == null){//ainda nao existe
            no.Filhos[proxChar] = new NoProduto(produto,ArvoreTrie.alfabeto); 
            //tratar Categorias                    
            insereProdutoCategoria(produto);//coloca na estrutura de categoria
        }else{//ja esta na arvore
            if((no.Filhos[proxChar] instanceof NoProduto || no.Filhos[proxChar] instanceof NoCategoria)){
                System.out.println("Ja esta inserido");                
                ;
            }else{//Ja esta na trie mas nao marcada
                NoProduto aux = new NoProduto(produto,ArvoreTrie.alfabeto);
                aux.setFilhos(no.Filhos[proxChar].getFilhos());
                no.Filhos[proxChar] = aux;                        
                insereProdutoCategoria(produto);//coloca na estrutura de categoria
            }
        }        
    }       
    
    /**
     *
     * @param categoria
     * Insere Categoria na trie e adciona na lista de categorias
     */
    public void insereCategoria(Categoria categoria){
        NoTrie no = this.raiz;        
        int proxChar;
        for(int i= 0; i < categoria.getNome().length()-1; i++){            
            proxChar = (categoria.getNome().charAt(i) - 'a');
            if(no.Filhos[proxChar] == null){
                no.Filhos[proxChar] = new NoNormal(ArvoreTrie.alfabeto);                                
            }            
            no = no.Filhos[proxChar];            
        }               
        proxChar = categoria.getNome().charAt(categoria.getNome().length()-1) - 'a';        
        if(no.Filhos[proxChar] == null){//ainda nao existe
            no.Filhos[proxChar] = new NoCategoria(categoria,ArvoreTrie.alfabeto);                                   
            categorias.add(categoria);//coloca na estrutura de categorias
        }else{//ja esta na arvore
            if((no.Filhos[proxChar] instanceof NoProduto || no.Filhos[proxChar] instanceof NoCategoria)){
                System.out.println("Ja esta inserido");                
//;
            }else{//Ja esta na trie mas nao marcada
                NoCategoria aux = new NoCategoria(categoria,ArvoreTrie.alfabeto);
                aux.setFilhos(no.Filhos[proxChar].getFilhos());
                no.Filhos[proxChar] = aux;                        
                categorias.add(categoria);//coloca na estrutura de categorias
            }
        }        
    }       
    
    private void insereProdutoCategoria(Produto produto){//verificar se lista é o melhor;
//        System.out.println("vou inserir");   
        
        for(Categoria categoria: categorias){
            if(categoria.getNome().equals(produto.getCategoria())){
                categoria.insereProduto(produto);//a trie ja garante que nunca sera repetido
                return;
            }
        }
        Categoria nova = new Categoria(produto.getCategoria());        
//        categorias.add(nova);
        insereCategoria(nova);
        nova.insereProduto(produto);
    }

    /**
     *imprime estrutura de categorias
     */
    public void printCategorias(){
        for(Categoria categoria:categorias){
            System.out.println(categoria.getNome()+":");
            for (Produto produto : categoria.getCategoria()) {
                System.out.print(produto.getNome()+" ");
            }
            System.out.println("");
        }
    }
    
    /**
     *Imprime trie em largura
     */
    public void printArvore(){
        LinkedList<NoTrie> fila = new LinkedList<>();                
        fila.addFirst(this.raiz);
        while(!fila.isEmpty()){
            NoTrie atual = fila.getLast();
            fila.removeLast();
            for(int i = 0; i < alfabeto; i++){
                if( atual.Filhos[i] != null){                                        
                    System.out.print((char) (i+'a'));
                    fila.addFirst(atual.Filhos[i]);
                }                               
            }              
            System.out.println("");            
        }        
    }
    
    /**
     *Imprime trie em profundidade
     */
    public void printArvoreProf(){
        printArvoreProf(raiz);
    }
    
    private void printArvoreProf(NoTrie aux){             
        if(aux != null){            
            for(int i = 0; i < alfabeto; i++){
                if( aux.Filhos[i] != null){        
                    if(aux.Filhos[i] instanceof NoProduto || aux.Filhos[i] instanceof NoCategoria){
                        System.out.print("["+(char) (i+'a')+"]");                         
                    }else{
                        System.out.print((char) (i+'a'));                          
                    }
                    printArvoreProf(aux.Filhos[i]);                    
                }                               
            }                                   
        }    
        System.out.println("");   
    }
    
    private NoTrie busca(String chave){
        NoTrie aux = this.raiz;
        for (int i = 0; i < chave.length(); i++) {            
            int proxChar = (chave.charAt(i) - 'a');
            if(aux.Filhos != null && aux.Filhos[proxChar] != null)
                aux = aux.Filhos[proxChar];      
            else
                return null;
        }
//        if(aux instanceof NoProduto || aux instanceof NoCategoria){
            return aux;
//        }else{
//            return null;
//        }
    }
    
    /**
     *
     * @param prefixo
     * @return
     * retorna uma lista com todas as possiveis sugestoes de produto que tenham o
     * prefixo dado
     */
    public List<Produto> retornaTodosProdutos(String prefixo){ 
        NoTrie aux = busca(prefixo);//ultimo elemento busca  
        List<Produto> lista = new LinkedList<Produto>();        
        retornaTodosProdutos(aux, lista);
        return lista;
    }
    
    private void retornaTodosProdutos(NoTrie aux, List<Produto> lista){
        
        if(aux != null){
            if(aux instanceof NoProduto){
                lista.add(((NoProduto) aux).getProduto());//coloca na lista o produto
            }
            for(int i=0;i<alfabeto;i++)
            {
                if(aux.Filhos[i] != null){
                    retornaTodosProdutos(aux.Filhos[i], lista);
                }
            }           
        }
    }
    
    /**
     *
     * @param prefixo
     * @return
     * retorna uma lista com todas as possiveis sugestoes de categoria que tenham o
     * prefixo dado
     */
    public List<Categoria> retornaTodosCategorias(String prefixo){
        NoTrie aux = busca(prefixo);//ultimo elemento busca
        List<Categoria> lista = new LinkedList<Categoria>();  
        retornaTodosCategorias(aux, lista);
        return lista;
    }
    
    private void retornaTodosCategorias(NoTrie aux, List<Categoria> lista){        
        if(aux != null){
            if(aux instanceof NoCategoria){
                lista.add(((NoCategoria) aux).getCategoria());//coloca na lista o produto
            }
            for(int i=0;i<alfabeto;i++)
            {
                if(aux.Filhos[i] != null){
                    retornaTodosCategorias(aux.Filhos[i], lista);
                }
            }           
        }
    }
    
    /**
           
     * @param p
     * @return
     * @throws BuscaInsucesso
     */
    public List<Produto> sugestaoProduto(String p) throws BuscaInsucesso {
      for(int i=p.length(); i>=1; i-=0.1*i){ //taxa de diminuição da string, evita fazer todas as buscas
          List<Produto> aux = retornaTodosProdutos(p.substring(0, i));
          if(!aux.isEmpty())
              return aux;            
          
      }
      
      BuscaInsucesso w = new BuscaInsucesso("Não existe nomes que iniciam com este caracter, tente outra vez");
              throw w;
 
          
 } 
  
    public List<Categoria> sugestaoCategoria(String p)throws BuscaInsucesso{
      for(int i=p.length(); i>=1; i-=i*0.10){ //taxa de diminuição da string, evita fazer todas as buscas
          List<Categoria> aux = retornaTodosCategorias(p.substring(0, i)); 
          if(!aux.isEmpty())
              return aux;
      }
       BuscaInsucesso w = new BuscaInsucesso("Não existe nomes que iniciam com este caracter, tente outra vez");
              throw w;
          
        
          
    }   
}
