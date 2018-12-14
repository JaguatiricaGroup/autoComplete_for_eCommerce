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
package ce.arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Classe responsável pelo gerenciamento dos arquivos do sistema
 **/
public class Arquivo {

    private final String nome;

    private double tamanho;

    public Arquivo(String nome) {
        this.nome = nome;
    }
    
    public double getTamanho() {
        this.calculaTamanho();
        return tamanho;
    }

    private void calculaTamanho() {
        File f = new File(this.nome);
        this.tamanho = f.length();
    }

    /**
     * Realiza a leitura de um arquivo e retorna seu conteúdo
     *
     * @return
     */
    public String lerArquivo() {//FALTA TRATAR A MARCA DO TAB PRA IR PRA PRÓXIMA COLUNAs
        try {
            try (BufferedReader in = new BufferedReader(new FileReader(nome))) {
                String arquivo = "";
                while (in.ready()) {
                    arquivo += in.readLine() + "\n";//Aqui o proximo produto é lido
                }
                in.close();
                return arquivo;
            }
        } catch (FileNotFoundException ex) {
            System.err.println("O arquivo " + nome + " é inválido.");
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Não foi possível ler o arquivo: " + nome);
            System.err.println(ex.getMessage());
        }
        return null;

    }

    /**
     * Cria um arquivo com conteúdo de um texto
     *
     * @param conteudo Conteúdo que será escrito no arquivo
     */
    public void criarArquivo(String conteudo) {
        File arq = new File(nome);
        if (arq.exists()) {
            arq.delete();
        }
        try {
            arq.createNewFile();
            try (FileWriter fw = new FileWriter(arq, true); BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(conteudo);
            }

        } catch (IOException ex) {
            System.err.println("Erro na criação do arquivo.");
            System.err.println(ex.getMessage());
        }

    }

    public void criarArquivo(String[][] conteudo) {
        File arq = new File(nome);
        if (arq.exists()) {
            arq.delete();
        }
        try {
            arq.createNewFile();
            try (FileWriter fw = new FileWriter(arq, true); BufferedWriter bw = new BufferedWriter(fw)) {
                String c;
                for (String[] conteudo1 : conteudo) {
                    c = "";
                    for (String conteudo11 : conteudo1) {
                        c += conteudo11;
                    }
                    bw.write(c);
                    bw.newLine();
                }
            }

        } catch (IOException ex) {
            System.err.println("Erro na criação do arquivo.");
            System.err.println(ex.getMessage());
        }

    }

}
