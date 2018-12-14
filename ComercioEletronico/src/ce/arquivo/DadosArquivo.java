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

    /**
     *
     * @return
     */
/**
 *
 * @author lud_y
 */
public class DadosArquivo {
    private int linha;
    private int coluna;
    private final String nomeProduto;
    private String descricao;
    private final double preco;
    private String categoria;

    public DadosArquivo(String nomeProduto, double preco, String categoria, String descricao) {
        this.nomeProduto = nomeProduto;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
    }

    public DadosArquivo(int linha, int coluna, String nomeProduto, double preco) {
        this.linha = linha;
        this.coluna = coluna;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
