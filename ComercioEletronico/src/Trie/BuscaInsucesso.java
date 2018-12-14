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

/**
 *
 * @author venus
 */
public class BuscaInsucesso extends Exception {

    /**
     * Creates a new instance of <code>BuscaInsucesso</code> without detail
     * message.
     */
    public BuscaInsucesso() {
    }

    /**
     * Constructs an instance of <code>BuscaInsucesso</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public BuscaInsucesso(String msg) {
        super(msg);
    }
}
