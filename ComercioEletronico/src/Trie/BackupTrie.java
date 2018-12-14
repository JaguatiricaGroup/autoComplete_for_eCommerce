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
 * @author user
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabrieldias
 */
public class BackupTrie implements Serializable{
    
    /**
     *
     * @param arv
     * Salva o estado da trie em um arquivo "Backup.ac"
     */
    public void salvarEstado(ArvoreTrie arv ) {
        FileOutputStream f_out = null;
        try {
            // Write to disk with FileOutputStream
            f_out = new 
                FileOutputStream("Backup.ac");
            // Write object with ObjectOutputStream
            ObjectOutputStream obj_out = new
                ObjectOutputStream (f_out);
            // Write object out to disk
            obj_out.writeObject ( arv );
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArvoreTrie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArvoreTrie.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                f_out.close();
            } catch (IOException ex) {
                Logger.getLogger(ArvoreTrie.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
     *
     * @return
     * le Trie de um arquivo "Backup.ac"
     */
    public ArvoreTrie lerEstado() {
        // Read from disk using FileInputStream
        try {
            FileInputStream f_in = new FileInputStream("Backup.ac");
            ObjectInputStream obj_in = new ObjectInputStream (f_in);
            ArvoreTrie obj = (ArvoreTrie) obj_in.readObject();            
            return obj;
        } catch (FileNotFoundException e) {
            System.out.println("nao achei o arquivo");
            return new ArvoreTrie();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ArvoreTrie.class.getName()).log(Level.SEVERE, null, ex);
        }            
        return new ArvoreTrie();
    }
}