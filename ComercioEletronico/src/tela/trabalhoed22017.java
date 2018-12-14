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
package tela;

import java.util.*;
import ce.arquivo.*;
import comercioeletronico.*;
import Trie.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;
import org.omg.PortableServer.LifespanPolicy;

/**
 *
 * @author amanda
 */
public class trabalhoed22017 extends javax.swing.JFrame {

    /**
     * Cria Nova Interface
     */
    public trabalhoed22017() {
        //inicializa os componentes da interface
        initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NomeInserido = new javax.swing.JTextField();
        CategoriaInserida = new javax.swing.JTextField();
        PrecoInserido = new javax.swing.JTextField();
        DescricaoInserida = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SenhaDigitada = new javax.swing.JTextField();
        BInserirProduto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        SugestaoBusca = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        BBuscar = new javax.swing.JButton();
        OrganizarPrecoMais = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaResultados = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        RelatorioPor = new javax.swing.JComboBox<>();
        BFecharJanela = new javax.swing.JButton();
        OrganizarPrecoMenos = new javax.swing.JButton();
        BuscaProdutoUsuario = new javax.swing.JRadioButton();
        BuscaCategoriaUsuario = new javax.swing.JRadioButton();
        BuscaUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(38, 147, 115));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fornecer Dados de um Novo Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 1, 14))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(736, 136));

        jLabel1.setFont(new java.awt.Font("Bitstream Charter", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Bitstream Charter", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Categoria:");

        jLabel3.setFont(new java.awt.Font("Bitstream Charter", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Preço:");

        jLabel4.setFont(new java.awt.Font("Bitstream Charter", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Descrição:");

        NomeInserido.setFont(new java.awt.Font("Bitstream Charter", 0, 12)); // NOI18N
        NomeInserido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NomeInserido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeInseridoActionPerformed(evt);
            }
        });

        CategoriaInserida.setFont(new java.awt.Font("Bitstream Charter", 0, 12)); // NOI18N
        CategoriaInserida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        PrecoInserido.setFont(new java.awt.Font("Bitstream Charter", 0, 12)); // NOI18N
        PrecoInserido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        DescricaoInserida.setFont(new java.awt.Font("Bitstream Charter", 0, 12)); // NOI18N
        DescricaoInserida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Bitstream Charter", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Senha Adm:");

        SenhaDigitada.setFont(new java.awt.Font("Bitstream Charter", 0, 12)); // NOI18N
        SenhaDigitada.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BInserirProduto.setFont(new java.awt.Font("Bitstream Charter", 0, 12)); // NOI18N
        BInserirProduto.setText("Inserir Produto");
        BInserirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomeInserido, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SenhaDigitada, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CategoriaInserida, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(BInserirProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrecoInserido, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DescricaoInserida, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(NomeInserido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoriaInserida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecoInserido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescricaoInserida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(SenhaDigitada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BInserirProduto))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(38, 147, 115));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 1, 14))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Bitstream Charter", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sugestões de Busca:");

        SugestaoBusca.setFont(new java.awt.Font("Bitstream Charter", 0, 12)); // NOI18N
        SugestaoBusca.setToolTipText("");
        SugestaoBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SugestaoBuscaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SugestaoBuscaMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SugestaoBuscaMouseClicked(evt);
            }
        });
        SugestaoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SugestaoBuscaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bitstream Charter", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Resultados:");

        BBuscar.setFont(new java.awt.Font("Bitstream Charter", 0, 12)); // NOI18N
        BBuscar.setText("Buscar");
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });

        OrganizarPrecoMais.setFont(new java.awt.Font("Bitstream Charter", 0, 12)); // NOI18N
        OrganizarPrecoMais.setText("Organizar por Preço(Crescente)");
        OrganizarPrecoMais.setActionCommand("Organizar por Preço (Crescente)");
        OrganizarPrecoMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizarPrecoMaisActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ListaResultados);

        jLabel10.setFont(new java.awt.Font("Bitstream Charter", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Gerar Relatório de Produtos Por:");

        RelatorioPor.setFont(new java.awt.Font("Bitstream Charter", 0, 12)); // NOI18N
        RelatorioPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Categoria", "Preço" }));
        RelatorioPor.setToolTipText("");
        RelatorioPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioPorActionPerformed(evt);
            }
        });

        BFecharJanela.setFont(new java.awt.Font("Bitstream Charter", 0, 12)); // NOI18N
        BFecharJanela.setText("Fechar Programa");
        BFecharJanela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFecharJanelaActionPerformed(evt);
            }
        });

        OrganizarPrecoMenos.setFont(new java.awt.Font("Bitstream Charter", 0, 12)); // NOI18N
        OrganizarPrecoMenos.setText("Organizar por Preço(Decrescente)");
        OrganizarPrecoMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizarPrecoMenosActionPerformed(evt);
            }
        });

        buttonGroup1.add(BuscaProdutoUsuario);
        BuscaProdutoUsuario.setSelected(true);
        BuscaProdutoUsuario.setText("Produto");
        BuscaProdutoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaProdutoUsuarioActionPerformed(evt);
            }
        });

        buttonGroup1.add(BuscaCategoriaUsuario);
        BuscaCategoriaUsuario.setText("Categoria");
        BuscaCategoriaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaCategoriaUsuarioActionPerformed(evt);
            }
        });

        BuscaUsuario.setFont(new java.awt.Font("Bitstream Charter", 0, 12)); // NOI18N
        BuscaUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BuscaUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BuscaUsuarioFocusGained(evt);
            }
        });
        BuscaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaUsuarioActionPerformed(evt);
            }
        });
        BuscaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BuscaUsuarioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RelatorioPor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BFecharJanela)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BuscaProdutoUsuario)
                        .addGap(30, 30, 30)
                        .addComponent(BuscaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscar)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SugestaoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BuscaCategoriaUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OrganizarPrecoMais)
                    .addComponent(OrganizarPrecoMenos))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(153, 153, 153))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BBuscar)
                            .addComponent(jLabel8)
                            .addComponent(SugestaoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscaProdutoUsuario)
                            .addComponent(BuscaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscaCategoriaUsuario)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(OrganizarPrecoMais)
                                .addGap(18, 18, 18)
                                .addComponent(OrganizarPrecoMenos)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(RelatorioPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BFecharJanela, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BInserirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirProdutoActionPerformed
        //BOTAO PARA O ADMINISTRADOR INSERIR PRODUTO
        String senha = "1234";
        int contaCerto = 0;
        //se a senha digitada tiver o mesmo comprimento da senha
        //faz a verificação se a senha digitada esta correta ou nao
        //caso esteja, executa o inserir
        if (SenhaDigitada.getText().length() == senha.length()) {
            for (int i = 0; i < SenhaDigitada.getText().length(); i++) {
                //verifica se a posicao da palavra digitada é igual a da senha
                if (SenhaDigitada.getText().charAt(i) == senha.charAt(i)) {
                    contaCerto++;
                }
            }
            if (contaCerto == senha.length()) {
                String nome = NomeInserido.getText();
                String categ = CategoriaInserida.getText();
                String descricao = DescricaoInserida.getText();
                float preco = Float.parseFloat(PrecoInserido.getText());
                Trie.Categoria categoria = new Trie.Categoria(categ);
                comercioeletronico.Produto produto = new comercioeletronico.Produto(nome, categ, descricao, preco);
                arv.insereProduto(produto);
                arv.insereCategoria(categoria);
            }
        }

    }//GEN-LAST:event_BInserirProdutoActionPerformed

    private void BFecharJanelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharJanelaActionPerformed
        // BOTÃO PARA FECHAR A JANELA DA INTERFACE E SAIR DO PROGRAMA
        System.exit(0);
    }//GEN-LAST:event_BFecharJanelaActionPerformed

    private void BuscaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaUsuarioActionPerformed

    }//GEN-LAST:event_BuscaUsuarioActionPerformed

    private void SugestaoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SugestaoBuscaActionPerformed
       //pega a palavra em foco
        if(SugestaoBusca.hasFocus()){
            //escreve na caixa de texto da busca
            BuscaUsuario.setText(SugestaoBusca.getItemAt(SugestaoBusca.getSelectedIndex()));
            //remove as sugestões após escolher uma
            SugestaoBusca.removeAllItems();
       }
    }//GEN-LAST:event_SugestaoBuscaActionPerformed

    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed
        // BOTAO BUSCAR PRODUTO OU CATEGORIA PELO USUARIO
        int i,j;
        DefaultListModel model = new DefaultListModel();
        listapreco = new LinkedList();
        //verifica qual opcao foi selecionada, entre categoria e produto e escreve todos os resultados encontrados
        if (BuscaCategoriaUsuario.isSelected()) {
            List listaC = null;
            try {
                listaC = arv.sugestaoCategoria(BuscaUsuario.getText());
                for (i = 0; i < listaC.size(); i++) {
                    for(j=0; j< ((Categoria) listaC.get(i)).getCategoria().size(); j++){
                        ListaResultados.setVisibleRowCount(((Categoria) listaC.get(i)).getCategoria().size());
                        model.addElement(((Categoria) listaC.get(i)).getCategoria().get(j));
                    }
                }
                ListaResultados.setModel(model);
            } catch (Exception ex) {
            }

        } else if (BuscaProdutoUsuario.isSelected()) {
            List listaP = new ArrayList();
            try {
                listaP = arv.sugestaoProduto(BuscaUsuario.getText());
                for (i = 0; i < listaP.size(); i++) {
                    
                    model.addElement(((Produto) listaP.get(i)).getNome()+" - R$"+ ((Produto) listaP.get(i)).getPreco());
                    listapreco.add(((Produto) listaP.get(i)));
                    organizarProduto();
                }
                ListaResultados.setModel(model);
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_BBuscarActionPerformed

    private void BuscaProdutoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaProdutoUsuarioActionPerformed

    }//GEN-LAST:event_BuscaProdutoUsuarioActionPerformed

    private void BuscaCategoriaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaCategoriaUsuarioActionPerformed

    }//GEN-LAST:event_BuscaCategoriaUsuarioActionPerformed

    private void OrganizarPrecoMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizarPrecoMaisActionPerformed
        //organiza por preço em ordem crescente
        DefaultListModel model = new DefaultListModel();    
        for(int i=0; i<listapreco.size(); i++){
            model.addElement(((Produto) listapreco.get(i)).getNome()+" - R$"+ ((Produto) listapreco.get(i)).getPreco());
        }
        ListaResultados.setModel(model);   
    }//GEN-LAST:event_OrganizarPrecoMaisActionPerformed

private void organizarProduto(){
    //organiza o preco por ordem crescente utilizando bubble sort
    int  i;
    float aux;
    boolean flag = true;
    while(flag){
                   flag = false;
       for(i=0; i<listapreco.size(); i++){
           if(i+1 != listapreco.size()){
               if(((Produto) listapreco.get(i)).getPreco()<((Produto) listapreco.get(i+1)).getPreco()){
                   aux = ((Produto) listapreco.get(i)).getPreco();
                   listapreco.add(i, ((Produto) listapreco.get(i+1)).getPreco());
                   listapreco.add(i+1, aux);
                   flag = true;
               }
           }
       }
   }
}


    
    private void BuscaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscaUsuarioKeyPressed
       //enquanto o usuario vai digitando, ele vai mostrando as sugestoes de busca
        int i;
        DefaultListModel model = new DefaultListModel();
        if (BuscaCategoriaUsuario.isSelected()) {
            List listaC = null;
            try {
                listaC = arv.sugestaoCategoria(BuscaUsuario.getText());
                SugestaoBusca.removeAllItems();
                for (i = 0; i < listaC.size(); i++) {
                    SugestaoBusca.addItem(((Categoria) listaC.get(i)).getNome());
                }
            } catch (Exception ex) {
                SugestaoBusca.removeAllItems();
            }

        } else if (BuscaProdutoUsuario.isSelected()) {
            List listaP = new ArrayList();
            try {
                listaP = arv.sugestaoProduto(BuscaUsuario.getText());
                SugestaoBusca.removeAllItems();
                for (i = 0; i < listaP.size(); i++) {
                    SugestaoBusca.addItem(((Produto) listaP.get(i)).getNome());
                }
            } catch (Exception ex) {
                SugestaoBusca.removeAllItems();
            }
        } 
    }//GEN-LAST:event_BuscaUsuarioKeyPressed

    private void SugestaoBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SugestaoBuscaMouseClicked

    }//GEN-LAST:event_SugestaoBuscaMouseClicked

    private void SugestaoBuscaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SugestaoBuscaMousePressed

    }//GEN-LAST:event_SugestaoBuscaMousePressed

    private void SugestaoBuscaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SugestaoBuscaMouseReleased

    }//GEN-LAST:event_SugestaoBuscaMouseReleased

    private void BuscaUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscaUsuarioFocusGained
        SugestaoBusca.removeAllItems();
        int i;
        if (BuscaCategoriaUsuario.isSelected()) {
            List listaC = null;
            try {
                listaC = arv.sugestaoCategoria(BuscaUsuario.getText());
                SugestaoBusca.removeAllItems();
                for (i = 0; i < listaC.size(); i++) {
                    SugestaoBusca.addItem(((Categoria) listaC.get(i)).getNome());
                }
            } catch (Exception ex) {
                SugestaoBusca.removeAllItems();
            }

        } else if (BuscaProdutoUsuario.isSelected()) {
            List listaP = new ArrayList();
            try {
                listaP = arv.sugestaoProduto(BuscaUsuario.getText());
                SugestaoBusca.removeAllItems();
                for (i = 0; i < listaP.size(); i++) {
                    SugestaoBusca.addItem(((Produto) listaP.get(i)).getNome());
                }
            } catch (Exception ex) {
                SugestaoBusca.removeAllItems();
            }
        } 
        
    }//GEN-LAST:event_BuscaUsuarioFocusGained

    private void OrganizarPrecoMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizarPrecoMenosActionPerformed
    //organizar lista de preço por ordem decrescente
        DefaultListModel model = new DefaultListModel();    
    for(int i=listapreco.size()-1; i>-1; i--){
        model.addElement(((Produto) listapreco.get(i)).getNome()+" - R$"+ ((Produto) listapreco.get(i)).getPreco());
    }
    ListaResultados.setModel(model);   
    }//GEN-LAST:event_OrganizarPrecoMenosActionPerformed

    private void RelatorioPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioPorActionPerformed
        //gerar relatorio
        System.out.println(RelatorioPor.getSelectedIndex());
        if(RelatorioPor.getSelectedIndex() == 0){
            if (BuscaProdutoUsuario.isSelected()) {
            List listaP = new ArrayList();
                try {
                    listaP = arv.sugestaoProduto(BuscaUsuario.getText());
                } catch (BuscaInsucesso ex) {
                    Logger.getLogger(trabalhoed22017.class.getName()).log(Level.SEVERE, null, ex);
                }

            String nome = "produto";
            GravarArquivo gravarArq = new GravarArquivo();
                try {
                    gravarArq.gravarArquivoProduto(listaP,  nome);
                } catch (IOException ex) {
                    Logger.getLogger(trabalhoed22017.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
        }else if(RelatorioPor.getSelectedIndex() == 1){
            if (BuscaCategoriaUsuario.isSelected()) {
                List listaC = null;
                try {
                    listaC = arv.sugestaoCategoria(BuscaUsuario.getText());
                } catch (BuscaInsucesso ex) {
                    Logger.getLogger(trabalhoed22017.class.getName()).log(Level.SEVERE, null, ex);
                }
                String nome = "categoria";
                GravarArquivo gravarArq = new GravarArquivo();
                try {
                    gravarArq.gravarArquivoCat(listaC,  nome);
                } catch (IOException ex) {
                    Logger.getLogger(trabalhoed22017.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
        }else if(RelatorioPor.getSelectedIndex() == 2){
                String nome = "preco";
                GravarArquivo gravarArq = new GravarArquivo();
                try {
                    gravarArq.gravarArquivoPreco(listapreco,  nome);
                } catch (IOException ex) {
                    Logger.getLogger(trabalhoed22017.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_RelatorioPorActionPerformed

    private void NomeInseridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeInseridoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeInseridoActionPerformed

    public static void main(String args[]) {

        Boolean salva = true; //mudar quando for rodar
        if (salva) {
            arv = new ArvoreTrie();
            leInstancia l = new leInstancia("dataset - lista de produtos.txt", arv);
            BackupTrie backup = new BackupTrie();
            backup.salvarEstado(arv);
            arv.printCategorias();
        } else { 
            BackupTrie backup = new BackupTrie();
            arv = backup.lerEstado();
            arv.printCategorias();
        }
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(trabalhoed22017.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trabalhoed22017.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trabalhoed22017.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trabalhoed22017.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trabalhoed22017().setVisible(true);
            }
        });

    }//declaracao de variaveis globais
    public static ArvoreTrie arv;
    public static List listapreco;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BFecharJanela;
    private javax.swing.JButton BInserirProduto;
    private javax.swing.JRadioButton BuscaCategoriaUsuario;
    private javax.swing.JRadioButton BuscaProdutoUsuario;
    private javax.swing.JTextField BuscaUsuario;
    private javax.swing.JTextField CategoriaInserida;
    private javax.swing.JTextField DescricaoInserida;
    private javax.swing.JList<String> ListaResultados;
    private javax.swing.JTextField NomeInserido;
    private javax.swing.JButton OrganizarPrecoMais;
    private javax.swing.JButton OrganizarPrecoMenos;
    private javax.swing.JTextField PrecoInserido;
    private javax.swing.JComboBox<String> RelatorioPor;
    private javax.swing.JTextField SenhaDigitada;
    private javax.swing.JComboBox<String> SugestaoBusca;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
