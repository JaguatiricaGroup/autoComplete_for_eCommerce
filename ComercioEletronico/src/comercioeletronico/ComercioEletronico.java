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
//package comercioeletronico;
//
//
//import Trie.Categoria;
//import Trie.ArvoreTrie;
//import Trie.BackupTrie;
//import Trie.BuscaInsucesso;
//import Trie.NoProduto;
//import ce.tela.Interface;
//import java.util.List;
//import tela.trabalhoed22017;
//
//
///**
// *
// * @author venus
// */
//public class ComercioEletronico {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        Boolean salva = true; //mudar quando for rodar
//        if(salva){
//            ArvoreTrie arv = new ArvoreTrie();
//            leInstancia l = new leInstancia("dataset - lista de produtos.txt",arv);
//            
//            Produto p = new Produto("leticia", "p", "sadasd", 213);
////            Produto p1 = new Produto("luteciaaaa", "p", "sadasd", 213);
////            Produto p2 = new Produto("let", "pro", "sadasd", 213);        
////            Produto p3 = new Produto("leti", "pro", "sadasd", 213);        
//            Categoria c = new Categoria("letic");
////            Categoria c1 = new Categoria("leticiaaa");
////            Categoria c2 = new Categoria("leticia");
//            arv.insereProduto(p);        
//           arv.insereCategoria(c);
////            arv.insere(c1);
////            arv.insere(c2);
////            arv.insere(p1);
////            arv.insere(p2);  
////            arv.insere(p3);
//            BackupTrie backup = new BackupTrie();
//            backup.salvarEstado(arv);
////            arv.printArvoreProf();
//            arv.printCategorias();        
////            System.out.println(((NoProduto) arv.busca("leticia")).getProduto());
//        }else{
////        arv.insere(p2);  
//            BackupTrie backup = new BackupTrie();
//            ArvoreTrie arv = backup.lerEstado();
//            
//            //arv.printArvoreProf();
//            arv.printCategorias();   
//            
////            System.out.println("algo");
////            try {
////            List<Produto> volta = arv.sugestaoProduto("eletrodomestico");
////            //(volta.isEmpty())
////            //    System.out.println("nãoo existe nada parecido");
//////            else{
////                for(Produto p:volta)
////                System.out.println(p);
////            //}
////            }catch(BuscaInsucesso x)
////                    {
////                     System.out.println("busca inválida");
////                    }
//              System.out.println("alguma coisa");
//              
////            try{;
////                List<Categoria> retorno = arv.sugestaoCategoria("eletrodomesticos");
////                for(Categoria c:retorno){
////                System.out.println(c.getNome());
////                for (Produto listaP : c.getCategoria()) {
////                    System.out.println(listaP);
////                }
////            }
////            }catch(BuscaInsucesso w)
////                    {
////                     System.out.println("busca inválida");
////                    }
////                
////            //System.out.println(((Produto) arv.sugestaoProduto("leticia")).getProduto());
//        }
//        
//        // TODO code application logic here
////        Trie novo = new Trie();
////        Trie novo2 = null;
////        char produto[] = {'o','l','a'};
////        char produto2[] = {'o','l','a','r'};
////        char produto3[] = {'o','l','b'};
////        char produto4[] = {'a','l','o'};
////        char produto5[] = {'h','a','l','l','o'};
////        
////        char busca[] = {'o','l','a','e'};
////        char oi[] = {'e'};
////
////        novo2=novo.insercaoTrie(novo2, produto, 3);
////        novo2=novo.insercaoTrie(novo2, produto2, 4);
////        novo2=novo.insercaoTrie(novo2, produto3, 3);
////        novo2=novo.insercaoTrie(novo2, produto4, 3);
////        novo2=novo.insercaoTrie(novo2, produto5, 5);
////        novo.imprimeTrie(novo2);
////        novo.buscaTrie(novo2, produto2, 4);
//        //novo.removeTrie(novo2, produto, 3);
//        //novo.removeTrie(novo2, produto4, 3);
//        //novo.imprimeTrie(novo2);
////        System.out.println(novo.buscaTrie(novo2, busca, 4));
////        System.out.println(novo.buscaTrie(novo2, produto, 3));
////        System.out.println(novo.buscaTrie(novo2, produto3, 3));
////        novo2 = novo.removeTrie(novo2, produto3, 3);
////        System.out.println(novo.buscaTrie(novo2, produto3, 3));
//            
//        
//        //Apenas chama a tela principal e as funções a ela agregadas
//       java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new trabalhoed22017().setVisible(true);
//            }
//        });
//    }
//        }
//    
//}
